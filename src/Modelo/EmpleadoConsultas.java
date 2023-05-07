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
    //Creamos una variable datos de tipo List del objeto Empleado
        List<Empleado>datos = new ArrayList<>();
        String sql = "select * from empleado where EmpEstado = 1";
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
                    e.setEmpDni(rs.getString(2));
                    e.setEmpNombre(rs.getString(3));
                    e.setEmpApellidoMat(rs.getString(4));
                    e.setEmpApellidoPat(rs.getString(5));
                    e.setEmpGen(rs.getString(6));
                    e.setEmpArea(rs.getString(7));
                    e.setEmpModContrato(rs.getString(7));
                    e.setEmpJornadaLab(rs.getString(8));
                    e.setEmpFechaNac(rs.getDate(9));
                    e.setEmpFoto(rs.getString(10));
                    e.setEmpSalario(rs.getFloat(11));
                    e.setEmpFechaIngreso(rs.getDate(12));
                    e.setEmpEstado(rs.getInt(13));
                    
                    
                    //Agregamos a la variable 
                    datos.add(e);
                }
            } catch (Exception e) {
                System.err.println("Error, "+e);
            }
            //Este método va a retornar los datos del objeto
            return datos;
    }
    public int agregar(Empleado p){
        String sql="insert into empleado (EmpDni,EmpNombres,EmpApellidoPaterno,EmpApellidoMaterno,EmpGenero,EmpArea,EmpModalidadContrato,EmpJornadaLaboral,EmpFecNacimiento,"
                + "EmpSalario,EmpFechaIngreso,EmpEstado) values(?,?,?,?,?,?,?,?)";
        try {
             conexion = conectar.getConnection();
             ps = conexion.prepareStatement(sql);
             ps.setString(1, p.getEmpDni());
             ps.setString(2, p.getEmpNombre());
             ps.setString(3, p.getEmpApellidoPat());
             ps.setString(4, p.getEmpApellidoMat());
             ps.setString(5, p.getEmpGen());
             ps.setString(6, p.getEmpArea());
             ps.setString(7, p.getEmpModContrato());
             ps.setString(8, p.getEmpJornadaLab());
             ps.setDate(9, p.getEmpFechaNac());
             //ps.setString(10, p.getEmpFoto());
             ps.setDouble(10, p.getEmpSalario());
             ps.setDate(11, p.getEmpFechaIngreso());
             
             //llamamos el método para ejecutar la consulta SQl insert
             ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        return 1;
    }
    //Creamos el método actualizar con el parámetro al objeto persona
    public int actualizar(Empleado p){
        int r=0;
        //Crear la variable tipo String para la consulta SQL
        String sql="update empleado set EmpDni=?,EmpNombres=?,EmpApellidoPaterno=?,EmpApellidoMaterno=?,EmpGenero=?,EmpArea=?,EmpModalidadContrato=?,EmpJornadaLaboral=?,EmpFecNacimiento=?,"
                + "EmpSalario=?,EmpFechaIngreso=? where EmpCodigo=?";
        try {
            //Hacer referencia a nuestra conexión
            conexion = conectar.getConnection();
            ps.setString(1, p.getEmpDni());
            ps.setString(2, p.getEmpNombre());
            ps.setString(3, p.getEmpApellidoPat());
            ps.setString(4, p.getEmpApellidoMat());
            ps.setString(5, p.getEmpGen());
            ps.setString(6, p.getEmpArea());
            ps.setString(7, p.getEmpModContrato());
            ps.setString(8, p.getEmpJornadaLab());
            ps.setDate(9, p.getEmpFechaNac());
            //ps.setString(10, p.getEmpFoto());
            ps.setDouble(10, p.getEmpSalario());
            ps.setDate(11, p.getEmpFechaIngreso());
            ps.setInt(12, p.getEmpCodigo());
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
        String sql="delete from persona where idEmpleado="+id;
        try {
            conexion = conectar.getConnection();
            ps = conexion.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
    }
    
}
