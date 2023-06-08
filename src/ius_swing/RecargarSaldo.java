package ius_swing;

import controladores.ControladorRecargarSaldo;
import dominio.usuario.Propietario;
import vistas.VistaRecargarSaldo;

public class RecargarSaldo extends javax.swing.JDialog implements VistaRecargarSaldo{
    private ControladorRecargarSaldo controlador;
 
    public RecargarSaldo(java.awt.Frame parent, boolean modal, Propietario prop) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorRecargarSaldo(prop,this);
        setTitle("Recarga de saldo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lbl_saldo = new javax.swing.JLabel();
        lbl_nombre_propietario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_monto = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));

        lbl_saldo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_saldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dinero (1).png"))); // NOI18N
        lbl_saldo.setText("Saldo (int)");

        lbl_nombre_propietario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_nombre_propietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario (1).png"))); // NOI18N
        lbl_nombre_propietario.setText("Nombre completo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Monto a recargar:");

        tf_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_montoActionPerformed(evt);
            }
        });

        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(51, 255, 51));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lbl_nombre_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_nombre_propietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_saldo))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_montoActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        int monto = Integer.parseInt(tf_monto.getText());
        controlador.recargarSaldo(monto);
    }//GEN-LAST:event_btn_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_nombre_propietario;
    private javax.swing.JLabel lbl_saldo;
    private javax.swing.JTextField tf_monto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarDatos(Propietario prop) {
        lbl_saldo.setText("$" + prop.getSaldo());
        lbl_nombre_propietario.setText(prop.getNombreCompleto());
    }
}
