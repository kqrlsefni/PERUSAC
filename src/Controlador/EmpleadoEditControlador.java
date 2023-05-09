
package Controlador;

import Vista.Empleado_EditarView;
import Vista.Empleado_NuevoView;
import java.util.Date;
import java.util.Objects;
import modelo.Empleado;
import modelo.EmpleadoConsultas;


public class EmpleadoEditControlador {
    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    Empleado_EditarView vistaEditar = new Empleado_EditarView(0);
    
    public EmpleadoEditControlador(Empleado_EditarView vistaEditar){
        this.vistaEditar = vistaEditar;
    }
    
    public boolean Actualizar(int id){
        boolean edit = false, cambSalario=false,cambMod=false,cambJor=false,cambArea=false;
        try {
        String dni = vistaEditar.txtDni.getText();
        String nombre = vistaEditar.txtNombre.getText();
        String apePat = vistaEditar.txtApePat.getText();
        String apeMat = vistaEditar.txtApeMat.getText();
        String area = vistaEditar.txtArea.getText();
        Float salario = Float.parseFloat(vistaEditar.txtSalario.getText());
        String genero = (String) vistaEditar.cboGenero.getSelectedItem();
        String modContrato = (String) vistaEditar.cboModContrato.getSelectedItem();
        String jorLaboral = (String) vistaEditar.cboJorLaboral.getSelectedItem();
        Date fecNacimiento = vistaEditar.txtFecNacimiento.getDate();
        Date fecIngrso = vistaEditar.txtFecIngreso.getDate();
        Date fecInicio = vistaEditar.txtFecInicio.getDate();
        Date fecFin;
        if(vistaEditar.cboModContrato.getSelectedIndex()==1){
           fecFin = vistaEditar.txtFecFin.getDate(); 
        }
        else{
          fecFin = null;  
        }
        
        objEmpleado.setEmpDni(dni);
        objEmpleado.setEmpNombre(nombre);
        objEmpleado.setEmpApellidoPat(apePat);
        objEmpleado.setEmpApellidoMat(apeMat);
        objEmpleado.setEmpArea(area);
        objEmpleado.setEmpSalario(salario);
        objEmpleado.setEmpGen(genero);
        objEmpleado.setEmpModContrato(modContrato);
        objEmpleado.setEmpJornadaLab(jorLaboral);
        objEmpleado.setEmpCodigo(id);
        objEmpleado.setEmpFechaNac(fecNacimiento);
        objEmpleado.setEmpFechaIngreso(fecIngrso);
        objEmpleado.setEmpFechaInicio(fecInicio);
        objEmpleado.setEmpFechaFin(fecFin);
        Empleado emp = objEmpleadoConsultas.buscar(id);
        if(!Objects.equals(salario, emp.getEmpSalario())){
            cambSalario = true;
        } 
        if(!Objects.equals(modContrato, emp.getEmpModContrato())){
            cambMod = true;
        }
        if(!Objects.equals(jorLaboral, emp.getEmpJornadaLab())){
            cambJor = true;
        }
        if(!Objects.equals(area, emp.getEmpArea())){
            cambArea = true;
        }
            
        int res = objEmpleadoConsultas.actualizar(objEmpleado,cambSalario,cambMod,cambJor,cambArea);
        if(res==1){
            edit = true; 
        }
        } catch (Exception e) {
            System.out.println("error en: " + e.getMessage());
        }
        
        return edit;   
        
    }
    
    public void llenarCampos(int id){
        Empleado emp = objEmpleadoConsultas.buscar(id);
        vistaEditar.txtDni.setText(emp.getEmpDni());
        vistaEditar.txtNombre.setText(emp.getEmpNombre());
        vistaEditar.txtApePat.setText(emp.getEmpApellidoPat());
        vistaEditar.txtApeMat.setText(emp.getEmpApellidoMat());
        vistaEditar.txtArea.setText(emp.getEmpArea());
        vistaEditar.txtSalario.setText(String.valueOf(emp.getEmpSalario()));
        vistaEditar.cboGenero.setSelectedItem(emp.getEmpGen());
        vistaEditar.cboModContrato.setSelectedItem(emp.getEmpModContrato());
        vistaEditar.cboJorLaboral.setSelectedItem(emp.getEmpJornadaLab());
        vistaEditar.txtFecNacimiento.setDate(emp.getEmpFechaNac());
        vistaEditar.txtFecIngreso.setDate(emp.getEmpFechaIngreso());
        vistaEditar.txtFecInicio.setDate(emp.getEmpFechaInicio());
        vistaEditar.txtFecFin.setDate(emp.getEmpFechaFin());
    }
}
