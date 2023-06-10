package ius_swing;

import controladores.ControladorRecargarSaldo;
import dominio.usuario.Propietario;
import javax.swing.JOptionPane;
import vistas.VistaRecargarSaldo;

public class RecargarSaldo extends javax.swing.JDialog implements VistaRecargarSaldo {
    private ControladorRecargarSaldo controlador;
 
    public RecargarSaldo(java.awt.Frame parent, boolean modal, Propietario prop) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        controlador = new ControladorRecargarSaldo(this, prop);
        setTitle("Recarga de saldo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_saldo = new javax.swing.JLabel();
        lbl_nombre_propietario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbl_saldo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_saldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dinero.png"))); // NOI18N
        lbl_saldo.setText("Saldo actual: $*#*");

        lbl_nombre_propietario.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_nombre_propietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        lbl_nombre_propietario.setText("Nombre completo");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Monto a recargar:");

        txt_monto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        txt_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_montoActionPerformed(evt);
            }
        });

        btn_aceptar.setBackground(new java.awt.Color(0, 153, 153));
        btn_aceptar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aceptar.setBorderPainted(false);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_nombre_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 77, Short.MAX_VALUE)
                        .addComponent(lbl_saldo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_saldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        controlador.recargarSaldo(txt_monto.getText());
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void txt_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_montoActionPerformed
<<<<<<< HEAD
        // TODO add your handling code here:
=======
>>>>>>> main
    }//GEN-LAST:event_txt_montoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_nombre_propietario;
    private javax.swing.JLabel lbl_saldo;
    private javax.swing.JTextField txt_monto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarDatos(Propietario prop) {
        lbl_saldo.setText("$" + prop.getSaldo());
        lbl_nombre_propietario.setText(prop.getNombreCompleto());
    }
    
    @Override
    public void mostrarExito(String mensaje) {
        JOptionPane.showMessageDialog(
                    this,
                    mensaje,
                    "¡Éxito!",
                    JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(
                    this,
                    mensaje,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
    }
}