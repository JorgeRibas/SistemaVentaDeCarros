package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/siscqp?user=root&password=root");
    }
    
    public void cerrarCnx() throws SQLException{
        if (cn != null){
            if (cn.isClosed() == false){
                cn.close();
            }
        } 
    }
    
}

