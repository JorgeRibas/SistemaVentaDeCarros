package Datos;

import Modelo.Tienda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DatosTienda extends Conexion {

    public void registrar(Tienda tienda) throws Exception {
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("INSERT INTO tienda (tienda_id, tienda_nombre,"
                    + "tienda_direccion, tienda_provincia, tienda_espaciosDisponibles, tienda_espaciosOcupados)"
                    + "values (?,?,?,?,?,?)");
            st.setInt(1, tienda.getIdTienda());
            st.setString(2, tienda.getNombreTienda());
            st.setString(3, tienda.getDireccion());
            st.setString(4, tienda.getProvincia());
            st.setInt(5, tienda.getEspaciosDisponibles());
            st.setInt(6, tienda.getEspaciosOcupados());

            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }

    public Tienda leerID(Tienda tnda) throws Exception {

        Tienda tienda = null;
        ResultSet rs;
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM tienda WHERE tienda_id = ?");
            st.setInt(1, tnda.getIdTienda());
            rs = st.executeQuery();

            while (rs.next()) {
                tienda = new Tienda();
                tienda.setIdTienda(rs.getInt("tienda_id"));
                tienda.setNombreTienda(rs.getString("tienda_nombre"));
                tienda.setDireccion(rs.getString("tienda_direccion"));
                tienda.setProvincia(rs.getString("tienda_provincia"));
                tienda.setEspaciosDisponibles(rs.getInt("tienda_espaciosDisponibles"));
                tienda.setEspaciosOcupados(rs.getInt("tienda_espaciosOcupados"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }

        return tienda;
    }

    public List<Tienda> listar() throws Exception {

        List<Tienda> lista;
        ResultSet rs;

        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM tienda");
            rs = st.executeQuery();
            lista = new ArrayList();

            while (rs.next()) {
                Tienda tienda = new Tienda();
                tienda.setIdTienda(rs.getInt("tienda_id"));
                tienda.setNombreTienda(rs.getString("tienda_nombre"));
                tienda.setDireccion(rs.getString("tienda_direccion"));
                tienda.setProvincia(rs.getString("tienda_provincia"));
                tienda.setEspaciosDisponibles(rs.getInt("tienda_espaciosDisponibles"));
                tienda.setEspaciosOcupados(rs.getInt("tienda_espaciosOcupados"));

                lista.add(tienda);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return lista;
    }

    public Vector<Tienda> listarVector() throws Exception {

        Vector<Tienda> lista;
        ResultSet rs;

        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM tienda");
            rs = st.executeQuery();
            lista = new Vector<>();
            
            while (rs.next()) {
                Tienda tienda = new Tienda();
                tienda.setIdTienda(rs.getInt("tienda_id"));
                tienda.setNombreTienda(rs.getString("tienda_nombre"));
                tienda.setDireccion(rs.getString("tienda_direccion"));
                tienda.setProvincia(rs.getString("tienda_provincia"));
                tienda.setEspaciosDisponibles(rs.getInt("tienda_espaciosDisponibles"));
                tienda.setEspaciosOcupados(rs.getInt("tienda_espaciosOcupados"));

                lista.add(tienda);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return lista;
    }

    public void modificar(Tienda tienda) throws Exception {
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("UPDATE tienda SET tienda_id = ?, tienda_nombre = ?, tienda_direccion = ?,"
                    + "tienda_provincia = ?, tienda_espaciosDisponibles = ?, tienda_espaciosOcupados = ?");
            st.setInt(1, tienda.getIdTienda());
            st.setString(2, tienda.getNombreTienda());
            st.setString(3, tienda.getDireccion());
            st.setString(4, tienda.getProvincia());
            st.setInt(5, tienda.getEspaciosDisponibles());
            st.setInt(6, tienda.getEspaciosOcupados());

            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }

    public void eliminarID(Tienda tienda) throws Exception {
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("DELETE FROM tienda WHERE tienda_id = ?");
            st.setInt(1, tienda.getIdTienda());

            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }

}
