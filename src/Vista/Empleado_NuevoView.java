/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Dashboard.panelContenido;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Empleado_NuevoView extends javax.swing.JPanel {

    //Modelo.ClienteMod c11 = new Modelo.ClienteMod();

    public Empleado_NuevoView() {
        initComponents();
        setSize(700, 480);
        
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
        txtdniingre.setText("");
        txtnombreingre.setText("");
        txtapellidosingre.setText("");
        txtdireccioningre.setText("");
        //txtedadingre.setText("");
        txtcelularingre.setText("");
        txtdniingre.requestFocus();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtdniingre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombreingre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellidosingre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdireccioningre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcelularingre = new javax.swing.JTextField();
        Derechos = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        IconRegresar = new javax.swing.JLabel();
        IconRegresarHover = new javax.swing.JLabel();
        btnGuardarNew = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtedadingre3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtedadingre4 = new javax.swing.JTextField();
        txtedadingre5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtedadingre6 = new javax.swing.JTextField();
        IconGuardarNew = new javax.swing.JLabel();
        IconGuardarNewHover = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtedadingre7 = new javax.swing.JTextField();
        txtedadingre8 = new javax.swing.JTextField();
        cboHospe = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 510));
        setMinimumSize(new java.awt.Dimension(700, 510));
        setPreferredSize(new java.awt.Dimension(700, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel2.setText("NUEVO EMPLEADO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel1.setText("DNI:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 70, -1, -1));

        txtdniingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtdniingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtdniingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtdniingre.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtdniingre, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 65, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 70, -1, -1));

        txtnombreingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtnombreingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtnombreingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtnombreingre.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtnombreingre, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 65, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Pat:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 114, -1, -1));

        txtapellidosingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtapellidosingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtapellidosingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtapellidosingre.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtapellidosingre, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 109, 190, -1));

        jLabel5.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Mat:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 114, -1, -1));

        txtdireccioningre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtdireccioningre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtdireccioningre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtdireccioningre.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtdireccioningre, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 109, 194, -1));

        jLabel6.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel6.setText("Genero:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 165, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel7.setText("F. Fin:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        txtcelularingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtcelularingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtcelularingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtcelularingre.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtcelularingre, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 160, -1, -1));

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

        btnGuardarNew.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarNew.setMaximumSize(new java.awt.Dimension(115, 42));
        btnGuardarNew.setMinimumSize(new java.awt.Dimension(115, 42));
        btnGuardarNew.setPreferredSize(new java.awt.Dimension(115, 42));
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

        javax.swing.GroupLayout btnGuardarNewLayout = new javax.swing.GroupLayout(btnGuardarNew);
        btnGuardarNew.setLayout(btnGuardarNewLayout);
        btnGuardarNewLayout.setHorizontalGroup(
            btnGuardarNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        btnGuardarNewLayout.setVerticalGroup(
            btnGuardarNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        add(btnGuardarNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 415, -1, -1));

        jLabel8.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel8.setText("Modalidad Contrato:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 219, -1, -1));

        jLabel9.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel9.setText("Jornada Laboral:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 266, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel10.setText("Fecha Nacimiento:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 312, -1, -1));

        jLabel11.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel11.setText("Salario:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 359, -1, -1));

        txtedadingre3.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre3.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre3.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre3.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtedadingre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 354, 75, -1));

        jLabel12.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel12.setText("Foto:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 300, -1, -1));

        txtedadingre4.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre4.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre4.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre4.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtedadingre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 50, -1));

        txtedadingre5.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre5.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre5.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre5.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtedadingre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 307, 75, -1));

        jLabel13.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel13.setText("Fecha Ingreso:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 359, -1, -1));

        txtedadingre6.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre6.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre6.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre6.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtedadingre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 354, 80, -1));

        IconGuardarNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconGuardarNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnGuardarNew.png"))); // NOI18N
        add(IconGuardarNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        IconGuardarNewHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconGuardarNewHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnGuardarNewHover.png"))); // NOI18N
        add(IconGuardarNewHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plazo Determinado", "Plazo Indeterminado" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiempo Completo", "Tiempo Parcial" }));
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 120, -1));

        jLabel14.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel14.setText("Area:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 165, -1, -1));

        jLabel15.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel15.setText("F. Inicio:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        txtedadingre7.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre7.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre7.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre7.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtedadingre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 295, 80, -1));

        txtedadingre8.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre8.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre8.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre8.setPreferredSize(new java.awt.Dimension(210, 29));
        add(txtedadingre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 50, -1));

        cboHospe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        cboHospe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHospeItemStateChanged(evt);
            }
        });
        add(cboHospe, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 160, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        Vista.EmpleadoView modClie = new Vista.EmpleadoView();
        modClie.setSize(700, 510);
        modClie.setLocation(0, 0);
        panelContenido.removeAll();
        panelContenido.add(modClie, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        IconRegresar.setVisible(false);
        IconRegresarHover.setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        IconRegresar.setVisible(true);
        IconRegresarHover.setVisible(false);
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnGuardarNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarNewMouseClicked
        if (validar().equals("")) {
            //c11.ingresarcliente(txtdniingre.getText(), txtnombreingre.getText(), txtapellidosingre.getText(), txtdireccioningre.getText(), txtedadingre.getText(), txtcelularingre.getText());
            JOptionPane.showMessageDialog(null, "Se ingreso al cliente correctamente");
            limpiarcampos();
            Vista.EmpleadoView modClie = new Vista.EmpleadoView();
            modClie.setSize(700, 510);
            modClie.setLocation(0, 0);
            panelContenido.removeAll();
            panelContenido.add(modClie, BorderLayout.CENTER);
            panelContenido.revalidate();
            panelContenido.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "Faltan campos a ingresar" + validar());
        }
    }//GEN-LAST:event_btnGuardarNewMouseClicked

    private void btnGuardarNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarNewMouseEntered
        IconGuardarNew.setVisible(false);
        IconGuardarNewHover.setVisible(true);
    }//GEN-LAST:event_btnGuardarNewMouseEntered

    private void btnGuardarNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarNewMouseExited
        IconGuardarNew.setVisible(true);
        IconGuardarNewHover.setVisible(false);
    }//GEN-LAST:event_btnGuardarNewMouseExited

    private void cboHospeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHospeItemStateChanged
//        if (cboHospe.getSelectedIndex() >= 0) {
//            String hosNombre = cboHospe.getSelectedItem().toString();
//            cboTipo.setEnabled(true);
//            cboTipo.removeAllItems();
//            resNue.llenartipohabitacion(cboTipo, hosNombre);
//        }
    }//GEN-LAST:event_cboHospeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos;
    private javax.swing.JLabel IconGuardarNew;
    private javax.swing.JLabel IconGuardarNewHover;
    private javax.swing.JLabel IconRegresar;
    private javax.swing.JLabel IconRegresarHover;
    private javax.swing.JPanel btnGuardarNew;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JComboBox<Object> cboHospe;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellidosingre;
    private javax.swing.JTextField txtcelularingre;
    private javax.swing.JTextField txtdireccioningre;
    private javax.swing.JTextField txtdniingre;
    private javax.swing.JTextField txtedadingre3;
    private javax.swing.JTextField txtedadingre4;
    private javax.swing.JTextField txtedadingre5;
    private javax.swing.JTextField txtedadingre6;
    private javax.swing.JTextField txtedadingre7;
    private javax.swing.JTextField txtedadingre8;
    private javax.swing.JTextField txtnombreingre;
    // End of variables declaration//GEN-END:variables
}
