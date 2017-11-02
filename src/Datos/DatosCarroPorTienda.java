package Datos;

import Modelo.CarroPorTienda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatosCarroPorTienda extends Conexion{
    
    public void registrar(CarroPorTienda car) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("INSERT INTO carroportienda (carroTienda_id, " 
                    + "carroTienda_idCarro, carroTienda_idTienda)"
                    + "values (?,?)");
            st.setInt (1, car.getIdCxT());
            st.setInt (2, car.getIdCarro());
            st.setInt (3, car.getIdTienda());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public CarroPorTienda leerID(CarroPorTienda car) throws Exception{
        
        CarroPorTienda carroT = null;
        ResultSet rs;
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM carroportienda WHERE carroTienda_id = ?");
            st.setInt(1, car.getIdCarro());
            rs = st.executeQuery();
            
            while (rs.next()) {
                carroT = new CarroPorTienda();
                carroT.setIdCxT(rs.getInt("carroTienda_id"));
                carroT.setIdCarro(rs.getInt("carroTienda_idCarro"));
                carroT.setIdTienda(rs.getInt("carroTienda_idTienda"));
            }
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        
        return carroT;
    }
    
    public List<CarroPorTienda> listar() throws Exception{
    
        List<CarroPorTienda> lista;
        ResultSet rs;
        
        try{
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM carroportienda");
            rs = st.executeQuery();
            lista = new ArrayList();
            
            while(rs.next()){
                CarroPorTienda carT = new CarroPorTienda();
                carT.setIdCxT(rs.getInt("carroTienda_id"));
                carT.setIdCarro(rs.getInt("carroTienda_idCarro"));
                carT.setIdTienda(rs.getInt("carroTienda_idTienda"));
                
                
                lista.add(carT);
            }
        }catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return null;
    }

    public void modificar(CarroPorTienda carT) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("UPDATE carroportienda SET carroTienda_id = ?, carroTienda_idCarro = ?, carroTienda_idTienda = ?");
            st.setInt (1, carT.getIdCxT());
            st.setInt (2, carT.getIdCarro());
            st.setInt (3, carT.getIdTienda());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public void eliminarID(CarroPorTienda carT) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("DELETE FROM carroportienda WHERE carroTienda_id = ?");
            st.setInt(1, carT.getIdCarro());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
}
