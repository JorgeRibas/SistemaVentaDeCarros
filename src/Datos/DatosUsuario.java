package Datos;

import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatosUsuario extends Conexion{
    
    public void registrar(Usuario usuario) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("INSERT INTO usuario (usuario_id, usuario_idTienda,"
                    + "usuario_rol, usuario_login, usuario_contrasena, usuario_nombre, usuario_apellido,"
                    + "usuario_cedula, usuario_preg1, usuario_preg2)"
                    + "values (?,?,?,?,?,?,?,?,?,?)");
            st.setInt       (1,  usuario.getIdUsuario());
            st.setInt       (2,  usuario.getIdTienda());
            st.setString    (3,  usuario.getRol());
            st.setString    (4,  usuario.getNombreLogin());
            st.setString    (5,  usuario.getContrasena());
            st.setString    (6,  usuario.getNombre());
            st.setString    (7,  usuario.getApellido());
            st.setString    (8,  usuario.getCedula());
            st.setString    (9,  usuario.getPreg1());
            st.setString    (10, usuario.getPreg2());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public Usuario leerID(Usuario user) throws Exception{
        
        Usuario usuario = null;
        ResultSet rs;
        try {
            this.abrirCnx();
//            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM usuario WHERE usuario_id = ?");
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM usuario WHERE usuario_login = ?");
            st.setString(1, user.getNombreLogin());
            rs = st.executeQuery();
            
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt      ("usuario_id"));
                usuario.setIdTienda(rs.getInt       ("usuario_idTienda"));
                usuario.setRol(rs.getString         ("usuario_rol"));
                usuario.setNombreLogin(rs.getString ("usuario_login"));
                usuario.setContrasena(rs.getString  ("usuario_contrasena"));
                usuario.setNombre(rs.getString      ("usuario_nombre"));
                usuario.setApellido(rs.getString    ("usuario_apellido"));
                usuario.setCedula(rs.getString      ("usuario_cedula"));
                usuario.setPreg1(rs.getString       ("usuario_preg1"));
                usuario.setPreg2(rs.getString       ("usuario_preg2"));
            }
                
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        
        return usuario;
    }
    
    public List<Usuario> listar() throws Exception{
    
        List<Usuario> lista;
        ResultSet rs;
        
        try{
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("SELECT * FROM usuario");
            rs = st.executeQuery();
            lista = new ArrayList();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt      ("usuario_id"));
                usuario.setIdTienda(rs.getInt       ("usuario_idTienda"));
                usuario.setRol(rs.getString         ("usuario_rol"));
                usuario.setNombreLogin(rs.getString ("usuario_login"));
                usuario.setContrasena(rs.getString  ("usuario_contrasena"));
                usuario.setNombre(rs.getString      ("usuario_nombre"));
                usuario.setApellido(rs.getString    ("usuario_apellido"));
                usuario.setCedula(rs.getString      ("usuario_cedula"));
                usuario.setPreg1(rs.getString       ("usuario_preg1"));
                usuario.setPreg2(rs.getString       ("usuario_preg2"));
                
                lista.add(usuario);
            }
        }catch (Exception e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
        return lista;
    }

    public void modificar(Usuario usuario, int id, String login) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("UPDATE usuario SET usuario_idTienda = ?, usuario_rol = ?,"
                    + " usuario_contrasena = ?, usuario_nombre = ?, usuario_apellido = ?,"
                    + " usuario_cedula = ?, usuario_preg1 = ?, usuario_preg2 = ?"
                    + "WHERE usuario_id = "+id+" ");
                       
//            st.setInt       (1,  usuario.getIdUsuario());
            st.setInt       (1,  usuario.getIdTienda());
            st.setString    (2,  usuario.getRol());
//            st.setString    (4,  usuario.getNombreLogin());
            st.setString    (3,  usuario.getContrasena());
            st.setString    (4,  usuario.getNombre());
            st.setString    (5,  usuario.getApellido());
            st.setString    (6,  usuario.getCedula());
            st.setString    (7,  usuario.getPreg1());
            st.setString    (8,  usuario.getPreg2());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
    public void eliminarID(Usuario usuario) throws Exception{
        try {
            this.abrirCnx();
            PreparedStatement st = this.getCnx().prepareStatement("DELETE FROM usuario WHERE usuario_id = ?");
            st.setInt(1, usuario.getIdUsuario());
            
            st.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrarCnx();
        }
    }
    
}