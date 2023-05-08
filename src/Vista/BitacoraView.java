/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.HistorialControlador;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.EmpleadoConsultas;

/**
 *
 * @author Oscar
 */
public class BitacoraView extends javax.swing.JPanel {

    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    public BitacoraView() {
        initComponents();
        mostrarEmpleados();
        
    }

    
    
    public void mostrarEmpleados() {
        List<Empleado> lista = objEmpleadoConsultas.listar();
        Object objeto[][] = new Object[lista.size()][10];
        tblEmpleados.setModel(new DefaultTableModel(objeto, new String[]{"CODIGO", "DNI", "NOMBRES", "APELLIDOS", "GENERO", "ÁREA", "MODALIDAD CONTRATO", "JORNADA LABORAL","SALARIO","FECHA INGRESO"}){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 7) {
                    return true;
                } else {
                    return false;
                }
            }
            
        });
        jScrollPane1.setViewportView(tblEmpleados);
        for (int i = 0; i < lista.size(); i++) {
            
            tblEmpleados.clearSelection();
            tblEmpleados.setValueAt(lista.get(i).getEmpCodigo(), i, 0);
            tblEmpleados.setValueAt(lista.get(i).getEmpDni(), i, 1);
            tblEmpleados.setValueAt(lista.get(i).getEmpNombre(), i, 2);
            tblEmpleados.setValueAt(lista.get(i).getEmpApellidoPat(), i, 3);
            tblEmpleados.setValueAt(lista.get(i).getEmpGen(), i, 4);
            tblEmpleados.setValueAt(lista.get(i).getEmpArea(), i, 5);
            tblEmpleados.setValueAt(lista.get(i).getEmpModContrato(), i, 6);
            tblEmpleados.setValueAt(lista.get(i).getEmpJornadaLab(), i, 7);
            tblEmpleados.setValueAt(lista.get(i).getEmpSalario(), i, 8);
            tblEmpleados.setValueAt(lista.get(i).getEmpFechaIngreso(), i, 9);

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnPagar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 510));
        setMinimumSize(new java.awt.Dimension(900, 900));
        setPreferredSize(new java.awt.Dimension(900, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        jLabel1.setText("HISTORIAL DE CAMBIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 31, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(660, 300));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(660, 300));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(660, 300));

        tblEmpleados.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEmpleados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 840, -1));

        btnPagar.setBackground(new java.awt.Color(0, 153, 153));
        btnPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagarMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Historial");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/IconReport.png"))); // NOI18N

        javax.swing.GroupLayout btnPagarLayout = new javax.swing.GroupLayout(btnPagar);
        btnPagar.setLayout(btnPagarLayout);
        btnPagarLayout.setHorizontalGroup(
            btnPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPagarLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnPagarLayout.setVerticalGroup(
            btnPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarMouseClicked
        int idEmp;
        int fila = tblEmpleados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else{
            idEmp = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());
            Vista.HistorialView vistaHistorial = new Vista.HistorialView();

            vistaHistorial.setSize(900, 510);
            vistaHistorial.setLocation(0, 0);
            Dashboard.panelContenido.removeAll();
            Dashboard.panelContenido.add(vistaHistorial, BorderLayout.CENTER);
            Dashboard.panelContenido.revalidate();
            Dashboard.panelContenido.repaint();
            HistorialControlador hc = new HistorialControlador(vistaHistorial);
            hc.llenarCampos(idEmp);
            hc.listarHistorial(idEmp);
        }
    }//GEN-LAST:event_btnPagarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblEmpleados;
    // End of variables declaration//GEN-END:variables
}
