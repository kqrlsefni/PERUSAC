
package Controlador;

import Vista.Dashboard;
import Vista.EmpleadoView;
import Vista.Empleado_NuevoView;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.EmpleadoConsultas;


public class Controlador implements MouseListener{
    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    Empleado_NuevoView vistaNuevo = new Empleado_NuevoView();
    EmpleadoView vista = new EmpleadoView();
    public Controlador(Empleado_NuevoView vistaNuevo,EmpleadoView vista){
        this.vistaNuevo = vistaNuevo;
        this.vista = vista;
        this.vistaNuevo.btnGuardarNew.addMouseListener(this);
    }

    
    public void Agregar(){
        
        String dni = vistaNuevo.txtDni.getText();
        String nombre = vistaNuevo.txtNombre.getText();
        String apePat = vistaNuevo.txtApePat.getText();
        String apeMat = vistaNuevo.txtApeMat.getText();
        String area = vistaNuevo.txtArea.getText();
        Float salario = Float.parseFloat(vistaNuevo.txtSalario.getText());
        String genero = (String) vistaNuevo.cboGenero.getSelectedItem();
        String modContrato = (String) vistaNuevo.cboModContrato.getSelectedItem();
        String jorLaboral = (String) vistaNuevo.cboJorLaboral.getSelectedItem();
        Date fecNacimiento = new Date(2023,7,5);
        Date fecIngrso = new Date(2023,7,5);
        int estado = 1;
        
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
        
        int res = objEmpleadoConsultas.agregar(objEmpleado);
        if(res==1){
            JOptionPane.showMessageDialog(vistaNuevo, "Empleado agregado con éxito");
            EmpleadoView modClie = new EmpleadoView();

            modClie.setSize(700, 510);
            modClie.setLocation(0, 0);
            Dashboard.panelContenido.removeAll();
            Dashboard.panelContenido.add(modClie, BorderLayout.CENTER);
            Dashboard.panelContenido.revalidate();
            Dashboard.panelContenido.repaint();
        }else{
            JOptionPane.showMessageDialog(vistaNuevo, "Error al registrar");
        }
    }
    
    public void Listar(){
        List<Empleado> lista = objEmpleadoConsultas.listar();
        Object objeto[][] = new Object[lista.size()][10];
        vista.tblEmpleados.setModel(new DefaultTableModel(objeto, new String[]{"CODIGO", "DNI", "NOMBRES", "APELLIDOS", "GENERO", "ÁREA", "MODALIDAD CONTRATO", "JORNADA LABORAL","SALARIO","FECHA INGRESO"}){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 7) {
                    return true;
                } else {
                    return false;
                }
            }
            
        });
        vista.jScrollPane1.setViewportView(vista.tblEmpleados);
        for (int i = 0; i < lista.size(); i++) {
            
            vista.tblEmpleados.clearSelection();
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpCodigo(), i, 0);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpDni(), i, 1);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpNombre(), i, 2);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpApellidoPat(), i, 3);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpGen(), i, 4);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpArea(), i, 5);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpModContrato(), i, 6);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpJornadaLab(), i, 7);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpSalario(), i, 8);
            vista.tblEmpleados.setValueAt(lista.get(i).getEmpFechaIngreso(), i, 9);

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("boton clicked");
            Agregar();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
