
package Controlador;

import Modelo.Area;
import Modelo.JornadaLaboral;
import Modelo.ModalidadContrato;
import Modelo.Salario;
import Vista.HistorialView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import modelo.Empleado;
import modelo.EmpleadoConsultas;

public class HistorialControlador {
    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    HistorialView vistaHistorial = new HistorialView();
    public HistorialControlador(HistorialView vistaHistorial){
        this.vistaHistorial = vistaHistorial;
    }
    
    public void llenarCampos(int id){
        Empleado emp = objEmpleadoConsultas.buscar(id);
        vistaHistorial.txtDni.setText(emp.getEmpDni());
        vistaHistorial.txtEmpleado.setText(emp.getEmpNombre()+ " " + emp.getEmpApellidoPat() + " " + emp.getEmpApellidoMat());
        
    }
    
    public void listarHistorial(int id){
        DefaultListModel m;
        List<ModalidadContrato> listaModalidad = objEmpleadoConsultas.listarModalidades(id);
        List<Salario> listaSalario = objEmpleadoConsultas.listarSalarios(id);
        List<Area> listaArea = objEmpleadoConsultas.listarAreas(id);
        List<JornadaLaboral> listaJornada = objEmpleadoConsultas.listarJornadas(id);
        
        if(listaSalario.size()>0){
            m = new DefaultListModel();
            for(int i=0; i<listaSalario.size(); i++){
                m.addElement(listaSalario.get(i).getSalario());
            }
            vistaHistorial.lstSalario.setModel(m);
        }
        if(listaArea.size()>0){
            m = new DefaultListModel();
            for(int i=0; i<listaArea.size(); i++){
                m.addElement(listaArea.get(i).getArea());
            }
            vistaHistorial.lstArea.setModel(m);
        }
        if(listaJornada.size()>0){
            m = new DefaultListModel();
            for(int i=0; i<listaJornada.size(); i++){
                m.addElement(listaJornada.get(i).getJornada());
            }
            vistaHistorial.lstJorLaboral.setModel(m);
        }
        if(listaModalidad.size()>0){
            m = new DefaultListModel();
            for(int i=0; i<listaModalidad.size(); i++){
                m.addElement(listaModalidad.get(i).getModalidad());
            }
            vistaHistorial.lstModContrato.setModel(m);
        }
        
        
    }
}
