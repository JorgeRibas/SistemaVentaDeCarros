package Datos;

import Modelo.Carro;
import Modelo.Marca;
import Modelo.TipoCarro2;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatosCarro extends Conexion{
    
    public void registrar(Carro car) throws Exception{
        
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("INSERT INTO carro (carro_tipoCarro, carro_modelo,"
                    + "carro_anno, carro_marca, carro_precioBase, carro_color, carro_vin, carro_estado)"
                    + "values (?,?,?,?,?,?,?,?,)");
            st.setInt   (1, car.getIdtipoCarro());
            st.setString(2, car.getModelo());
            st.setInt   (3, car.getAnno());
            st.setObject(4, car.getMarca());
            st.setFloat (5, car.getPrecioBase());
            st.setString(6, car.getColor());
            st.setString(7, car.getVin());
            st.setString(8, car.getModelo());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public Carro leerID(Carro car) throws Exception{
        
        Carro carro = null;
        ResultSet rs;
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM carro WHERE carro_id = ?");
            st.setInt(1, car.getIdCarro());
            rs = st.executeQuery();
            
            while (rs.next()) {
                carro = new Carro();
                car.setIdCarro(rs.getInt("carro_id"));
                car.setIdtipoCarro(rs.getInt("carro_tipoCarro"));
                //car.setidTipoCarro(rs.getObject("carro_tipoCarro", TipoCarro2))
                car.setModelo(rs.getString("carro_modelo"));
                car.setAnno(rs.getInt("carro_anno"));
                car.setMarca(Marca.PORSCHE);
                //car.setMarca(rs.getObject("carro_marca", car.getMarca());
                car.setPrecioBase(rs.getFloat("carro_precioBase"));
                car.setColor(rs.getString("carro_color"));
                car.setVin(rs.getString("carro_vin"));
                car.setEstadoCarro(rs.getBoolean("carro_estado"));
            }
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        
        return carro;
    }
    
    public List<Carro> listar() throws Exception{
    
        List<Carro> lista;
        ResultSet rs;
        
        try{
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM carro");
            rs = st.executeQuery();
            lista = new ArrayList();
            
            while(rs.next()){
                Carro car = new Carro();
                car.setIdCarro(rs.getInt("carro_id"));
                car.setIdtipoCarro(rs.getInt("carro_tipoCarro"));
                //car.setidTipoCarro(rs.getObject("carro_tipoCarro", TipoCarro2))
                car.setModelo(rs.getString("carro_modelo"));
                car.setAnno(rs.getInt("carro_anno"));
                car.setMarca(Marca.PORSCHE);
                //car.setMarca(rs.getObject("carro_marca", car.getMarca());
                car.setPrecioBase(rs.getFloat("carro_precioBase"));
                car.setColor(rs.getString("carro_color"));
                car.setVin(rs.getString("carro_vin"));
                car.setEstadoCarro(rs.getBoolean("carro_estado"));
                
                lista.add(car);
            }
        }catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return null;
    }

    public void modificar(Carro car) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("UPDATE carro SET carro_tipoCarro = ?, carro_modelo = ?, carro_anno = ?, carro_marca = ?, carro_precioBase = ?, "
                            + "carro_color = ?, carro_vin = ?, carro_estado = ?");
            st.setInt   (1, car.getIdtipoCarro());
            st.setString(2, car.getModelo());
            st.setInt   (3, car.getAnno());
            st.setObject(4, car.getMarca());
            st.setFloat (5, car.getPrecioBase());
            st.setString(6, car.getColor());
            st.setString(7, car.getVin());
            st.setString(8, car.getModelo());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public void eliminarID(Carro car) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("DELETE FROM carro WHERE carro_id = ?");
            st.setInt(1, car.getIdCarro());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
}
