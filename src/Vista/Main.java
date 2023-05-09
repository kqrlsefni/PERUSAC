package Vista;

import Controlador.Controlador;
import javax.swing.UIManager;
//import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class Main extends javax.swing.JFrame {

    int xMouse, yMouse;
    Dashboard contenido = new Dashboard();
    static boolean logeado;
    static boolean btnCrearClicked;  

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        contenido.setSize(1100,540);
        contenido.setLocation(0,0);
        bar.setOpaque(false);

                //Main.bar.setBackground(new Color(0,66,111));
        layout.removeAll();
        layout.add(contenido);
        layout.revalidate();
        layout.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bar = new javax.swing.JPanel();
        layout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1100, 540));
        setPreferredSize(new java.awt.Dimension(1100, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setOpaque(false);
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });
        bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 30));

        layout.setBackground(new java.awt.Color(255, 255, 255));
        layout.setMaximumSize(new java.awt.Dimension(1100, 540));
        layout.setMinimumSize(new java.awt.Dimension(1100, 540));
        layout.setPreferredSize(new java.awt.Dimension(1100, 540));

        javax.swing.GroupLayout layoutLayout = new javax.swing.GroupLayout(layout);
        layout.setLayout(layoutLayout);
        layoutLayout.setHorizontalGroup(
            layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        layoutLayout.setVerticalGroup(
            layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barMouseDragged

    public static void main(String args[]) {
//        BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
//        BeautyEyeLNFHelper.translucencyAtFrameInactive = false;
//        UIManager.put("RootPane.setupButtonVisible", false);
//        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
         

                
                
                new Main().setVisible(true);
            
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel bar;
    public static javax.swing.JPanel layout;
    // End of variables declaration//GEN-END:variables
}
