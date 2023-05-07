
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
     public static final String url ="jdbc:mysql://127.0.0.1:4406/bdperusac?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña ="12345";
    
    Connection conexion=null;
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        return conexion;
    }
}
