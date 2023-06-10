package ius_swing;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ingresar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salir = new javax.swing.JButton();
        btn_loginAdmin = new javax.swing.JButton();
        btn_loginProp = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_salir.setBackground(new java.awt.Color(227, 69, 65));
        btn_salir.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_loginAdmin.setBackground(new java.awt.Color(0, 153, 153));
        btn_loginAdmin.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_loginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btn_loginAdmin.setText("Soy administrador");
        btn_loginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginAdminActionPerformed(evt);
            }
        });

        btn_loginProp.setBackground(new java.awt.Color(0, 153, 153));
        btn_loginProp.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_loginProp.setForeground(new java.awt.Color(255, 255, 255));
        btn_loginProp.setText("Soy propietario");
        btn_loginProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginPropActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_loginAdmin)
                        .addGap(82, 82, 82))))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btn_loginProp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btn_loginProp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_loginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginAdmin() {
        Login login = new LoginAdmin(this, false);
        login.setVisible(true);
    }
    
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        salir();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_loginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginAdminActionPerformed
        loginAdmin();
    }//GEN-LAST:event_btn_loginAdminActionPerformed

    private void btn_loginPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginPropActionPerformed
        loginProp();
    }//GEN-LAST:event_btn_loginPropActionPerformed

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
    private javax.swing.JButton btn_loginAdmin;
    private javax.swing.JButton btn_loginProp;
    private javax.swing.JButton btn_salir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}