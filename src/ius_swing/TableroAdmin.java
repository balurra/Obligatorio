package ius_swing;

import vistas.VistaTableroAdmin;
import controladores.ControladorTableroAdmin;
import dominio.usuario.Administrador;
import javax.swing.JOptionPane;

public class TableroAdmin extends javax.swing.JFrame implements VistaTableroAdmin {
    private Administrador admin;
    private ControladorTableroAdmin controlador;
    
    public TableroAdmin(Administrador admin) {
        initComponents();
        this.admin = admin;
        controlador = new ControladorTableroAdmin(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lbl_bienvenida.setText("¡Bienvenid@ " + admin.getNombreCompleto() + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_emularTransito = new javax.swing.JButton();
        btn_asignarBonifs = new javax.swing.JButton();
        btn_aprobarRecargas = new javax.swing.JButton();
        btn_cerrarSesion = new javax.swing.JButton();
        lbl_bienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btn_emularTransito.setBackground(new java.awt.Color(0, 153, 153));
        btn_emularTransito.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_emularTransito.setForeground(new java.awt.Color(255, 255, 255));
        btn_emularTransito.setText("Emular tránsito");
        btn_emularTransito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emularTransitoActionPerformed(evt);
            }
        });

        btn_asignarBonifs.setBackground(new java.awt.Color(0, 153, 153));
        btn_asignarBonifs.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_asignarBonifs.setForeground(new java.awt.Color(255, 255, 255));
        btn_asignarBonifs.setText("Asignar bonificaciones");
        btn_asignarBonifs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarBonifsActionPerformed(evt);
            }
        });

        btn_aprobarRecargas.setBackground(new java.awt.Color(0, 153, 153));
        btn_aprobarRecargas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_aprobarRecargas.setForeground(new java.awt.Color(255, 255, 255));
        btn_aprobarRecargas.setText("Aprobar recargas");
        btn_aprobarRecargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aprobarRecargasActionPerformed(evt);
            }
        });

        btn_cerrarSesion.setBackground(new java.awt.Color(227, 69, 65));
        btn_cerrarSesion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btn_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrarSesion.setText("Cerrar sesión");
        btn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarSesionActionPerformed(evt);
            }
        });

        lbl_bienvenida.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        lbl_bienvenida.setText("¡Bienvenid@ *nombre*!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cerrarSesion)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btn_aprobarRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btn_asignarBonifs))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btn_emularTransito))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_bienvenida)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_bienvenida)
                .addGap(53, 53, 53)
                .addComponent(btn_emularTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_aprobarRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_asignarBonifs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btn_cerrarSesion)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_emularTransitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emularTransitoActionPerformed
        EmularTransito emularTransito = new EmularTransito(this, false);
        emularTransito.setVisible(true);
    }//GEN-LAST:event_btn_emularTransitoActionPerformed

    private void btn_asignarBonifsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarBonifsActionPerformed
        AsignarBonificaciones asignarBonifs = new AsignarBonificaciones(this, false);
        asignarBonifs.setVisible(true);
    }//GEN-LAST:event_btn_asignarBonifsActionPerformed

    private void btn_aprobarRecargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aprobarRecargasActionPerformed
        AprobarRecargas aprobarRecargas = new AprobarRecargas(this, false);
        aprobarRecargas.setVisible(true);
    }//GEN-LAST:event_btn_aprobarRecargasActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.cerrarSesion(admin);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    }//GEN-LAST:event_formWindowClosing

    private void btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSesionActionPerformed
        controlador.cerrarSesion(admin);
        dispose();
    }//GEN-LAST:event_btn_cerrarSesionActionPerformed
    
    @Override
    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(
                    this,
                    mensaje,
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aprobarRecargas;
    private javax.swing.JButton btn_asignarBonifs;
    private javax.swing.JButton btn_cerrarSesion;
    private javax.swing.JButton btn_emularTransito;
    private javax.swing.JLabel lbl_bienvenida;
    // End of variables declaration//GEN-END:variables
}