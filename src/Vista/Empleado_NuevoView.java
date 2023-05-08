/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import static Vista.Dashboard.panelContenido;
import java.awt.BorderLayout;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Empleado_NuevoView extends javax.swing.JPanel {

    //Modelo.ClienteMod c11 = new Modelo.ClienteMod();

    public Empleado_NuevoView() {
        initComponents();
        setSize(900, 480);
        cboGenero.setSelectedIndex(-1);
        cboJorLaboral.setSelectedIndex(-1);
        cboModContrato.setSelectedIndex(-1);
    }
    
    void botones(){
        IconRegresar.setVisible(true);
        IconRegresarHover.setVisible(false);
        IconGuardarNew.setVisible(true);
        IconGuardarNewHover.setVisible(false);
    }

    public String validar() {
//        if (txtdniingre.getText().equals("")) {
//            txtdniingre.requestFocus();
//            return " DNI";
//        } else if (txtnombreingre.getText().equals("")) {
//            txtnombreingre.requestFocus();
//            return " nombres";
//        } else if (txtapellidosingre.getText().equals("")) {
//            txtapellidosingre.requestFocus();
//            return " apellidos";
//        } else if (txtdireccioningre.getText().equals("")) {
//            txtdireccioningre.requestFocus();
//            return " direccion";
//        } else if (txtedadingre.getText().equals("") || Integer.parseInt(txtedadingre.getText()) < 0) {
//            txtedadingre.requestFocus();
//            return " edad";
//        } else if (txtcelularingre.getText().equals("")) {
//            txtcelularingre.requestFocus();
//            return " celular";
//        } else {
//            return "";
//        }
      return "";
    }
    
    public void limpiarcampos() {
        txtDni.setText("");
        txtNombre.setText("");
        txtApePat.setText("");
        txtApeMat.setText("");
        //txtedadingre.setText("");
        txtArea.setText("");
        txtDni.requestFocus();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApePat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApeMat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        Derechos = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        IconRegresar = new javax.swing.JLabel();
        IconRegresarHover = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboModContrato = new javax.swing.JComboBox<>();
        cboJorLaboral = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtedadingre7 = new javax.swing.JTextField();
        cboGenero = new javax.swing.JComboBox<>();
        btnGuardarNew = new javax.swing.JPanel();
        IconGuardarNew = new javax.swing.JLabel();
        IconGuardarNewHover = new javax.swing.JLabel();
        txtFecNacimiento = new com.toedter.calendar.JDateChooser();
        txtFecIngreso = new com.toedter.calendar.JDateChooser();
        txtFecInicio = new com.toedter.calendar.JDateChooser();
        txtFecFin = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();

        jLabel12.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel12.setText("Foto:");

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 510));
        setMinimumSize(new java.awt.Dimension(900, 510));
        setPreferredSize(new java.awt.Dimension(900, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel2.setText("NUEVO EMPLEADO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel1.setText("DNI:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtDni.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtDni.setMaximumSize(new java.awt.Dimension(210, 29));
        txtDni.setMinimumSize(new java.awt.Dimension(210, 29));
        txtDni.setPreferredSize(new java.awt.Dimension(210, 29));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, -1));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        txtNombre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtNombre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtNombre.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 190, -1));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Pat:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtApePat.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtApePat.setMaximumSize(new java.awt.Dimension(210, 29));
        txtApePat.setMinimumSize(new java.awt.Dimension(210, 29));
        txtApePat.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, -1));

        jLabel5.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Mat:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        txtApeMat.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtApeMat.setMaximumSize(new java.awt.Dimension(210, 29));
        txtApeMat.setMinimumSize(new java.awt.Dimension(210, 29));
        txtApeMat.setPreferredSize(new java.awt.Dimension(210, 29));
        txtApeMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeMatActionPerformed(evt);
            }
        });
        add(txtApeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 190, -1));

        jLabel6.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel6.setText("Genero:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel7.setText("F. Fin:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        txtArea.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtArea.setMaximumSize(new java.awt.Dimension(210, 29));
        txtArea.setMinimumSize(new java.awt.Dimension(210, 29));
        txtArea.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 190, -1));

        Derechos.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        Derechos.setForeground(new java.awt.Color(102, 102, 102));
        Derechos.setText("2022 © Microsense");
        add(Derechos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setMaximumSize(new java.awt.Dimension(115, 42));
        btnRegresar.setMinimumSize(new java.awt.Dimension(115, 42));
        btnRegresar.setPreferredSize(new java.awt.Dimension(115, 42));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });

        IconRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnRegresar.png"))); // NOI18N

        IconRegresarHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconRegresarHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnRegresarHover.png"))); // NOI18N

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconRegresar)
            .addGroup(btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnRegresarLayout.createSequentialGroup()
                    .addComponent(IconRegresarHover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconRegresar)
            .addGroup(btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnRegresarLayout.createSequentialGroup()
                    .addComponent(IconRegresarHover)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 415, -1, -1));

        jLabel8.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel8.setText("Mod. Contrato:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel9.setText("Jor. Laboral:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel10.setText("Fec. Nacimiento:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtSalario.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtSalario.setMaximumSize(new java.awt.Dimension(210, 29));
        txtSalario.setMinimumSize(new java.awt.Dimension(210, 29));
        txtSalario.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 180, -1));

        jLabel11.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel11.setText("Salario:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel13.setText("Foto:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        cboModContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plazo Determinado", "Plazo Indeterminado" }));
        cboModContrato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboModContratoItemStateChanged(evt);
            }
        });
        add(cboModContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 180, -1));

        cboJorLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiempo Completo", "Tiempo Parcial" }));
        cboJorLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJorLaboralActionPerformed(evt);
            }
        });
        add(cboJorLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 180, -1));

        jLabel14.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel14.setText("Area:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel15.setText("F. Inicio:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        txtedadingre7.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre7.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre7.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre7.setPreferredSize(new java.awt.Dimension(210, 29));
        txtedadingre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadingre7ActionPerformed(evt);
            }
        });
        add(txtedadingre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 190, -1));

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        cboGenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGeneroItemStateChanged(evt);
            }
        });
        add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, -1));

        btnGuardarNew.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarNew.setMaximumSize(new java.awt.Dimension(115, 42));
        btnGuardarNew.setMinimumSize(new java.awt.Dimension(115, 42));
        btnGuardarNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarNewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarNewMouseExited(evt);
            }
        });

        IconGuardarNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconGuardarNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnGuardarEdit.png"))); // NOI18N

        IconGuardarNewHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconGuardarNewHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnGuardarEditHover.png"))); // NOI18N

        javax.swing.GroupLayout btnGuardarNewLayout = new javax.swing.GroupLayout(btnGuardarNew);
        btnGuardarNew.setLayout(btnGuardarNewLayout);
        btnGuardarNewLayout.setHorizontalGroup(
            btnGuardarNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconGuardarNew)
            .addGroup(btnGuardarNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnGuardarNewLayout.createSequentialGroup()
                    .addComponent(IconGuardarNewHover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnGuardarNewLayout.setVerticalGroup(
            btnGuardarNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconGuardarNew)
            .addGroup(btnGuardarNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnGuardarNewLayout.createSequentialGroup()
                    .addComponent(IconGuardarNewHover)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(btnGuardarNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        txtFecNacimiento.setDateFormatString("dd/MM/yyyy");
        add(txtFecNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 180, 20));

        txtFecIngreso.setDateFormatString("dd/MM/yyyy");
        add(txtFecIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 190, -1));

        txtFecInicio.setDateFormatString("dd/MM/yyyy");
        txtFecInicio.setEnabled(false);
        add(txtFecInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 110, -1));

        txtFecFin.setDateFormatString("dd/MM/yyyy");
        txtFecFin.setEnabled(false);
        add(txtFecFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 110, -1));

        jLabel16.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel16.setText("Fec Ingreso:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        Vista.EmpleadoView vista = new Vista.EmpleadoView();
        vista.setSize(900, 510);
        vista.setLocation(0, 0);
        Dashboard.panelContenido.removeAll();
        Dashboard.panelContenido.add(vista, BorderLayout.CENTER);
        Dashboard.panelContenido.revalidate();
        Dashboard.panelContenido.repaint();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        IconRegresar.setVisible(false);
        IconRegresarHover.setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        IconRegresar.setVisible(true);
        IconRegresarHover.setVisible(false);
    }//GEN-LAST:event_btnRegresarMouseExited

    private void cboGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGeneroItemStateChanged
