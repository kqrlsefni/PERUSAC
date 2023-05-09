
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
     Connection miCon;
    
    String controlador = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/bdperusac";
    String user = "root";
    String pass = "12345";
    
    public Connection getConnection(){
        try {
            Class.forName(controlador);
            miCon = DriverManager.getConnection(url,user,pass);
            
            if(miCon!=null){
                System.out.println("CONEXION EXITOSA");
            }
            
        } catch (Exception e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return miCon;
    }
}
