/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;

/**
 *
 * @author Oscar
 */
public class HistorialView extends javax.swing.JPanel {

    /**
     * Creates new form HistorialView
     */
    public HistorialView() {
        initComponents();
        txtDni.setEditable(false);
        txtEmpleado.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        IconRegresar = new javax.swing.JLabel();
        IconRegresarHover = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSalario = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstModContrato = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstArea = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstJorLaboral = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 510));
        setMinimumSize(new java.awt.Dimension(900, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        jLabel1.setText("HISTORIAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 31, -1, -1));

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

        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 415, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel3.setText("Empleado:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 20));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel4.setText("Area");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));
        add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 270, -1));
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 140, -1));

        jLabel5.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel5.setText("DNI:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel6.setText("Salario");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel7.setText("Joranada Laboral");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jScrollPane1.setViewportView(lstSalario);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 190));

        jScrollPane2.setViewportView(lstModContrato);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 240, 190));

        jScrollPane3.setViewportView(lstArea);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 250, 190));

        jLabel8.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel8.setText("Modalidad Contrato");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jScrollPane4.setViewportView(lstJorLaboral);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 200, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        Vista.BitacoraView vista = new Vista.BitacoraView();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconRegresar;
    private javax.swing.JLabel IconRegresarHover;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JList<String> lstArea;
    public javax.swing.JList<String> lstJorLaboral;
    public javax.swing.JList<String> lstModContrato;
    public javax.swing.JList<String> lstSalario;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtEmpleado;
    // End of variables declaration//GEN-END:variables
}