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
//        IconAgregar.setVisible(true);
//        IconAgregarHover.setVisible(false);
    }

    public String validar() {
        if (txtdniingre.getText().equals("")) {
            txtdniingre.requestFocus();
            return " DNI";
        } else if (txtnombreingre.getText().equals("")) {
            txtnombreingre.requestFocus();
            return " nombres";
        } else if (txtapellidosingre.getText().equals("")) {
            txtapellidosingre.requestFocus();
            return " apellidos";
        } else if (txtdireccioningre.getText().equals("")) {
            txtdireccioningre.requestFocus();
            return " direccion";
        } else if (txtedadingre.getText().equals("") || Integer.parseInt(txtedadingre.getText()) < 0) {
            txtedadingre.requestFocus();
            return " edad";
        } else if (txtcelularingre.getText().equals("")) {
            txtcelularingre.requestFocus();
            return " celular";
        } else {
            return "";
        }
    }
    
    public void limpiarcampos() {
        txtdniingre.setText("");
        txtnombreingre.setText("");
        txtapellidosingre.setText("");
        txtdireccioningre.setText("");
        txtedadingre.setText("");
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
        txtedadingre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcelularingre = new javax.swing.JTextField();
        Derechos = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        IconRegresar = new javax.swing.JLabel();
        IconRegresarHover = new javax.swing.JLabel();
        btnGuardarNew = new javax.swing.JPanel();
        IconGuardarNew = new javax.swing.JLabel();
        IconGuardarNewHover = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 510));
        setMinimumSize(new java.awt.Dimension(700, 510));
        setPreferredSize(new java.awt.Dimension(700, 510));

        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel2.setText("NUEVO EMPLEADO");

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel1.setText("DNI:");

        txtdniingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtdniingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtdniingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtdniingre.setPreferredSize(new java.awt.Dimension(210, 29));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        txtnombreingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtnombreingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtnombreingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtnombreingre.setPreferredSize(new java.awt.Dimension(210, 29));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos:");

        txtapellidosingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtapellidosingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtapellidosingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtapellidosingre.setPreferredSize(new java.awt.Dimension(210, 29));

        jLabel5.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel5.setText("Direccion:");

        txtdireccioningre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtdireccioningre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtdireccioningre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtdireccioningre.setPreferredSize(new java.awt.Dimension(210, 29));

        jLabel6.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel6.setText("Edad:");

        txtedadingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre.setPreferredSize(new java.awt.Dimension(210, 29));

        jLabel7.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel7.setText("Celular:");

        txtcelularingre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtcelularingre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtcelularingre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtcelularingre.setPreferredSize(new java.awt.Dimension(210, 29));

        Derechos.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        Derechos.setForeground(new java.awt.Color(102, 102, 102));
        Derechos.setText("2022 © Microsense");

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

        IconGuardarNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconGuardarNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnGuardarNew.png"))); // NOI18N

        IconGuardarNewHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconGuardarNewHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnGuardarNewHover.png"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardarNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtedadingre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtapellidosingre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtdniingre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtcelularingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtdireccioningre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(20, 20, 20)
                                            .addComponent(txtnombreingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Derechos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdniingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombreingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtapellidosingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtdireccioningre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtcelularingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtedadingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Derechos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos;
    private javax.swing.JLabel IconGuardarNew;
    private javax.swing.JLabel IconGuardarNewHover;
    private javax.swing.JLabel IconRegresar;
    private javax.swing.JLabel IconRegresarHover;
    private javax.swing.JPanel btnGuardarNew;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtapellidosingre;
    private javax.swing.JTextField txtcelularingre;
    private javax.swing.JTextField txtdireccioningre;
    private javax.swing.JTextField txtdniingre;
    private javax.swing.JTextField txtedadingre;
    private javax.swing.JTextField txtnombreingre;
    // End of variables declaration//GEN-END:variables
}
