package ius_swing;

import dominio.usuario.Administrador;

public class TableroAdmin extends javax.swing.JFrame {
    public TableroAdmin(Administrador admin) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_emularTransito = new javax.swing.JButton();
        btn_asignarBonifs = new javax.swing.JButton();
        btn_aprobarRecargas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(btn_emularTransito)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btn_emularTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_aprobarRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_asignarBonifs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aprobarRecargas;
    private javax.swing.JButton btn_asignarBonifs;
    private javax.swing.JButton btn_emularTransito;
    // End of variables declaration//GEN-END:variables
}