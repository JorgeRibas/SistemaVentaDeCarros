package Datos;

import Modelo.Idioma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DatosIdioma extends Conexion{
    
    public void registrar(Idioma idioma) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("INSERT INTO idioma (idioma_id, " 
                    + "idioma_idioma)"
                    + "values (?,?)");
            st.setInt   (1, idioma.getIdIdioma());
            st.setString(2, idioma.getIdioma());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public Idioma leerID(Idioma idioma) throws Exception{
        
        Idioma languaje = null;
        ResultSet rs;
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM idioma WHERE idioma_id = ?");
            st.setInt(1, idioma.getIdIdioma());
            rs = st.executeQuery();
            
            while (rs.next()) {
                languaje = new Idioma();
                languaje.setIdIdioma(rs.getInt("idioma_id"));
                languaje.setIdioma(rs.getString("idioma_idioma"));
            }
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        
        return languaje;
    }
    
    public Vector<Idioma> listar() throws Exception{
    
        Vector<Idioma> lista;
        ResultSet rs;
        
        try{
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM idioma");
            rs = st.executeQuery();
            lista = new Vector<>();
            
            while(rs.next()){
                Idioma idi = new Idioma();
                idi.setIdIdioma(rs.getInt("idioma_id"));
                idi.setIdioma(rs.getString("idioma_idioma"));
                
                lista.add(idi);
            }
        }catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return lista;
    }
        
    public void modificar(Idioma idioma) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("UPDATE idioma SET idioma_id = ?, idioma_id = ?");
            st.setInt   (1, idioma.getIdIdioma());
            st.setString(2, idioma.getIdioma());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public void eliminarID(Idioma idioma) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("DELETE FROM idioma WHERE idioma_id = ?");
            st.setInt(1, idioma.getIdIdioma());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
}
