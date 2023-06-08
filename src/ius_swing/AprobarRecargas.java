package ius_swing;

import controladores.ControladorAprobarRecargas;
import dominio.peaje.Recarga;
import dominio.usuario.Administrador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas.VistaAprobarRecargas;

public class AprobarRecargas extends javax.swing.JDialog implements VistaAprobarRecargas {
    private ControladorAprobarRecargas controlador;
    private final DefaultTableModel model;
 
    public AprobarRecargas(java.awt.Frame parent, boolean modal, Administrador admin) {
        super(parent, modal);
        initComponents();
        model = new DefaultTableModel();
        tbl_recargas.setModel(model);
        model.addColumn("Fecha");
        model.addColumn("Propietario");
        model.addColumn("Monto");
        controlador = new ControladorAprobarRecargas(this, admin);
        setTitle("Aprobar recargas");
    }
    
    @Override
    public void cargarRecargas(List<Recarga> recargas) {
        model.setRowCount(0);
        for (Recarga r : recargas) {
            model.addRow(new Object [] {
                r.getId(),
                r.getFechaIniciada(),
                r.getProp().getNombreCompleto(),
                r.getMonto()
            });
        }
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_recargas = new javax.swing.JTable();
        lbl_recargas = new javax.swing.JLabel();
        btn_aprobar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbl_recargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Fecha", "Propietario", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_recargas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_recargas);
        if (tbl_recargas.getColumnModel().getColumnCount() > 0) {
            tbl_recargas.getColumnModel().getColumn(0).setResizable(false);
            tbl_recargas.getColumnModel().getColumn(1).setResizable(false);
            tbl_recargas.getColumnModel().getColumn(2).setResizable(false);
            tbl_recargas.getColumnModel().getColumn(3).setResizable(false);
        }

        lbl_recargas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_recargas.setText("Recargas pendientes:");

        btn_aprobar.setBackground(new java.awt.Color(0, 153, 153));
        btn_aprobar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_aprobar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aprobar.setText("Aprobar");
        btn_aprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_recargas)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_recargas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_aprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aprobarActionPerformed
        int idRecarga = (int)tbl_recargas.getValueAt(tbl_recargas.getSelectedRow(),0);
        controlador.aprobarRecarga(idRecarga);
    }//GEN-LAST:event_btn_aprobarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aprobar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_recargas;
    private javax.swing.JTable tbl_recargas;
    // End of variables declaration//GEN-END:variables
}