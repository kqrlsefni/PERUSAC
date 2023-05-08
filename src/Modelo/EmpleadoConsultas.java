/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.util.Date;
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
                    e.setEmpModContrato(rs.getString(8));
                    e.setEmpJornadaLab(rs.getString(9));
                    e.setEmpFechaNac(rs.getDate(10));
                    e.setEmpFoto(rs.getString(11));
                    e.setEmpSalario(rs.getFloat(12));
                    e.setEmpFechaIngreso(rs.getDate(13));
                    e.setEmpEstado(rs.getInt(14));
                    
                    
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
                + "EmpSalario,EmpFechaIngreso,EmpEstado) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        String sqlSalario = "insert into salariobitacora (SalEmpleado,SalSalario) values(?,?)";
        String sqlJornada= "insert into jornada_laboral_bitacora (JorEmpleado,JorJornada) values(?,?)";
        String sqlArea = "insert into areabitacora (AreEmpleado,AreArea) values(?,?)";
        String sqlModalidad = "insert into modalidad_contrato_bitacora (ModEmpleado,ModModalida,ModFecInicio,ModFecFin) values(?,?,?,?)";
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
             ps.setDate(9, new java.sql.Date(p.getEmpFechaNac().getTime()));
             //ps.setString(10, p.getEmpFoto());
             ps.setDouble(10, p.getEmpSalario());
             ps.setDate(11, new java.sql.Date(p.getEmpFechaIngreso().getTime()));
             ps.setInt(12, p.getEmpEstado());
             //llamamos el método para ejecutar la consulta SQl insert
             ps.executeUpdate();
             rs = ps.executeQuery();
             
             ps = conexion.prepareStatement(sqlSalario);
             ps.setInt(1, rs.getInt(1));
             ps.setDouble(2, p.getEmpSalario());
             
             ps = conexion.prepareStatement(sqlJornada);
             ps.setInt(1, rs.getInt(1));
             ps.setString(2, p.getEmpJornadaLab());
             
             ps = conexion.prepareStatement(sqlArea);
             ps.setInt(1, rs.getInt(1));
             ps.setString(2, p.getEmpArea());
             
             ps = conexion.prepareStatement(sqlModalidad);
             ps.setInt(1, rs.getInt(1));
             ps.setString(2, p.getEmpModContrato());
             ps.setDate(3, new java.sql.Date(p.getFechaInicio().getTime()));
             ps.setDate(4, new java.sql.Date(p.getFechaFin().getTime()));
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        return 1;
    }
    //Creamos el método actualizar con el parámetro al objeto persona
    public int actualizar(Empleado p){
        int r=0;
        //Crear la variable tipo String para la consulta SQL
        String sql="update empleado set EmpDni=?,EmpNombres=?,EmpApellidoPaterno=?,EmpApellidoMaterno=?,EmpGenero=?,EmpArea=?,EmpModalidadContrato=?,EmpJornadaLaboral=?,"
                + "EmpFecNacimiento=?, EmpSalario=?, EmpFechaIngreso=? where EmpCodigo=?";
        try {
            //Hacer referencia a nuestra conexión
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
            ps.setDate(9, new java.sql.Date(p.getEmpFechaNac().getTime()));
            //ps.setString(10, p.getEmpFoto());
            ps.setDouble(10, p.getEmpSalario());
            ps.setDate(11, new java.sql.Date(p.getEmpFechaIngreso().getTime()));
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
    public int delete(int id){
        int r = 0;
        //String sql="delete from persona where idEmpleado="+id;
        String sql="update empleado set EmpEstado = 2 where EmpCodigo=?";
        try {
            conexion = conectar.getConnection();
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            r=ps.executeUpdate();
            if(r==1){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        return r;
    }
    
    public Empleado buscar(int id){
        Empleado emp = new Empleado();
        String sql = "select * from empleado e inner join modalidad_contrato_bitacora m on m.ModEmpleado = e.EmpCodigo where EmpCodigo = ? and EmpEstado = 1 order by m.ModId desc";
            try {
                
                conexion = conectar.getConnection();
                ps = conexion.prepareStatement(sql);
                ps.setString(1,String.valueOf(id));
                rs = ps.executeQuery();
                
                while (rs.next()){
                    emp.setEmpCodigo(rs.getInt(1));
                    emp.setEmpDni(rs.getString(2));
                    emp.setEmpNombre(rs.getString(3));
                    emp.setEmpApellidoMat(rs.getString(4));
                    emp.setEmpApellidoPat(rs.getString(5));
                    emp.setEmpGen(rs.getString(6));
                    emp.setEmpArea(rs.getString(7));
                    emp.setEmpModContrato(rs.getString(8));
                    emp.setEmpJornadaLab(rs.getString(9));
                    emp.setEmpFechaNac(rs.getDate(10));
                    emp.setEmpFoto(rs.getString(11));
                    emp.setEmpSalario(rs.getFloat(12));
                    emp.setEmpFechaIngreso(rs.getDate(13));
                    emp.setEmpEstado(rs.getInt(14));
                }
            } catch (Exception e) {
                System.err.println("Error, "+e);
            }
            return emp;
    }
    
}
