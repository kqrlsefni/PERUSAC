/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.BoletaPagoControlador;
import java.awt.BorderLayout;

/**
 *
 * @author Oscar
 */
public class BoletaPagoView extends javax.swing.JPanel {

    /**
     * Creates new form BoletaPagoView
     */
    int idEmp;
    public BoletaPagoView(int idEmp) {
        initComponents();
        txtDni.setEditable(false);
        txtEmpleado.setEditable(false);
        this.idEmp = idEmp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        IconRegresar = new javax.swing.JLabel();
        IconRegresarHover = new javax.swing.JLabel();
        btnPagar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel2.setText("BOLETA DE PAGO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 44, -1, 30));

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel1.setText("Seguro:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel3.setText("Empleado:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 30));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel4.setText("DNI:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setMaximumSize(new java.awt.Dimension(115, 42));
        btnRegresar.setMinimumSize(new java.awt.Dimension(115, 42));
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

        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        btnPagar.setBackground(new java.awt.Color(101, 101, 173));
        btnPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagarMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Generar Boleta");

        javax.swing.GroupLayout btnPagarLayout = new javax.swing.GroupLayout(btnPagar);
        btnPagar.setLayout(btnPagarLayout);
        btnPagarLayout.setHorizontalGroup(
            btnPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPagarLayout.setVerticalGroup(
            btnPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));
        add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 270, -1));

        jLabel6.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel6.setText("Gratificacion:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 140, -1));

        jCheckBox1.setSelected(true);
        jCheckBox1.setEnabled(false);
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jCheckBox2.setSelected(true);
        jCheckBox2.setEnabled(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));
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

    private void btnPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarMouseClicked
        BoletaPagoControlador bpc = new BoletaPagoControlador(this);
        bpc.genrerarBoleta(idEmp);
    }//GEN-LAST:event_btnPagarMouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconRegresar;
    private javax.swing.JLabel IconRegresarHover;
    private javax.swing.JPanel btnPagar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtEmpleado;
    // End of variables declaration//GEN-END:variables
}
