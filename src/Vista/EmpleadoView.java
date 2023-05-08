package Vista;

//import static Vista.ModuloLogin.txtUsuario;
import Controlador.BoletaPagoControlador;
import Controlador.Controlador;
import Controlador.EmpleadoControlador;
import Controlador.EmpleadoEditControlador;
import java.awt.BorderLayout;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Empleado;
import modelo.EmpleadoConsultas;

public class EmpleadoView extends javax.swing.JPanel {

    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    
    public EmpleadoView() {
        initComponents();
        setSize(700, 510);
        mostrarEmpleados();
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
        btnPagar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 510));
        setMinimumSize(new java.awt.Dimension(900, 510));
        setPreferredSize(new java.awt.Dimension(900, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 510));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 510));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPagar.setBackground(new java.awt.Color(101, 101, 173));
        btnPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagarMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pago");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/IconPago.png"))); // NOI18N

        javax.swing.GroupLayout btnPagarLayout = new javax.swing.GroupLayout(btnPagar);
        btnPagar.setLayout(btnPagarLayout);
        btnPagarLayout.setHorizontalGroup(
            btnPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPagarLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnPagarLayout.setVerticalGroup(
            btnPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Derechos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
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
        Vista.Empleado_NuevoView vistaEmpNuevo = new Vista.Empleado_NuevoView();
         
        vistaEmpNuevo.setSize(900, 510);
        vistaEmpNuevo.setLocation(0, 0);
        Dashboard.panelContenido.removeAll();
        Dashboard.panelContenido.add(vistaEmpNuevo, BorderLayout.CENTER);
        Dashboard.panelContenido.revalidate();
        Dashboard.panelContenido.repaint();
       
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        int idEmp;
        int fila = tblEmpleados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else {
            idEmp = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());
            Vista.Empleado_EditarView vistaEmpEditar = new Vista.Empleado_EditarView(idEmp);

            vistaEmpEditar.setSize(900, 510);
            vistaEmpEditar.setLocation(0, 0);
            Dashboard.panelContenido.removeAll();
            Dashboard.panelContenido.add(vistaEmpEditar, BorderLayout.CENTER);
            Dashboard.panelContenido.revalidate();
            Dashboard.panelContenido.repaint();
            System.out.println("ID Empleado: " + idEmp);
            EmpleadoEditControlador eec = new EmpleadoEditControlador(vistaEmpEditar);
            eec.llenarCampos(idEmp);
        }
        
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
        int idEmp;
        int fila = tblEmpleados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else {
            idEmp = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());
            int res = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el regitro?", "ELIMINAR EMPLEADO", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(res == 0){
                EmpleadoControlador ec = new EmpleadoControlador();
                boolean d = ec.Eliminar(idEmp);
                if(d == true){
                JOptionPane.showMessageDialog(null, "Se elimino correctmente");
                mostrarEmpleados();
                }else{
                 JOptionPane.showMessageDialog(null, "Error al eliminar");
                }
                
            }
//            c11.eliminarcliente(idcliente);
//            mostrarclientes(c11.mostrarclientes());
            System.out.println("ID Empleado: " + idEmp);
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

    private void btnPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarMouseClicked
        int idEmp;
        int fila = tblEmpleados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else{
            idEmp = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());
            Vista.BoletaPagoView vistaBoletaPago = new Vista.BoletaPagoView(idEmp);

            vistaBoletaPago.setSize(900, 510);
            vistaBoletaPago.setLocation(0, 0);
            Dashboard.panelContenido.removeAll();
            Dashboard.panelContenido.add(vistaBoletaPago, BorderLayout.CENTER);
            Dashboard.panelContenido.revalidate();
            Dashboard.panelContenido.repaint();
            BoletaPagoControlador bpc = new BoletaPagoControlador(vistaBoletaPago);
            bpc.llenarCampos(idEmp);
        }
    }//GEN-LAST:event_btnPagarMouseClicked



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
    private javax.swing.JPanel btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtBuscarClie;
    // End of variables declaration//GEN-END:variables
}
