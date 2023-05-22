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

        btn_salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_ingresar = new javax.swing.JMenu();
        mnu_item_loginAdmin = new javax.swing.JMenuItem();
        mnu_item_loginProp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_salir.setBackground(new java.awt.Color(0, 153, 153));
        btn_salir.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));

        mnu_ingresar.setBackground(new java.awt.Color(0, 153, 153));
        mnu_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        mnu_ingresar.setText("Loguearme");

        mnu_item_loginAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnu_item_loginAdmin.setText("Soy administrador");
        mnu_item_loginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_loginAdminActionPerformed(evt);
            }
        });
        mnu_ingresar.add(mnu_item_loginAdmin);

        mnu_item_loginProp.setText("Soy propietario");
        mnu_item_loginProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_loginPropActionPerformed(evt);
            }
        });
        mnu_ingresar.add(mnu_item_loginProp);

        jMenuBar1.add(mnu_ingresar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_item_loginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_loginAdminActionPerformed
        loginAdmin();
    }//GEN-LAST:event_mnu_item_loginAdminActionPerformed

    private void loginAdmin() {
        Login login = new LoginAdmin(this, false);
        login.setVisible(true);
    }
    
    private void mnu_item_loginPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_loginPropActionPerformed
        loginProp();
    }//GEN-LAST:event_mnu_item_loginPropActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        salir();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void loginProp() {
        Login login = new LoginProp(this, false);
        login.setVisible(true);
    }
    
    private void salir() throws HeadlessException {
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea salir?");
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnu_ingresar;
    private javax.swing.JMenuItem mnu_item_loginAdmin;
    private javax.swing.JMenuItem mnu_item_loginProp;
    // End of variables declaration//GEN-END:variables
}