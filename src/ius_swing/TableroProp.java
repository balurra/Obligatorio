package ius_swing;

import dominio.peaje.Bonificacion;
import dominio.peaje.Vehiculo;
import dominio.usuario.Propietario;

public class TableroProp extends javax.swing.JDialog {
    private Propietario prop;
    
   // DefaultTableModel dtmVehiculos = new DefaultTableModel();
    
    public TableroProp(java.awt.Frame parent, boolean modal, Propietario prop) {
        super(parent, modal);
        initComponents();
        this.prop = prop;
        setTitle("Tablero de control del propietario");
        mostrarDatos();
    }
    
    private void setDatosTablas(){
        //table vehiculos
        Object[] datosV = new Object[tbl_vehiculos.getColumnCount()];
        for(Vehiculo v:prop.getVehiculos()){
            datosV[0]=v.getMatricula();
            datosV[1]=v.getModelo();
            datosV[2]=v.getColor();
            datosV[3]=v.getTransitos().size();
            datosV[4]=v.gastosTotalesEnPeajes();
        }
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_saldo = new javax.swing.JLabel();
        lbl_nombre_propietario = new javax.swing.JLabel();
        lbl_cantidad_vehiculos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vehiculos = new javax.swing.JTable();
        lbl_cantidad_bonificaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_bonificaciones = new javax.swing.JTable();
        lbl_cantidad_transitos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_recargas = new javax.swing.JTable();
        lbl_cantidad_recargas = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_transitos = new javax.swing.JTable();
        lbl_cantidad_notificaciones = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        btn_recargar_saldo = new javax.swing.JButton();
        btn_borrar_notificaciones = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_saldo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_saldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dinero (1).png"))); // NOI18N
        lbl_saldo.setText("Saldo (int)");

        lbl_nombre_propietario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_nombre_propietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario (1).png"))); // NOI18N
        lbl_nombre_propietario.setText("Nombre completo");

        lbl_cantidad_vehiculos.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_vehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/coche (1).png"))); // NOI18N
        lbl_cantidad_vehiculos.setText("Nºvhs.");

        tbl_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Modelo", "Color", "#Transitos", "MontosTotales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_vehiculos);

        lbl_cantidad_bonificaciones.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_bonificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/factura (1).png"))); // NOI18N
        lbl_cantidad_bonificaciones.setText("Nºbs.");

        tbl_bonificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Puesto", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_bonificaciones);

        lbl_cantidad_transitos.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_transitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/peaje (1).png"))); // NOI18N
        lbl_cantidad_transitos.setText("Nºtrs.");

        tbl_recargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbl_recargas);

        lbl_cantidad_recargas.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_recargas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reembolso (1).png"))); // NOI18N
        lbl_cantidad_recargas.setText("Nºrs.");

        tbl_transitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tbl_transitos);

        lbl_cantidad_notificaciones.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/notificacion (1).png"))); // NOI18N
        lbl_cantidad_notificaciones.setText("Nºns.");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        btn_recargar_saldo.setBackground(new java.awt.Color(51, 255, 51));
        btn_recargar_saldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_recargar_saldo.setText("Recargar");
        btn_recargar_saldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_borrar_notificaciones.setBackground(new java.awt.Color(255, 102, 102));
        btn_borrar_notificaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_borrar_notificaciones.setText("Borrar");
        btn_borrar_notificaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_borrar_notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_notificacionesActionPerformed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(255, 102, 102));
        btn_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator4.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator5.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator6.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cantidad_vehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_cantidad_bonificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cantidad_transitos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cantidad_recargas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cantidad_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btn_recargar_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btn_borrar_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lbl_nombre_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator6)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_nombre_propietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cantidad_vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad_bonificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad_transitos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbl_cantidad_recargas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_recargar_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_cantidad_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_borrar_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrar_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_notificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrar_notificacionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar_notificaciones;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_recargar_saldo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable5;
    private javax.swing.JLabel lbl_cantidad_bonificaciones;
    private javax.swing.JLabel lbl_cantidad_notificaciones;
    private javax.swing.JLabel lbl_cantidad_recargas;
    private javax.swing.JLabel lbl_cantidad_transitos;
    private javax.swing.JLabel lbl_cantidad_vehiculos;
    private javax.swing.JLabel lbl_nombre_propietario;
    private javax.swing.JLabel lbl_saldo;
    private javax.swing.JTable tbl_bonificaciones;
    private javax.swing.JTable tbl_recargas;
    private javax.swing.JTable tbl_transitos;
    private javax.swing.JTable tbl_vehiculos;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() {
        lbl_saldo.setText("$" + prop.getSaldo());
        lbl_nombre_propietario.setText(prop.getNombreCompleto());
        lbl_cantidad_vehiculos.setText(Integer.toString(prop.getVehiculos().size()));
        lbl_cantidad_bonificaciones.setText(Integer.toString(prop.getBonificaciones().size()));
        lbl_cantidad_transitos.setText(Integer.toString(prop.cantidadTransitos()));
        lbl_cantidad_recargas.setText(Integer.toString(prop.getRecargas().size()));
        lbl_cantidad_notificaciones.setText(Integer.toString(prop.getNotificaciones().size()));
    }
}
