package ius_swing;

import controladores.ControladorAsignarBonificaciones;
import dominio.peaje.Bonificacion;
import dominio.peaje.Puesto;
import dominio.peaje.TipoBonificacion;
import dominio.usuario.Propietario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import observer.Observable;
import observer.Observador;
import vistas.VistaAsignarBonificaciones;

public class AsignarBonificaciones extends javax.swing.JDialog implements VistaAsignarBonificaciones, Observador {
    private final ControladorAsignarBonificaciones controlador;
    private final DefaultTableModel model;
    
    public AsignarBonificaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Asignar bonificaciones");
        initComponents();
        controlador = new ControladorAsignarBonificaciones(this);
        model = new DefaultTableModel();
        tbl_bonificacion.setModel(model);
        model.addColumn("Bonificación");
        model.addColumn("Puesto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bonificacion = new javax.swing.JTable();
        cmb_bonif = new javax.swing.JComboBox<>();
        cmb_puesto = new javax.swing.JComboBox<>();
        txt_cedula = new javax.swing.JTextField();
        btn_buscarProp = new javax.swing.JButton();
        btn_asignarBonif = new javax.swing.JButton();
        lbl_bonifs = new javax.swing.JLabel();
        lbl_puestos = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_prop = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbl_bonificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Bonificación", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_bonificacion.getTableHeader().setReorderingAllowed(false);
        tbl_bonificacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbl_bonificacionPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bonificacion);
        if (tbl_bonificacion.getColumnModel().getColumnCount() > 0) {
            tbl_bonificacion.getColumnModel().getColumn(0).setResizable(false);
            tbl_bonificacion.getColumnModel().getColumn(1).setResizable(false);
        }

        cmb_bonif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_bonif.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_bonifItemStateChanged(evt);
            }
        });
        cmb_bonif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_bonifActionPerformed(evt);
            }
        });

        cmb_puesto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        btn_buscarProp.setBackground(new java.awt.Color(0, 153, 153));
        btn_buscarProp.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btn_buscarProp.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarProp.setText("Buscar");
        btn_buscarProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPropActionPerformed(evt);
            }
        });

        btn_asignarBonif.setBackground(new java.awt.Color(0, 153, 153));
        btn_asignarBonif.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_asignarBonif.setForeground(new java.awt.Color(255, 255, 255));
        btn_asignarBonif.setText("Asignar");
        btn_asignarBonif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarBonifActionPerformed(evt);
            }
        });

        lbl_bonifs.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        lbl_bonifs.setText("Bonificaciones:");

        lbl_puestos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        lbl_puestos.setText("Puestos:");

        lbl_cedula.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        lbl_cedula.setText("Cédula:");

        lbl_prop.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        lbl_prop.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btn_asignarBonif, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_bonifs)
                                    .addComponent(lbl_puestos)
                                    .addComponent(lbl_cedula))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_puesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_bonif, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscarProp))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbl_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_bonif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_bonifs))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_puestos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarProp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbl_cedula)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_prop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_asignarBonif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_bonifItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_bonifItemStateChanged

    }//GEN-LAST:event_cmb_bonifItemStateChanged

    private void cmb_bonifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_bonifActionPerformed
    }//GEN-LAST:event_cmb_bonifActionPerformed

    private void cmb_puestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_puestoItemStateChanged
    }//GEN-LAST:event_cmb_puestoItemStateChanged

    private void cmb_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_puestoActionPerformed
    }//GEN-LAST:event_cmb_puestoActionPerformed

    private void btn_buscarPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPropActionPerformed
        if (!txt_cedula.getText().isEmpty()) {
            Propietario prop = controlador.buscarProp(txt_cedula.getText());
            if (prop != null) {
                lbl_prop.setText(prop.getNombreCompleto());
                actualizarTabla(prop);
            }
        } else {
            mostrarError("Ingresar cédula");
        }
    }//GEN-LAST:event_btn_buscarPropActionPerformed

    private void btn_asignarBonifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarBonifActionPerformed
        if (cmb_bonif.getSelectedItem() != null){
            if (cmb_puesto.getSelectedItem() != null) {
                if (!txt_cedula.getText().isEmpty()) {
                    TipoBonificacion tipoBonif = controlador.buscarTipoBonifPorPos(cmb_bonif.getSelectedIndex());
                    Puesto puesto = controlador.buscarPuestoPorPos(cmb_puesto.getSelectedIndex());
                    Propietario prop = controlador.buscarProp(txt_cedula.getText());
                    if (prop != null) {
                        controlador.asignarBonificacion(prop, tipoBonif, puesto);
                        prop.agregar(this);
                        prop.avisar(evt);
                    }
                } else {
                    mostrarError("Ingresar cédula");
                }
            } else {
                mostrarError("Seleccionar puesto");
            }
        } else  {
            mostrarError("Seleccionar tipo de bonificación");
        }
    }//GEN-LAST:event_btn_asignarBonifActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void tbl_bonificacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbl_bonificacionPropertyChange
    }//GEN-LAST:event_tbl_bonificacionPropertyChange

    private void actualizarTabla(Propietario prop) {
        model.setRowCount(0);
        for (Bonificacion b : prop.getBonificaciones()) {
            model.addRow(new Object [] {
                b.getTipoBonificacion().getNombre(),
                b.getPuesto().getNombre()
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
    public void cargarBonifs(List<TipoBonificacion> bonifs) {
        for (TipoBonificacion tb : bonifs) {
            cmb_bonif.addItem(tb.getNombre());
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
    
    @Override
    public void actualizar(Observable origen, Object evento) {
        actualizarTabla((Propietario)origen);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignarBonif;
    private javax.swing.JButton btn_buscarProp;
    private javax.swing.JComboBox<Object> cmb_bonif;
    private javax.swing.JComboBox<Object> cmb_puesto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_bonifs;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_prop;
    private javax.swing.JLabel lbl_puestos;
    private javax.swing.JTable tbl_bonificacion;
    private javax.swing.JTextField txt_cedula;
    // End of variables declaration//GEN-END:variables
}