package Vista;

//import Entidad.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;

public class Dashboard extends javax.swing.JPanel {

    boolean btnpackTPressed = false;
    boolean btnClientePressed = false;
    boolean btnHospedajePressed = false;
    boolean btnTipoHabitacionPressed = false;
    boolean btnReservaPressed = false;
    boolean btnPagoPressed = false;
    boolean btnReportePressed = false;
    boolean btnHabitacionPressed = false;

    public Dashboard() {
        initComponents();
        setSize(1100, 50);
        //Main.bar.setBackground(new Color(0,66,111));
        txtNombreUsuario.setText("Oscar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        txtIconUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JLabel();
        sideBar = new javax.swing.JPanel();
        btnEmpleado = new javax.swing.JPanel();
        selecEmpleados = new javax.swing.JPanel();
        txtEmpleado = new javax.swing.JLabel();
        btnBitacora = new javax.swing.JPanel();
        selecBitacora = new javax.swing.JPanel();
        txtBitacora = new javax.swing.JLabel();
        btnReporte = new javax.swing.JPanel();
        selecReporte = new javax.swing.JPanel();
        txtReporte = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        txtCerrarSesion = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 540));

        Header.setBackground(new java.awt.Color(72, 143, 177));
        Header.setMaximumSize(new java.awt.Dimension(1100, 30));
        Header.setMinimumSize(new java.awt.Dimension(1100, 30));
        Header.setPreferredSize(new java.awt.Dimension(1100, 30));

        txtIconUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/userLogo.png"))); // NOI18N
        txtIconUsuario.setMaximumSize(new java.awt.Dimension(30, 30));
        txtIconUsuario.setMinimumSize(new java.awt.Dimension(30, 30));
        txtIconUsuario.setPreferredSize(new java.awt.Dimension(30, 30));

