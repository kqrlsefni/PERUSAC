/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class EmpleadoConsultas {
    
    Conexion conectar = new Conexion();
    //Crear una variables de tipo Connection y para las conusltas SQL y almacenamiento de datos
    Connection conexion = null;
    PreparedStatement ps;
    ResultSet rs;
    
    //Creamos el método Listar
    public List listar(){
    //Creamos una variable datos de tipo List del objeto Persona
        List<Empleado>datos = new ArrayList<>();
        String sql = "select * from empleado";
            try {
                //Hacer referencia a nuestra conexión
                conexion = conectar.getConnection();
                ps = conexion.prepareStatement(sql);
                rs = ps.executeQuery();
                //Aplicamos el método next para leer todos los datos del rs
                while (rs.next()){
                    //Instanciamos el objeto persona
                    Empleado e = new Empleado();
                    e.setEmpCodigo(rs.getInt(1));
                    e.setEmpNombre(rs.getString(2));
                    e.setEmpApellidoMat(rs.getString(3));
                    e.setEmpApellidoPat(rs.getString(4));
                    e.setEmpGen(rs.getString(5));
                    e.setEmpArea(rs.getString(6));
                    e.setEmpModContrat(rs.getString(7));
                    e.setEmpJornadaLab(rs.getInt(8));
                    e.setEmpFechaNac(rs.getString(9));
                    e.setEmpFechaIngreso(rs.getString(10));
                    e.setEmpEstado(rs.getString(11));
                    
                    
                    //Agregamos a la variable 
                    datos.add(e);
                }
            } catch (Exception e) {
                System.err.println("Error, "+e);
            }
            //Este método va a retornar los datos del objeto
            return datos;
    }
    public int agregar(Persona p){
        String sql="insert into persona (clave,nombres,apellidos,domicilio,celular,email,fecnac,genero) values(?,?,?,?,?,?,?,?)";
        try {
             conexion = conectar.getConnection();
             ps = conexion.prepareStatement(sql);
             ps.setInt(1, p.getClave());
             ps.setString(2, p.getNombres());
             ps.setString(3, p.getApellidos());
             ps.setString(4, p.getDomicilio());
             ps.setString(5, p.getCelular());
             ps.setString(6, p.getEmail());
             ps.setDate(7, p.getFecnac());
             ps.setString(8, p.getGenero());
             //llamamos el método para ejecutar la consulta SQl insert
             ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        return 1;
    }
    //Creamos el método actualizar con el parámetro al objeto persona
    public int actualizar(Persona p){
        int r=0;
        //Crear la variable tipo String para la consulta SQL
        String sql="update persona set nombres=?, apellidos=?, domicilio=?, celular=?, email=?, fecnac=?, genero=? where clave=?";
        try {
            //Hacer referencia a nuestra conexión
            conexion = conectar.getConnection();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getApellidos());
            ps.setString(3, p.getDomicilio());
            ps.setString(4, p.getCelular());
            ps.setString(5, p.getEmail());
            ps.setDate(6, p.getFecnac());
            ps.setString(7, p.getGenero());
            ps.setInt(8, p.getClave());
            //llamamos el método para ejecutar la consulta SQl insert
            r=ps.executeUpdate();
            if (r==1){
                return 1;
            }else{
                return 0;
            }
            } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from persona where idPersona="+id;
        try {
            conexion = conectar.getConnection();
            ps = conexion.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
    }
    
}
