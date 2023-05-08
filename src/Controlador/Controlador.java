
package Controlador;

import Vista.Dashboard;
import Vista.EmpleadoView;
import Vista.Empleado_NuevoView;
import Vista.Main;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.EmpleadoConsultas;
import static Vista.Dashboard.panelContenido;
import java.text.SimpleDateFormat;

public class Controlador {
    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    Empleado_NuevoView vistaNuevo = new Empleado_NuevoView();
    public Controlador(Empleado_NuevoView vistaNuevo){
        this.vistaNuevo = vistaNuevo;   
    }

    
    public boolean Agregar(){
        boolean add = false;
        try {
            
        
        String dni = vistaNuevo.txtDni.getText();
        String nombre = vistaNuevo.txtNombre.getText();
        String apePat = vistaNuevo.txtApePat.getText();
        String apeMat = vistaNuevo.txtApeMat.getText();
        String area = vistaNuevo.txtArea.getText();
        Float salario = Float.parseFloat(vistaNuevo.txtSalario.getText());
        String genero = (String) vistaNuevo.cboGenero.getSelectedItem();
        String modContrato = (String) vistaNuevo.cboModContrato.getSelectedItem();
        String jorLaboral = (String) vistaNuevo.cboJorLaboral.getSelectedItem();
        Date fecNacimiento = vistaNuevo.txtFecNacimiento.getDate();
        Date fecIngrso = vistaNuevo.txtFecIngreso.getDate();
        int estado = 1;
        Date fechaInicio = vistaNuevo.txtFecInicio.getDate();
        Date fechaFin = vistaNuevo.txtFecFin.getDate();
        objEmpleado.setEmpDni(dni);
        objEmpleado.setEmpNombre(nombre);
        objEmpleado.setEmpApellidoPat(apePat);
        objEmpleado.setEmpApellidoMat(apeMat);
        objEmpleado.setEmpArea(area);
        objEmpleado.setEmpSalario(salario);
        objEmpleado.setEmpGen(genero);
        objEmpleado.setEmpModContrato(modContrato);
        objEmpleado.setEmpJornadaLab(jorLaboral);
        objEmpleado.setEmpFechaNac(fecNacimiento);
        objEmpleado.setEmpFechaIngreso(fecIngrso);
        objEmpleado.setEmpEstado(estado);
        objEmpleado.setFechaInicio(fechaInicio);
        objEmpleado.setFechaFin(fechaFin);
        int res = objEmpleadoConsultas.agregar(objEmpleado);
        if(res==1){
            add = true; 
        }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        
        return add;   
        
    }
    
    

    

    
}
