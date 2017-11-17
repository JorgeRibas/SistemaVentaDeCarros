package Datos;

import Modelo.Carro;
import Modelo.Marca;
import Modelo.TipoCarro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatosCarro extends Conexion{
    
    public void registrar(Carro car) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("INSERT INTO carro (carro_idInfoCarro, carro_tipo, carro_modelo,"
                    + "carro_anno, carro_marca, carro_precioBase, carro_color, carro_vin, carro_estado)"
                    + "values (?,?,?,?,?,?,?,?,?)");
            st.setInt   (1, car.getIdInfoCarro());
            st.setString(2, car.getTipoCarro());
            st.setString(3, car.getModelo());
            st.setInt   (4, car.getAnno());
            st.setString(5, car.getMarca());
            st.setFloat (6, car.getPrecioBase());
            st.setString(7, car.getColor());
            st.setString(8, car.getVin());
            st.setString(9, car.getModelo());
            
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
                carro.setIdCarro(rs.getInt("carro_id"));
                carro.setIdInfoCarro(rs.getInt("carro_idInfoCarro"));
                carro.setTipoCarro((TipoCarro) rs.getObject("carro_tipo"));
                carro.setModelo(rs.getString("carro_modelo"));
                carro.setAnno(rs.getInt("carro_anno"));
                carro.setMarca((Marca) rs.getObject("carro_marca"));
                carro.setPrecioBase(rs.getFloat("carro_precioBase"));
                carro.setColor(rs.getString("carro_color"));
                carro.setVin(rs.getString("carro_vin"));
                carro.setEstado(rs.getString("carro_estado"));
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
                car.setIdInfoCarro(rs.getInt("carro_idInfoCarro"));
                car.setTipoCarro((TipoCarro) rs.getObject("carro_tipo"));
                car.setModelo(rs.getString("carro_modelo"));
                car.setAnno(rs.getInt("carro_anno"));
                car.setMarca((Marca) rs.getObject("carro_marca"));
                car.setPrecioBase(rs.getFloat("carro_precioBase"));
                car.setColor(rs.getString("carro_color"));
                car.setVin(rs.getString("carro_vin"));
                car.setEstado(rs.getString("carro_estado"));
                
                lista.add(car);
            }
        }catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return lista;
    }

    public void modificar(Carro car) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("UPDATE carro SET carro_idInfoCarro = ?, carro_tipo = ?, carro_modelo = ?, carro_anno = ?, carro_marca = ?, carro_precioBase = ?, "
                            + "carro_color = ?, carro_vin = ?, carro_estado = ?");
            st.setInt   (1, car.getIdInfoCarro());
            st.setString(2, car.getTipoCarro());
            st.setString(3, car.getModelo());
            st.setInt   (4, car.getAnno());
            st.setString(5, car.getMarca());
            st.setFloat (6, car.getPrecioBase());
            st.setString(7, car.getColor());
            st.setString(8, car.getVin());
            st.setString(9, car.getEstado());
            
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
