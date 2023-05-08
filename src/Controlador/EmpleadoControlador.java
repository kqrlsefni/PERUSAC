package Controlador;

import Vista.EmpleadoView;
import Vista.Empleado_NuevoView;
import Vista.Main;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.EmpleadoConsultas;


public class EmpleadoControlador {
    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    
    EmpleadoView vista = new EmpleadoView();
    
    public EmpleadoControlador(){
        
        
    }
    
    public boolean Eliminar(int id){
        boolean delete = false;
        objEmpleado.setEmpCodigo(id);
        int res = objEmpleadoConsultas.delete(id);
        if(res==1){
            delete = true; 
        }
        return delete;
    }
}