        txtNombreUsuario.setBackground(new java.awt.Color(72, 143, 177));
        txtNombreUsuario.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setMaximumSize(new java.awt.Dimension(250, 30));
        txtNombreUsuario.setMinimumSize(new java.awt.Dimension(250, 30));
        txtNombreUsuario.setOpaque(true);
        txtNombreUsuario.setPreferredSize(new java.awt.Dimension(250, 30));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtIconUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIconUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sideBar.setBackground(new java.awt.Color(65, 72, 109));
        sideBar.setMaximumSize(new java.awt.Dimension(200, 510));
        sideBar.setMinimumSize(new java.awt.Dimension(200, 510));
        sideBar.setPreferredSize(new java.awt.Dimension(200, 510));
        sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpleado.setBackground(new java.awt.Color(65, 72, 109));
        btnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpleado.setMaximumSize(new java.awt.Dimension(200, 50));
        btnEmpleado.setMinimumSize(new java.awt.Dimension(200, 50));
        btnEmpleado.setPreferredSize(new java.awt.Dimension(200, 50));
        btnEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadoMouseClicked(evt);
            }
        });
        btnEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selecEmpleados.setBackground(new java.awt.Color(65, 72, 109));
        selecEmpleados.setMaximumSize(null);
        selecEmpleados.setMinimumSize(new java.awt.Dimension(5, 50));
        selecEmpleados.setName("[5, 50]"); // NOI18N
        selecEmpleados.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout selecEmpleadosLayout = new javax.swing.GroupLayout(selecEmpleados);
        selecEmpleados.setLayout(selecEmpleadosLayout);
        selecEmpleadosLayout.setHorizontalGroup(
            selecEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        selecEmpleadosLayout.setVerticalGroup(
            selecEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btnEmpleado.add(selecEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 0, -1, -1));

        txtEmpleado.setBackground(new java.awt.Color(65, 72, 109));
        txtEmpleado.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        txtEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/IconClientes.png"))); // NOI18N
        txtEmpleado.setText("Empleados");
        txtEmpleado.setMaximumSize(new java.awt.Dimension(200, 50));
        txtEmpleado.setMinimumSize(new java.awt.Dimension(200, 50));
        txtEmpleado.setPreferredSize(new java.awt.Dimension(200, 50));
        txtEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmpleadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmpleadoMousePressed(evt);
            }
        });
        btnEmpleado.add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, -1));

        sideBar.add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        btnBitacora.setBackground(new java.awt.Color(65, 72, 109));
        btnBitacora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBitacora.setMaximumSize(new java.awt.Dimension(200, 50));
        btnBitacora.setMinimumSize(new java.awt.Dimension(200, 50));
        btnBitacora.setPreferredSize(new java.awt.Dimension(200, 50));
        btnBitacora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selecBitacora.setBackground(new java.awt.Color(65, 72, 109));
        selecBitacora.setMaximumSize(null);
        selecBitacora.setMinimumSize(new java.awt.Dimension(5, 50));
        selecBitacora.setName("[5, 50]"); // NOI18N
        selecBitacora.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout selecBitacoraLayout = new javax.swing.GroupLayout(selecBitacora);
        selecBitacora.setLayout(selecBitacoraLayout);
        selecBitacoraLayout.setHorizontalGroup(
            selecBitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        selecBitacoraLayout.setVerticalGroup(
            selecBitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btnBitacora.add(selecBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 0, -1, -1));

        txtBitacora.setBackground(new java.awt.Color(65, 72, 109));
        txtBitacora.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        txtBitacora.setForeground(new java.awt.Color(255, 255, 255));
        txtBitacora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtBitacora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/IconReserva.png"))); // NOI18N
        txtBitacora.setText("Bitacoras");
        txtBitacora.setMaximumSize(new java.awt.Dimension(200, 50));
        txtBitacora.setMinimumSize(new java.awt.Dimension(200, 50));
        txtBitacora.setPreferredSize(new java.awt.Dimension(200, 50));
        txtBitacora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBitacoraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBitacoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBitacoraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBitacoraMousePressed(evt);
            }
        });
        btnBitacora.add(txtBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, -1));

        sideBar.add(btnBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        btnReporte.setBackground(new java.awt.Color(65, 72, 109));
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReporte.setMaximumSize(new java.awt.Dimension(200, 50));
        btnReporte.setMinimumSize(new java.awt.Dimension(200, 50));
        btnReporte.setPreferredSize(new java.awt.Dimension(200, 50));
        btnReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selecReporte.setBackground(new java.awt.Color(65, 72, 109));
        selecReporte.setMaximumSize(null);
        selecReporte.setMinimumSize(new java.awt.Dimension(5, 50));
        selecReporte.setName("[5, 50]"); // NOI18N
        selecReporte.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout selecReporteLayout = new javax.swing.GroupLayout(selecReporte);
        selecReporte.setLayout(selecReporteLayout);
        selecReporteLayout.setHorizontalGroup(
            selecReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        selecReporteLayout.setVerticalGroup(
            selecReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btnReporte.add(selecReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 10, -1));

        txtReporte.setBackground(new java.awt.Color(0, 66, 111));
        txtReporte.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        txtReporte.setForeground(new java.awt.Color(255, 255, 255));
        txtReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/IconReport.png"))); // NOI18N
        txtReporte.setText("Reportes");
        txtReporte.setMaximumSize(new java.awt.Dimension(200, 50));
        txtReporte.setMinimumSize(new java.awt.Dimension(200, 50));
        txtReporte.setPreferredSize(new java.awt.Dimension(200, 50));
        txtReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtReporteMousePressed(evt);
            }
        });
        btnReporte.add(txtReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, -1));

        sideBar.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(65, 72, 109));
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(200, 50));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(200, 50));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(200, 50));

        txtCerrarSesion.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        txtCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        txtCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCerrarSesion.setText("Cerrar Sesión");
        txtCerrarSesion.setMaximumSize(new java.awt.Dimension(200, 50));
        txtCerrarSesion.setMinimumSize(new java.awt.Dimension(200, 50));
        txtCerrarSesion.setPreferredSize(new java.awt.Dimension(200, 50));
        txtCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCerrarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sideBar.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido.setMaximumSize(new java.awt.Dimension(900, 510));
        panelContenido.setPreferredSize(new java.awt.Dimension(900, 510));

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleadoMouseEntered
        btnEmpleado.setBackground(new Color(72, 143, 177));
        selecEmpleados.setBackground(new Color(72, 143, 177));
    }//GEN-LAST:event_txtEmpleadoMouseEntered

    private void txtEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleadoMouseExited
        if (btnClientePressed == false) {
            btnEmpleado.setBackground(new Color(65, 72, 109));
            selecEmpleados.setBackground(new Color(65, 72, 109));
        }

    }//GEN-LAST:event_txtEmpleadoMouseExited

    private void txtBitacoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBitacoraMouseEntered
        btnBitacora.setBackground(new Color(72, 143, 177));
        selecBitacora.setBackground(new Color(72, 143, 177));
    }//GEN-LAST:event_txtBitacoraMouseEntered

    private void txtBitacoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBitacoraMouseExited
        if (btnReservaPressed == false) {
            btnBitacora.setBackground(new Color(65, 72, 109));
            selecBitacora.setBackground(new Color(65, 72, 109));
        }
    }//GEN-LAST:event_txtBitacoraMouseExited

    private void txtReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReporteMouseEntered
        btnReporte.setBackground(new Color(72, 143, 177));
        selecReporte.setBackground(new Color(72, 143, 177));
    }//GEN-LAST:event_txtReporteMouseEntered

    private void txtReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReporteMouseExited
        if (btnReportePressed == false) {
            btnReporte.setBackground(new Color(65, 72, 109));
            selecReporte.setBackground(new Color(65, 72, 109));
        }
    }//GEN-LAST:event_txtReporteMouseExited

    private void txtEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleadoMouseClicked
        
        Vista.EmpleadoView vista = new Vista.EmpleadoView();
        
        vista.setSize(900, 510);
        vista.setLocation(0, 0);
        Dashboard.panelContenido.removeAll();
        Dashboard.panelContenido.add(vista, BorderLayout.CENTER);
        Dashboard.panelContenido.revalidate();
        Dashboard.panelContenido.repaint();
        
    }//GEN-LAST:event_txtEmpleadoMouseClicked

    private void txtBitacoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBitacoraMouseClicked
        Vista.BitacoraView vistaBitacora = new BitacoraView();

        vistaBitacora.setSize(900, 510);
        vistaBitacora.setLocation(0, 0);

        panelContenido.removeAll();
        panelContenido.add(vistaBitacora, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_txtBitacoraMouseClicked

    private void txtReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReporteMouseClicked
//        Vista.Reportes vRep = new Vista.Reportes();
//
//        vRep.setSize(700, 510);
//
//        vRep.setLocation(0, 0);
//        Dashboard.panelContenido.removeAll();
//        Dashboard.panelContenido.add(vRep, BorderLayout.CENTER);
//        Dashboard.panelContenido.revalidate();
//        Dashboard.panelContenido.repaint();
    }//GEN-LAST:event_txtReporteMouseClicked

    private void txtCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(Color.red);
    }//GEN-LAST:event_txtCerrarSesionMouseEntered

    private void txtCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarSesionMouseExited
        btnCerrarSesion.setBackground(new Color(65, 72, 109));
    }//GEN-LAST:event_txtCerrarSesionMouseExited

    private void txtCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarSesionMouseClicked
