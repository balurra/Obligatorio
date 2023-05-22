package ius_swing;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnu_item_login = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnu_item_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Principal");

        mnu_item_login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnu_item_login.setText("Login");
        mnu_item_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_loginActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_item_login);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aplicación");

        mnu_item_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnu_item_salir.setText("Salir");
        mnu_item_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_salirActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_item_salir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_item_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_loginActionPerformed
        login();
    }//GEN-LAST:event_mnu_item_loginActionPerformed

    private void login() {
        Login login = new Login(this, false);
        login.setVisible(true);
    }

    private void mnu_item_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_salirActionPerformed
        salir();
    }//GEN-LAST:event_mnu_item_salirActionPerformed

    private void salir() throws HeadlessException {
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea salir?");
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnu_item_login;
    private javax.swing.JMenuItem mnu_item_salir;
    // End of variables declaration//GEN-END:variables
}
