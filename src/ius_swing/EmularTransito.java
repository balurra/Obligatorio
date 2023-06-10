package ius_swing;

import controladores.ControladorEmularTransito;
import dominio.peaje.Puesto;
import dominio.peaje.Tarifa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas.VistaEmularTransito;

public class EmularTransito extends javax.swing.JDialog implements VistaEmularTransito {
    private final ControladorEmularTransito controlador;
    private final DefaultTableModel model;
    private boolean seInicializo = false;
    
    public EmularTransito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Emular tránsito");
        model = new DefaultTableModel();
        initComponents();
        setLocationRelativeTo(parent);
        controlador = new ControladorEmularTransito(this);
        seInicializo = true;
        tbl_tarifas.setModel(model);
        model.addColumn("Categoría");
        model.addColumn("Monto");
        cargarTarifas(cmb_puesto.getSelectedIndex());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_matricula = new javax.swing.JTextField();
        lbl_puesto = new javax.swing.JLabel();
        lbl_tarifas = new javax.swing.JLabel();
        lbl_matricula = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        cmb_puesto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tarifas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        txt_matricula.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        txt_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriculaActionPerformed(evt);
            }
        });

        lbl_puesto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        lbl_puesto.setText("Puesto:");

        lbl_tarifas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        lbl_tarifas.setText("Tarifas:");

        lbl_matricula.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        lbl_matricula.setText("Ingresar matrícula:");

        btn_registrar.setBackground(new java.awt.Color(0, 153, 153));
        btn_registrar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        cmb_puesto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmb_puesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_puestoItemStateChanged(evt);
            }
        });
        cmb_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_puestoActionPerformed(evt);
            }
        });

        tbl_tarifas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        tbl_tarifas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Categoría", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_tarifas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_tarifas);
        if (tbl_tarifas.getColumnModel().getColumnCount() > 0) {
            tbl_tarifas.getColumnModel().getColumn(0).setResizable(false);
            tbl_tarifas.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_puesto)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tarifas)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_puesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_matricula)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_puesto)
                    .addComponent(cmb_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tarifas)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_matricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        int puestoPos = cmb_puesto.getSelectedIndex();
        String matricula = txt_matricula.getText();
        controlador.emularTransito(puestoPos, matricula);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculaActionPerformed
    }//GEN-LAST:event_txt_matriculaActionPerformed

    private void cmb_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_puestoActionPerformed
        if (seInicializo) {
            cargarTarifas(cmb_puesto.getSelectedIndex());
        }
    }//GEN-LAST:event_cmb_puestoActionPerformed

    private void cmb_puestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_puestoItemStateChanged
    }//GEN-LAST:event_cmb_puestoItemStateChanged
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<Object> cmb_puesto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_matricula;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_tarifas;
    private javax.swing.JTable tbl_tarifas;
    private javax.swing.JTextField txt_matricula;
    // End of variables declaration//GEN-END:variables
<<<<<<< HEAD
=======
   
>>>>>>> main
    private void cargarTarifas(int puestoPos) {
        Puesto puesto = controlador.buscarPuestoPorPos(puestoPos);
        model.setRowCount(0);
        for (Tarifa t : puesto.getTarifas()) {
            model.addRow(new Object [] {
                t.getCategoriaVehiculo().getNombre(),
                t.getMonto()
            });
        }
    }
    
    @Override
    public void cargarPuestos(List<Puesto> puestos) {
        for (Puesto p : puestos) {
            cmb_puesto.addItem(p.getNombre());
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
}