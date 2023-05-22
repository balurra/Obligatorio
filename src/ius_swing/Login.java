package ius_swing;

import dominio.Fachada;
import dominio.usuario.Administrador;
import dominio.usuario.Propietario;
import dominio.usuario.Usuario;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JDialog {
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        pwd_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_username.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_username.setText("Usuario:");

        txt_username.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        lbl_password.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_password.setText("Contraseña:");

        btn_login.setBackground(new java.awt.Color(0, 153, 153));
        btn_login.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Ingresar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        pwd_password.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_username)
                            .addComponent(lbl_password)
                            .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(pwd_password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd_password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        login();
    }//GEN-LAST:event_btn_loginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField pwd_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void login() {
        String username = txt_username.getText();
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Ingresar nombre de usuario", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        String password = String.valueOf(pwd_password.getPassword());
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Ingresar contraseña", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        Usuario usuario = Fachada.getInstancia().login(username, password);
        if (usuario != null) {
            if(usuario instanceof Propietario) {
                TableroProp tableroProp = new TableroProp(null, false, (Propietario) usuario);
                tableroProp.setVisible(true);
            } else {
                TableroAdmin tableroAdmin = new TableroAdmin(null, false, (Administrador)usuario);
                tableroAdmin.setVisible(true);
            }
        } else  {
            JOptionPane.showMessageDialog(
                    this, 
                    "Datos incorrectos", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