//        ModuloLogin modLog = new ModuloLogin();
//        modLog.setSize(900, 540);
//        modLog.setLocation(0, 0);
//        Main.bar.setBackground(Color.white);
//        Main.bar.setOpaque(false);
//
//        Main.logeado = false;
//        Main.layout.removeAll();
//        Main.layout.add(modLog);
//        Main.layout.revalidate();
//        Main.layout.repaint();
//        ModuloLogin.txtUsuario.requestFocus();
    }//GEN-LAST:event_txtCerrarSesionMouseClicked

    private void txtEmpleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleadoMousePressed
        btnpackTPressed = false;
        btnClientePressed = true;
        btnHospedajePressed = false;
        btnTipoHabitacionPressed = false;
        btnHabitacionPressed = false;
        btnReservaPressed = false;
        btnPagoPressed = false;
        btnReportePressed = false;

        btnEmpleado.setBackground(new Color(72, 143, 177));
        
        btnBitacora.setBackground(new Color(65, 72, 109));
        btnReporte.setBackground(new Color(65, 72, 109));
        
        selecEmpleados.setBackground(new Color(234, 207, 121));
        
        selecBitacora.setBackground(new Color(65, 72, 109));
        selecReporte.setBackground(new Color(65, 72, 109));
    }//GEN-LAST:event_txtEmpleadoMousePressed

    private void txtBitacoraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBitacoraMousePressed
        btnpackTPressed = false;
        btnClientePressed = false;
        btnHospedajePressed = false;
        btnTipoHabitacionPressed = false;
        btnHabitacionPressed = false;
        btnReservaPressed = true;
        btnPagoPressed = false;
        btnReportePressed = false;

        
        btnEmpleado.setBackground(new Color(65, 72, 109));
        
        btnBitacora.setBackground(new Color(72, 143, 177));
        btnReporte.setBackground(new Color(65, 72, 109));

        
        selecEmpleados.setBackground(new Color(65, 72, 109));
        
        selecBitacora.setBackground(new Color(234, 207, 121));
        selecReporte.setBackground(new Color(65, 72, 109));
    }//GEN-LAST:event_txtBitacoraMousePressed

    private void txtReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReporteMousePressed
        btnpackTPressed = false;
        btnClientePressed = false;
        btnHospedajePressed = false;
        btnTipoHabitacionPressed = false;
        btnHabitacionPressed = false;
        btnReservaPressed = false;
        btnPagoPressed = false;
        btnReportePressed = true;

        
        btnEmpleado.setBackground(new Color(65, 72, 109));
        
        btnBitacora.setBackground(new Color(65, 72, 109));
        btnReporte.setBackground(new Color(72, 143, 177));

        
        selecEmpleados.setBackground(new Color(65, 72, 109));
        
        selecBitacora.setBackground(new Color(65, 72, 109));
        selecReporte.setBackground(new Color(234, 207, 121));
    }//GEN-LAST:event_txtReporteMousePressed

    private void btnEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMouseClicked
        Vista.EmpleadoView vist = new Vista.EmpleadoView();

        vist.setSize(700, 510);
        vist.setLocation(0, 0);
        panelContenido.removeAll();
        panelContenido.add(vist, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnEmpleadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnBitacora;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnEmpleado;
    private javax.swing.JPanel btnReporte;
    public static javax.swing.JPanel panelContenido;
    private javax.swing.JPanel selecBitacora;
    private javax.swing.JPanel selecEmpleados;
    private javax.swing.JPanel selecReporte;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel txtBitacora;
    private javax.swing.JLabel txtCerrarSesion;
    private javax.swing.JLabel txtEmpleado;
    private javax.swing.JLabel txtIconUsuario;
    private javax.swing.JLabel txtNombreUsuario;
    private javax.swing.JLabel txtReporte;
    // End of variables declaration//GEN-END:variables
}
