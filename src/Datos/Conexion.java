package Datos;

import java.sql.*;

public class Conexion {
    
    private Connection cn;
    
    public Connection getCnx(){
        return cn;
    }
    
    public void setCnx(Connection cn){
        this.cn = cn;
    }
    
    public void abrirCnx() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String ip = "jdbc:mysql://"
                + "localhost:3306/ventacarrosdb"
                + "?useSSL=false";
        String user = "root";
        String pass = "root";
        
        cn = DriverManager.getConnection(ip,user,pass);
    }
    
    public void cerrarCnx() throws SQLException{
        if (cn != null){
            if (cn.isClosed() == false){
                cn.close();
            }
        } 
    }
    
}

