package Datos;

import Modelo.Compra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatosCompra extends Conexion{
    
    public void registrar(Compra comp) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("INSERT INTO compra (compra_id, compra_idUsuario, compra_idTienda,"
                    + "compra_idCarro, compra_detalle, compra_nombreCliente, compra_correoCliente, compra_telefonoCliente, compra_cedulaCliente)"
                    + "values (?,?,?,?,?,?,?,?,?)");
            st.setInt   (1, comp.getIdCompra());
            st.setInt   (2, comp.getIdUsuario());
            st.setInt   (3, comp.getIdTienda());
            st.setInt   (4, comp.getIdCarro());
            st.setString(5, comp.getDetalleCompra());
            st.setString(6, comp.getNombreCliente());
            st.setString(7, comp.getCorreoCliente());
            st.setInt   (8, comp.getTelefonoCliente());
            st.setInt   (9, comp.getCedulaCliente());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public Compra leerID(Compra comp) throws Exception{
        
        Compra compra = null;
        ResultSet rs;
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM compra WHERE compra_id = ?");
            st.setInt(1, comp.getIdCompra());
            rs = st.executeQuery();
            
            while (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(rs.getInt("compra_id"));
                compra.setIdUsuario(rs.getInt("compra_idUsuario"));
                compra.setIdTienda(rs.getInt("compra_idTienda"));
                compra.setIdCarro(rs.getInt("compra_idCarro"));
                compra.setDetalleCompra(rs.getString("compra_detalle"));
                compra.setNombreCliente(rs.getString("compra_nombreCliente"));
                compra.setCorreoCliente(rs.getString("compra_correoCliente"));
                compra.setTelefonoCliente(rs.getInt("compra_telefonoCliente"));
                compra.setCedulaCliente(rs.getInt("compra_cedulaCliente"));
            }
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        
        return compra;
    }
    
    public List<Compra> listar() throws Exception{
    
        List<Compra> lista;
        ResultSet rs;
        
        try{
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM compra");
            rs = st.executeQuery();
            lista = new ArrayList();
            
            while(rs.next()){
                Compra comp = new Compra();
                comp.setIdCompra(rs.getInt("compra_id"));
                comp.setIdUsuario(rs.getInt("compra_idUsuario"));
                comp.setIdTienda(rs.getInt("compra_idTienda"));
                comp.setIdCarro(rs.getInt("compra_idCarro"));
                comp.setDetalleCompra(rs.getString("compra_detalle"));
                comp.setNombreCliente(rs.getString("compra_nombreCliente"));
                comp.setCorreoCliente(rs.getString("compra_correoCliente"));
                comp.setTelefonoCliente(rs.getInt("compra_telefonoCliente"));
                comp.setCedulaCliente(rs.getInt("compra_cedulaCliente"));
                
                lista.add(comp);
            }
        }catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return null;
    }

    public void modificomp(Compra comp) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("UPDATE compra SET compra_id = ?, compra_idUsuario = ?, compra_idTienda = ?, compra_idCarro = ?,"
                    + "compra_detalle = ?, compra_nombreCliente = ?, compra_correoCliente = ?, compra_telefonoCliente = ?, compra_cedulaCliente = ?");
            
            st.setInt   (1, comp.getIdCompra());
            st.setInt   (2, comp.getIdUsuario());
            st.setInt   (3, comp.getIdTienda());
            st.setInt   (4, comp.getIdCarro());
            st.setString(5, comp.getDetalleCompra());
            st.setString(6, comp.getNombreCliente());
            st.setString(7, comp.getCorreoCliente());
            st.setInt   (8, comp.getTelefonoCliente());
            st.setInt   (9, comp.getCedulaCliente());
                    
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public void eliminarID(Compra comp) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("DELETE FROM compra WHERE compra_id = ?");
            st.setInt(1, comp.getIdCompra());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
}
