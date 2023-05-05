package Vista;

import static Vista.Dashboard.panelContenido;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Empleado_EditarView extends javax.swing.JPanel {

//    Modelo.ClienteMod c1 = new Modelo.ClienteMod();
//    Entidad.ClienteEnt c11 = new Entidad.ClienteEnt();

    public Empleado_EditarView() {
        initComponents();
        deshabilitar();
    }

    public void deshabilitar() {
        txtdniedicli.requestFocus();
        txtnombresedicli.setEnabled(false);
        txtapellidosedicli.setEnabled(false);
        txtdireccionedicli.setEnabled(false);
        txtedadedicli.setEnabled(false);
        txtcelularedicli.setEnabled(false);

    }

    public void habilitar() {
        txtnombresedicli.setEnabled(true);
        txtapellidosedicli.setEnabled(true);
        txtdireccionedicli.setEnabled(true);
        txtedadedicli.setEnabled(true);
        txtcelularedicli.setEnabled(true);
    }
    
    public String validar() {
        if (txtdniedicli.getText().equals("")) {
            txtdniedicli.requestFocus();
            return " DNI";
        } else if (txtnombresedicli.getText().equals("")) {
            txtnombresedicli.requestFocus();
            return " nombres";
        } else if (txtapellidosedicli.getText().equals("")) {
            txtapellidosedicli.requestFocus();
            return " apellidos";
        } else if (txtdireccionedicli.getText().equals("")) {
            txtdireccionedicli.requestFocus();
            return " direccion";
        } else if (txtedadedicli.getText().equals("") || Integer.parseInt(txtedadedicli.getText()) < 0) {
            txtedadedicli.requestFocus();
            return " edad";
        } else if (txtcelularedicli.getText().equals("")) {
            txtcelularedicli.requestFocus();
            return " celular";
        } else {
            return "";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdniedicli = new javax.swing.JTextField();
        txtnombresedicli = new javax.swing.JTextField();
        txtapellidosedicli = new javax.swing.JTextField();
        txtdireccionedicli = new javax.swing.JTextField();
        txtedadedicli = new javax.swing.JTextField();
        txtcelularedicli = new javax.swing.JTextField();
        btnbuscaredicli = new javax.swing.JButton();
        Derechos = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        IconRegresar = new javax.swing.JLabel();
        IconRegresarHover = new javax.swing.JLabel();
        btnGuardarEdit = new javax.swing.JPanel();
        IconGuardarEdit = new javax.swing.JLabel();
        IconGuardarEditHover = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 510));
        setMinimumSize(new java.awt.Dimension(700, 510));
        setPreferredSize(new java.awt.Dimension(700, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 510));

        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel2.setText("EDITAR CLIENTE");

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel1.setText("DNI");

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel6.setText("Edad");

        jLabel7.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel7.setText("Celular");

        txtdniedicli.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtdniedicli.setMaximumSize(new java.awt.Dimension(210, 29));
        txtdniedicli.setMinimumSize(new java.awt.Dimension(210, 29));
        txtdniedicli.setPreferredSize(new java.awt.Dimension(210, 29));

        txtnombresedicli.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtnombresedicli.setMaximumSize(new java.awt.Dimension(210, 29));
        txtnombresedicli.setMinimumSize(new java.awt.Dimension(210, 29));
        txtnombresedicli.setPreferredSize(new java.awt.Dimension(210, 29));

        txtapellidosedicli.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtapellidosedicli.setMaximumSize(new java.awt.Dimension(210, 29));
        txtapellidosedicli.setMinimumSize(new java.awt.Dimension(210, 29));
        txtapellidosedicli.setPreferredSize(new java.awt.Dimension(210, 29));

        txtdireccionedicli.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtdireccionedicli.setMaximumSize(new java.awt.Dimension(210, 29));
        txtdireccionedicli.setMinimumSize(new java.awt.Dimension(210, 29));
        txtdireccionedicli.setPreferredSize(new java.awt.Dimension(210, 29));

        txtedadedicli.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadedicli.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadedicli.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadedicli.setPreferredSize(new java.awt.Dimension(210, 29));

        txtcelularedicli.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtcelularedicli.setMaximumSize(new java.awt.Dimension(210, 29));
        txtcelularedicli.setMinimumSize(new java.awt.Dimension(210, 29));
        txtcelularedicli.setPreferredSize(new java.awt.Dimension(210, 29));

        btnbuscaredicli.setBackground(new java.awt.Color(119, 210, 213));
        btnbuscaredicli.setFont(new java.awt.Font("SF UI Display", 1, 12)); // NOI18N
        btnbuscaredicli.setText("BUSCAR");
        btnbuscaredicli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaredicliActionPerformed(evt);
            }
        });

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

        btnGuardarEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarEdit.setMaximumSize(new java.awt.Dimension(115, 42));
        btnGuardarEdit.setMinimumSize(new java.awt.Dimension(115, 42));
        btnGuardarEdit.setPreferredSize(new java.awt.Dimension(115, 42));
        btnGuardarEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarEditMouseExited(evt);
            }
        });

        IconGuardarEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconGuardarEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnGuardarEdit.png"))); // NOI18N

        IconGuardarEditHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconGuardarEditHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnGuardarEditHover.png"))); // NOI18N

        javax.swing.GroupLayout btnGuardarEditLayout = new javax.swing.GroupLayout(btnGuardarEdit);
        btnGuardarEdit.setLayout(btnGuardarEditLayout);
        btnGuardarEditLayout.setHorizontalGroup(
            btnGuardarEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconGuardarEdit)
            .addGroup(btnGuardarEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnGuardarEditLayout.createSequentialGroup()
                    .addComponent(IconGuardarEditHover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnGuardarEditLayout.setVerticalGroup(
            btnGuardarEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconGuardarEdit)
            .addGroup(btnGuardarEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnGuardarEditLayout.createSequentialGroup()
                    .addComponent(IconGuardarEditHover)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Derechos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdireccionedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombresedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcelularedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdniedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnbuscaredicli))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnGuardarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel6))
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtedadedicli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtapellidosedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnbuscaredicli, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdniedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombresedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdireccionedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtapellidosedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtedadedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcelularedicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Derechos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscaredicliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaredicliActionPerformed
//        c1.buscarcliente(c11,txtdniedicli.getText());
//        txtnombresedicli.setText(c11.getClienNom());
//        txtapellidosedicli.setText(c11.getClienApe());
//        txtdireccionedicli.setText(c11.getClienDirec());
//        txtedadedicli.setText(c11.getClienEdad());
//        txtcelularedicli.setText(c11.getClienCel());
        habilitar();
    }//GEN-LAST:event_btnbuscaredicliActionPerformed

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

    private void btnGuardarEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEditMouseClicked
        if(validar().equals("")){
            //c1.editarcliente(txtdniedicli.getText(), txtnombresedicli.getText(), txtapellidosedicli.getText(),txtdireccionedicli.getText(), txtedadedicli.getText(), txtcelularedicli.getText());
            Vista.EmpleadoView modClie = new Vista.EmpleadoView();

            modClie.setSize(700, 510);
            modClie.setLocation(0, 0);
            panelContenido.removeAll();
            panelContenido.add(modClie, BorderLayout.CENTER);
            panelContenido.revalidate();
            panelContenido.repaint();
        }else{
           JOptionPane.showMessageDialog(null, "Falta ingresar"+validar());
        }
    }//GEN-LAST:event_btnGuardarEditMouseClicked

    private void btnGuardarEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEditMouseEntered
        IconGuardarEdit.setVisible(false);
        IconGuardarEditHover.setVisible(true);
    }//GEN-LAST:event_btnGuardarEditMouseEntered

    private void btnGuardarEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEditMouseExited
        IconGuardarEdit.setVisible(true);
        IconGuardarEditHover.setVisible(false);
    }//GEN-LAST:event_btnGuardarEditMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos;
    private javax.swing.JLabel IconGuardarEdit;
    private javax.swing.JLabel IconGuardarEditHover;
    private javax.swing.JLabel IconRegresar;
    private javax.swing.JLabel IconRegresarHover;
    private javax.swing.JPanel btnGuardarEdit;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JButton btnbuscaredicli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtapellidosedicli;
    private javax.swing.JTextField txtcelularedicli;
    private javax.swing.JTextField txtdireccionedicli;
    private javax.swing.JTextField txtdniedicli;
    private javax.swing.JTextField txtedadedicli;
    private javax.swing.JTextField txtnombresedicli;
    // End of variables declaration//GEN-END:variables
}
