package Datos;

import Modelo.CarroPorTienda;
import Modelo.Tienda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatosCarroPorTienda extends Conexion {

    public void registrar(CarroPorTienda car) throws Exception {
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("INSERT INTO carroportienda (carroTienda_idCarro, "
                    + "carroTienda_idTienda)"
                    + "values (?,?)");
            st.setInt(1, car.getIdTienda());
            st.setInt(2, car.getIdCarro());

            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }

    public CarroPorTienda leerID(CarroPorTienda car) throws Exception {

        CarroPorTienda carroT = null;
        ResultSet rs;
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM carroportienda WHERE carroTienda_idTienda = ?");
            st.setInt(1, car.getIdCarro());
            rs = st.executeQuery();

            while (rs.next()) {
                carroT = new CarroPorTienda();
                carroT.setIdTienda(rs.getInt("carroTienda_idTienda"));
                carroT.setIdCarro(rs.getInt("carroTienda_idCarro"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }

        return carroT;
    }

    public List<CarroPorTienda> listar() throws Exception {

        List<CarroPorTienda> lista;
        ResultSet rs;

        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM carroportienda");
            rs = st.executeQuery();
            lista = new ArrayList();

            while (rs.next()) {
                CarroPorTienda carT = new CarroPorTienda();
                carT.setIdTienda(rs.getInt("carroTienda_idTienda"));
                carT.setIdCarro(rs.getInt("carroTienda_idCarro"));

                lista.add(carT);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return null;
    }

    public List<Tienda> listarTiendas() throws Exception {

        List<Tienda> lista;
        ResultSet rs;

        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT DISTINCT tienda_nombre\n"
                                                                + "FROM tienda, carroportienda\n"
                                                                + "WHERE tienda_id = carroTienda_idTienda\n"
                                                                + "ORDER BY 1");
            rs = st.executeQuery();
            lista = new ArrayList();

            while (rs.next()) {
                Tienda tienda = new Tienda();
                tienda.setNombreTienda(rs.getString("tienda_nombre"));

                lista.add(tienda);
                System.out.println(lista);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return null;
    }

    public void modificar(CarroPorTienda carT) throws Exception {
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("UPDATE carroportienda SET carroTienda_idTienda = ?, carroTienda_idCarro = ?");
            st.setInt(1, carT.getIdTienda());
            st.setInt(2, carT.getIdCarro());

            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }

    public void eliminarID(CarroPorTienda carT) throws Exception {
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("DELETE FROM carroportienda WHERE carroTienda_idTienda = ?");
            st.setInt(1, carT.getIdCarro());

            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
}