//        if (cboHospe.getSelectedIndex() >= 0) {
//            String hosNombre = cboHospe.getSelectedItem().toString();
//            cboTipo.setEnabled(true);
//            cboTipo.removeAllItems();
//            resNue.llenartipohabitacion(cboTipo, hosNombre);
//        }
    }//GEN-LAST:event_cboGeneroItemStateChanged

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void cboJorLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJorLaboralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboJorLaboralActionPerformed

    private void txtedadingre7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadingre7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadingre7ActionPerformed

    private void btnGuardarNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarNewMouseEntered
        IconGuardarNew.setVisible(false);
        IconGuardarNewHover.setVisible(true);
    }//GEN-LAST:event_btnGuardarNewMouseEntered

    private void btnGuardarNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarNewMouseExited
        IconGuardarNew.setVisible(true);
        IconGuardarNewHover.setVisible(false);
    }//GEN-LAST:event_btnGuardarNewMouseExited

    private void btnGuardarNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarNewMouseClicked
        Controlador c = new Controlador(this);
        boolean add = c.Agregar();
        if(add == true){
            JOptionPane.showMessageDialog(null, "Se ingreso el empleado correctamente");
            Vista.EmpleadoView vista = new Vista.EmpleadoView();
            vista.setSize(900, 510);
            vista.setLocation(0, 0);
            Dashboard.panelContenido.removeAll();
            Dashboard.panelContenido.add(vista, BorderLayout.CENTER);
            Dashboard.panelContenido.revalidate();
            Dashboard.panelContenido.repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }
    }//GEN-LAST:event_btnGuardarNewMouseClicked

    private void cboModContratoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboModContratoItemStateChanged
        if(cboModContrato.getSelectedIndex()==0){
            txtFecInicio.setEnabled(true);
            txtFecFin.setEnabled(true);
        }
        if(cboModContrato.getSelectedIndex()==1){
            txtFecInicio.setEnabled(true);
            txtFecFin.setEnabled(false);
            
        }
    }//GEN-LAST:event_cboModContratoItemStateChanged

    private void txtApeMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeMatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos;
    private javax.swing.JLabel IconGuardarNew;
    private javax.swing.JLabel IconGuardarNewHover;
    private javax.swing.JLabel IconRegresar;
    private javax.swing.JLabel IconRegresarHover;
    public javax.swing.JPanel btnGuardarNew;
    private javax.swing.JPanel btnRegresar;
    public javax.swing.JComboBox<Object> cboGenero;
    public javax.swing.JComboBox<String> cboJorLaboral;
    public javax.swing.JComboBox<String> cboModContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField txtApeMat;
    public javax.swing.JTextField txtApePat;
    public javax.swing.JTextField txtArea;
    public javax.swing.JTextField txtDni;
    public com.toedter.calendar.JDateChooser txtFecFin;
    public com.toedter.calendar.JDateChooser txtFecIngreso;
    public com.toedter.calendar.JDateChooser txtFecInicio;
    public com.toedter.calendar.JDateChooser txtFecNacimiento;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtedadingre7;
    // End of variables declaration//GEN-END:variables
}
