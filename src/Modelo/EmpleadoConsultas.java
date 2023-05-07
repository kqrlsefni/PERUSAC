/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import modelo.Conexion;

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
    public Vector listar(){
    //Creamos una variable datos de tipo List del objeto Persona
        Vector<Empleado>datos = new Vector<>();
        String sql = "select * from tb_empleado";
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
                    e.setEmpApellidoPat(rs.getString(3));
                    e.setEmpApellidoMat(rs.getString(4));
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
    
    
    public int agregar(Empleado emp){
        String sql="insert into tb_empleado (EmpNombres,EmpdApellidoPat,EmpApellidoMat,EmpDni,EmpGenero,EmpArea,EmpModalidadContrato,EmpJornadaLaboral,EmpFecNacimiento,EmpFoto,EmpSalario) values(?,?,?,?,?,?,?,?)";
        try {
             conexion = conectar.getConnection();
             ps = conexion.prepareStatement(sql);
             ps.setString(1, emp.getEmpNombre());
             ps.setString(2, emp.getEmpApellidoPat());
             ps.setString(3, emp.getEmpApellidoMat());
             ps.setString(4, emp.getEmpDni());
             ps.setString(5, emp.getEmpGen());
             ps.setString(6, emp.getEmpArea());
             ps.setString(7, emp.getEmpModContrat());
             ps.setInt(8, emp.getEmpJornadaLab());
             ps.setString(9, emp.getEmpFechaNac());
             ps.setString(10, emp.getEmpFechaNac());
             ps.setString(11, emp.getEmpFoto());
             ps.setFloat(12, emp.getEmpSalario());
             // ps.setFloat(13, emp.getEmpSa());
             //ps.setString(9, emp.getEmpEstado());
             
             ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Error, "+e);
        }
        return 1;
    }
  /*
    public int actualizar(Persona p){
        int r=0;
       
        String sql="update persona set nombres=?, apellidos=?, domicilio=?, celular=?, email=?, fecnac=?, genero=? where clave=?";
        try {
            
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
    */
}