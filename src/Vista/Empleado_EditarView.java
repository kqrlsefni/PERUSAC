package Vista;

import Controlador.EmpleadoEditControlador;
import static Vista.Dashboard.panelContenido;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Empleado_EditarView extends javax.swing.JPanel {

//    Modelo.ClienteMod c1 = new Modelo.ClienteMod();
//    Entidad.ClienteEnt c11 = new Entidad.ClienteEnt();
    int idEmp = 0;
    public Empleado_EditarView(int idEmp) {
        initComponents();
        deshabilitar();
        this.idEmp = idEmp;
    }

    public Empleado_EditarView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deshabilitar() {
//        txtdniedicli.requestFocus();
//        txtnombresedicli.setEnabled(false);
//        txtapellidosedicli.setEnabled(false);
//        txtdireccionedicli.setEnabled(false);
//        txtedadedicli.setEnabled(false);
//        txtcelularedicli.setEnabled(false);

    }

    public void habilitar() {
//        txtnombresedicli.setEnabled(true);
//        txtapellidosedicli.setEnabled(true);
//        txtdireccionedicli.setEnabled(true);
//        txtedadedicli.setEnabled(true);
//        txtcelularedicli.setEnabled(true);
    }
    
    public String validar() {
//        if (txtdniedicli.getText().equals("")) {
//            txtdniedicli.requestFocus();
//            return " DNI";
//        } else if (txtnombresedicli.getText().equals("")) {
//            txtnombresedicli.requestFocus();
//            return " nombres";
//        } else if (txtapellidosedicli.getText().equals("")) {
//            txtapellidosedicli.requestFocus();
//            return " apellidos";
//        } else if (txtdireccionedicli.getText().equals("")) {
//            txtdireccionedicli.requestFocus();
//            return " direccion";
//        } else if (txtedadedicli.getText().equals("") || Integer.parseInt(txtedadedicli.getText()) < 0) {
//            txtedadedicli.requestFocus();
//            return " edad";
//        } else if (txtcelularedicli.getText().equals("")) {
//            txtcelularedicli.requestFocus();
//            return " celular";
//        } else {
//            return "";
//        }
      return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Derechos = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        IconRegresar = new javax.swing.JLabel();
        IconRegresarHover = new javax.swing.JLabel();
        btnGuardarEdit = new javax.swing.JPanel();
        IconGuardarEdit = new javax.swing.JLabel();
        IconGuardarEditHover = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtedadingre4 = new javax.swing.JTextField();
        txtedadingre5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtedadingre6 = new javax.swing.JTextField();
        cboModContrato = new javax.swing.JComboBox<>();
        cboJorLaboral = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtedadingre7 = new javax.swing.JTextField();
        txtedadingre8 = new javax.swing.JTextField();
        cboGenero = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(700, 510));
        setMinimumSize(new java.awt.Dimension(700, 510));
        setPreferredSize(new java.awt.Dimension(700, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel2.setText("EDITAR EMPLEADO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, -1, -1));

        Derechos.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        Derechos.setForeground(new java.awt.Color(102, 102, 102));
        Derechos.setText("2022 © Microsense");
        jPanel1.add(Derechos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 30));

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

        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 409, -1, 43));

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

        jPanel1.add(btnGuardarEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel1.setText("DNI:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtDni.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtDni.setMaximumSize(new java.awt.Dimension(210, 29));
        txtDni.setMinimumSize(new java.awt.Dimension(210, 29));
        txtDni.setPreferredSize(new java.awt.Dimension(210, 29));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 140, -1));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        txtNombre.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(210, 29));
        txtNombre.setMinimumSize(new java.awt.Dimension(210, 29));
        txtNombre.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Pat:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtApePat.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtApePat.setMaximumSize(new java.awt.Dimension(210, 29));
        txtApePat.setMinimumSize(new java.awt.Dimension(210, 29));
        txtApePat.setPreferredSize(new java.awt.Dimension(210, 29));
        txtApePat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApePatActionPerformed(evt);
            }
        });
        jPanel1.add(txtApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, -1));

        jLabel5.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Mat:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        txtApeMat.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtApeMat.setMaximumSize(new java.awt.Dimension(210, 29));
        txtApeMat.setMinimumSize(new java.awt.Dimension(210, 29));
        txtApeMat.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanel1.add(txtApeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 210, -1));

        jLabel6.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel6.setText("Genero:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel7.setText("F. Fin:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        txtArea.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtArea.setMaximumSize(new java.awt.Dimension(210, 29));
        txtArea.setMinimumSize(new java.awt.Dimension(210, 29));
        txtArea.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanel1.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel8.setText("Mod. Contrato:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel9.setText("Jor. Laboral:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel10.setText("Fec. Nacimiento:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel11.setText("Salario:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtSalario.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtSalario.setMaximumSize(new java.awt.Dimension(210, 29));
        txtSalario.setMinimumSize(new java.awt.Dimension(210, 29));
        txtSalario.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 140, -1));

        jLabel12.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel12.setText("Foto:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 20));

        txtedadingre4.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre4.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre4.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre4.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanel1.add(txtedadingre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 50, -1));

        txtedadingre5.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre5.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre5.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre5.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanel1.add(txtedadingre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 140, -1));

        jLabel13.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel13.setText("Fecha Ingreso:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        txtedadingre6.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre6.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre6.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre6.setPreferredSize(new java.awt.Dimension(210, 29));
        txtedadingre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadingre6ActionPerformed(evt);
            }
        });
        jPanel1.add(txtedadingre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 210, -1));

        cboModContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plazo Determinado", "Plazo Indeterminado" }));
        jPanel1.add(cboModContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, -1));

        cboJorLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiempo Completo", "Tiempo Parcial" }));
        jPanel1.add(cboJorLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 140, -1));

        jLabel14.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel14.setText("Area:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        jLabel15.setText("F. Inicio:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        txtedadingre7.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre7.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre7.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre7.setPreferredSize(new java.awt.Dimension(210, 29));
        txtedadingre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadingre7ActionPerformed(evt);
            }
        });
        jPanel1.add(txtedadingre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 210, -1));

        txtedadingre8.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtedadingre8.setMaximumSize(new java.awt.Dimension(210, 29));
        txtedadingre8.setMinimumSize(new java.awt.Dimension(210, 29));
        txtedadingre8.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanel1.add(txtedadingre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 50, -1));

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        cboGenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGeneroItemStateChanged(evt);
            }
        });
        jPanel1.add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 140, -1));

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
        EmpleadoEditControlador eec = new EmpleadoEditControlador(this);
        boolean edit = eec.Actualizar(idEmp);
        
        if(edit == true){
            JOptionPane.showMessageDialog(null, "Se actualizo el empleado correctamente");
            Vista.EmpleadoView vista = new Vista.EmpleadoView();
            vista.setSize(700, 510);
            vista.setLocation(0, 0);
            Dashboard.panelContenido.removeAll();
            Dashboard.panelContenido.add(vista, BorderLayout.CENTER);
            Dashboard.panelContenido.revalidate();
            Dashboard.panelContenido.repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Error al registrar");
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

    private void cboGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGeneroItemStateChanged
        //        if (cboHospe.getSelectedIndex() >= 0) {
            //            String hosNombre = cboHospe.getSelectedItem().toString();
            //            cboTipo.setEnabled(true);
            //            cboTipo.removeAllItems();
            //            resNue.llenartipohabitacion(cboTipo, hosNombre);
            //        }
    }//GEN-LAST:event_cboGeneroItemStateChanged

    private void txtedadingre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadingre6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadingre6ActionPerformed

    private void txtApePatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApePatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApePatActionPerformed

    private void txtedadingre7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadingre7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadingre7ActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos;
    private javax.swing.JLabel IconGuardarEdit;
    private javax.swing.JLabel IconGuardarEditHover;
    private javax.swing.JLabel IconRegresar;
    private javax.swing.JLabel IconRegresarHover;
    private javax.swing.JPanel btnGuardarEdit;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtApeMat;
    public javax.swing.JTextField txtApePat;
    public javax.swing.JTextField txtArea;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtedadingre4;
    private javax.swing.JTextField txtedadingre5;
    private javax.swing.JTextField txtedadingre6;
    private javax.swing.JTextField txtedadingre7;
    private javax.swing.JTextField txtedadingre8;
    // End of variables declaration//GEN-END:variables
}
