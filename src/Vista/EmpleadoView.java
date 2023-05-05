package Vista;

//import static Vista.ModuloLogin.txtUsuario;
import java.awt.BorderLayout;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class EmpleadoView extends javax.swing.JPanel {

//    Entidad.ClienteEnt c1 = new Entidad.ClienteEnt();
//    Modelo.ClienteMod c11 = new Modelo.ClienteMod();

    public EmpleadoView() {
        initComponents();
        setSize(700, 510);
        Vector v = new Vector();
        mostrarEmpleados(v);
        mostrar();

    }

    void mostrar() {
        IconNuevo.setVisible(true);
        IconNuevoHover.setVisible(false);
        IconEditar.setVisible(true);
        IconEditarHover.setVisible(false);
        IconEliminar.setVisible(true);
        IconEliminarHover.setVisible(false);

        Textp txtu = new Textp("Buscar DNI / Nombre", txtBuscarClie);
    }

    public void mostrarEmpleados(Vector vec) {
        Object objeto[][] = new Object[vec.size()][10];
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
//        for (int i = 0; i < vec.size(); i++) {
//            c1 = (Entidad.ClienteEnt) vec.elementAt(i);
//            tblclientes.clearSelection();
//            tblclientes.setValueAt(c1.getClienId(), i, 0);
//            tblclientes.setValueAt(c1.getClienDNI(), i, 1);
//            tblclientes.setValueAt(c1.getClienNom(), i, 2);
//            tblclientes.setValueAt(c1.getClienApe(), i, 3);
//            tblclientes.setValueAt(c1.getClienDirec(), i, 4);
//            tblclientes.setValueAt(c1.getClienEdad(), i, 5);
//            tblclientes.setValueAt(c1.getClienCel(), i, 6);
//
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        Derechos = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JPanel();
        IconNuevo = new javax.swing.JLabel();
        IconNuevoHover = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        IconEditar = new javax.swing.JLabel();
        IconEditarHover = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        IconEliminar = new javax.swing.JLabel();
        IconEliminarHover = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarClie = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 510));
        setMinimumSize(new java.awt.Dimension(700, 510));
        setPreferredSize(new java.awt.Dimension(700, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 510));

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        jLabel1.setText("LISTA DE EMPLEADOS");

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

        Derechos.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        Derechos.setForeground(new java.awt.Color(102, 102, 102));
        Derechos.setText("2022 © Microsense");

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setMaximumSize(new java.awt.Dimension(110, 42));
        btnNuevo.setMinimumSize(new java.awt.Dimension(110, 42));
        btnNuevo.setPreferredSize(new java.awt.Dimension(110, 42));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
        });

        IconNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnNuevo.png"))); // NOI18N

        IconNuevoHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconNuevoHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnNuevoHover.png"))); // NOI18N

        javax.swing.GroupLayout btnNuevoLayout = new javax.swing.GroupLayout(btnNuevo);
        btnNuevo.setLayout(btnNuevoLayout);
        btnNuevoLayout.setHorizontalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(IconNuevoHover, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        );
        btnNuevoLayout.setVerticalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNuevoLayout.createSequentialGroup()
                .addComponent(IconNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnNuevoLayout.createSequentialGroup()
                    .addComponent(IconNuevoHover, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setMaximumSize(new java.awt.Dimension(110, 42));
        btnEditar.setMinimumSize(new java.awt.Dimension(110, 42));
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 42));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });

        IconEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnEditar.png"))); // NOI18N

        IconEditarHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconEditarHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnEditarHover.png"))); // NOI18N

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconEditar)
            .addGroup(btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(IconEditarHover, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditarLayout.createSequentialGroup()
                .addComponent(IconEditar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEditarLayout.createSequentialGroup()
                    .addComponent(IconEditarHover, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setMaximumSize(new java.awt.Dimension(115, 42));
        btnEliminar.setMinimumSize(new java.awt.Dimension(115, 42));
        btnEliminar.setPreferredSize(new java.awt.Dimension(115, 42));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        IconEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnEliminar.png"))); // NOI18N

        IconEliminarHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconEliminarHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/btnEliminarHover.png"))); // NOI18N

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addComponent(IconEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEliminarLayout.createSequentialGroup()
                    .addComponent(IconEliminarHover, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addComponent(IconEliminar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEliminarLayout.createSequentialGroup()
                    .addComponent(IconEliminarHover, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.setBackground(new java.awt.Color(234, 230, 221));
        jPanel3.setMaximumSize(new java.awt.Dimension(200, 42));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 42));

        txtBuscarClie.setBackground(new java.awt.Color(234, 230, 221));
        txtBuscarClie.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtBuscarClie.setBorder(null);
        txtBuscarClie.setMaximumSize(new java.awt.Dimension(150, 20));
        txtBuscarClie.setMinimumSize(new java.awt.Dimension(150, 20));
        txtBuscarClie.setPreferredSize(new java.awt.Dimension(150, 20));
        txtBuscarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClieActionPerformed(evt);
            }
        });
        txtBuscarClie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarClieKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Derechos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(Derechos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        IconNuevo.setVisible(false);
        IconNuevoHover.setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        IconNuevo.setVisible(true);
        IconNuevoHover.setVisible(false);
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        Vista.Empleado_NuevoView vCliNue = new Vista.Empleado_NuevoView();

        vCliNue.setSize(700, 510);
        vCliNue.setLocation(0, 0);
        Dashboard.panelContenido.removeAll();
        Dashboard.panelContenido.add(vCliNue, BorderLayout.CENTER);
        Dashboard.panelContenido.revalidate();
        Dashboard.panelContenido.repaint();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        Vista.Empleado_EditarView vCliEdi = new Vista.Empleado_EditarView();

        vCliEdi.setSize(700, 510);
        vCliEdi.setLocation(0, 0);
        Dashboard.panelContenido.removeAll();
        Dashboard.panelContenido.add(vCliEdi, BorderLayout.CENTER);
        Dashboard.panelContenido.revalidate();
        Dashboard.panelContenido.repaint();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        IconEditar.setVisible(false);
        IconEditarHover.setVisible(true);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        IconEditar.setVisible(true);
        IconEditarHover.setVisible(false);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int idcliente;
        int fila = tblEmpleados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila en la tabla");
        } else {
            idcliente = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());
//            c11.eliminarcliente(idcliente);
//            mostrarclientes(c11.mostrarclientes());
            System.out.println("ID CLIENTE: " + idcliente);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        IconEliminar.setVisible(false);
        IconEliminarHover.setVisible(true);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        IconEliminar.setVisible(true);
        IconEliminarHover.setVisible(false);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void txtBuscarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClieActionPerformed
        
    }//GEN-LAST:event_txtBuscarClieActionPerformed

    private void txtBuscarClieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClieKeyTyped
        //mostrarclientes(c11.buscarclienteprincipal(txtBuscarClie.getText()));
    }//GEN-LAST:event_txtBuscarClieKeyTyped

    private void txtBuscarClieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarClieMouseClicked
        //
    }//GEN-LAST:event_txtBuscarClieMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos;
    private javax.swing.JLabel IconEditar;
    private javax.swing.JLabel IconEditarHover;
    private javax.swing.JLabel IconEliminar;
    private javax.swing.JLabel IconEliminarHover;
    private javax.swing.JLabel IconNuevo;
    private javax.swing.JLabel IconNuevoHover;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtBuscarClie;
    // End of variables declaration//GEN-END:variables
}