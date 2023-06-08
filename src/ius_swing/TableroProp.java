package ius_swing;

import controladores.ControladorTableroProp;
import dominio.peaje.Bonificacion;
import dominio.peaje.Notificacion;
import dominio.peaje.Recarga;
import dominio.peaje.Transito;
import dominio.peaje.Vehiculo;
import dominio.usuario.Propietario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import vistas.VistaTableroProp;

public class TableroProp extends javax.swing.JFrame implements VistaTableroProp {
    private ControladorTableroProp controlador;
    private Propietario prop;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    private DefaultTableModel model3;
    private DefaultTableModel model4;
    private DefaultTableModel model5;
        
    public TableroProp(Propietario prop) {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.prop = prop;
        initComponents();
        crearTablas();
        controlador = new ControladorTableroProp(prop,this);
        setTitle("¡Bienvenid@ " + prop.getNombreCompleto() + "!");
    }
    
    @Override
    public void mostrarDatos() {
        lbl_saldo.setText("Saldo disponible: $" + prop.getSaldo());
        lbl_nombre_propietario.setText(prop.getNombreCompleto());
        lbl_cantidad_vehiculos.setText(Integer.toString(prop.getVehiculos().size()));
        lbl_cantidad_bonificaciones.setText(Integer.toString(prop.getBonificaciones().size()));
        lbl_cantidad_transitos.setText(Integer.toString(prop.transitosRealizados().size()));
        lbl_cantidad_recargas.setText(Integer.toString(prop.getRecargas().size()));
        lbl_cantidad_notificaciones.setText(Integer.toString(prop.getNotificaciones().size()));
    }

    @Override
    public void datosVehiculos(ArrayList<Vehiculo> vehiculos) {
        model1.setRowCount(0);
        for (Vehiculo v : vehiculos) {
            model1.addRow(new Object [] {
                v.getMatricula(),
                v.getModelo(),
                v.getColor(),
                v.getTransitos().size(),
                v.gastosTotalesEnPeajes()
            });
        }
    }

    @Override
    public void datosBonifs(ArrayList<Bonificacion> bonifs) {
        model2.setRowCount(0);
        for (Bonificacion b : bonifs) {
            model2.addRow(new Object [] {
                b.getTipoBonificacion().getNombre(),
                b.getPuesto().getNombre(),
                b.getFechaAsignada()
            });
        }
    }
    
    @Override
    public void datosTransitos(ArrayList<Transito> transitos) {
        transitos.sort((obj1, obj2) -> obj2.getFecha().compareTo(obj1.getFecha()));
        model3.setRowCount(0);
        for (Transito t : transitos) {
            String bonif = "Sin bonificación";
            if (t.getBonif() != null) {
                bonif = t.getBonif().getTipoBonificacion().getNombre();
            }
            model3.addRow(new Object [] {
                t.getPuesto().getNombre(),
                t.getVehiculo().getMatricula(),
                t.tarifaTransito().getCategoriaVehiculo().getNombre(),
                t.tarifaTransito().getMonto(),
                bonif,
                t.getMontoBonif(),
                t.getCosto(),
                t.getFecha()
            });
        }
    }

    @Override
    public void datosRecargas(ArrayList<Recarga> recargas) {
        recargas.sort((obj1, obj2) -> obj2.getFechaIniciada().compareTo(obj1.getFechaIniciada()));
        model4.setRowCount(0);
        for (Recarga r : recargas) {
            String admin = "Pendiente";
            if (r.getAdmin() != null) {
                admin = r.getAdmin().getNombreCompleto();
            }
            model4.addRow(new Object [] {
                r.getFechaIniciada(),
                r.getMonto(),
                r.getEstado(),
                admin
            });
        }
    }

    @Override
    public void datosNotifs(ArrayList<Notificacion> notifs) {
        notifs.sort((obj1, obj2) -> obj2.getFecha().compareTo(obj1.getFecha()));
        
        model5.setRowCount(0);
        for (Notificacion n : notifs) {
            model5.addRow(new Object [] {
                n.getFecha(),
                n.getNotificacion()
            });
        }
    }

    private void recargarSaldo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void mostrarProximaInterfaz() {
        RecargarSaldo recargarSaldo = new RecargarSaldo(this,false, prop);
        recargarSaldo.setVisible(true);
    }
    
    private void crearTablas() {
        model1 = new DefaultTableModel();
        model2 = new DefaultTableModel();
        model3 = new DefaultTableModel();
        model4 = new DefaultTableModel();
        model5 = new DefaultTableModel();

        tbl_vehiculos.setModel(model1);
        tbl_bonifs.setModel(model2);
        tbl_transitos.setModel(model3);
        tbl_recargas.setModel(model4);
        tbl_notifs.setModel(model5);
                
        model1.addColumn("Matrícula");
        model1.addColumn("Modelo");
        model1.addColumn("Color");
        model1.addColumn("Cant. tránsitos");
        model1.addColumn("Total gastado");

        model2.addColumn("Bonificación");
        model2.addColumn("Puesto");
        model2.addColumn("Fecha de asignación");

        model3.addColumn("Puesto");
        model3.addColumn("Matrícula");
        model3.addColumn("Tarifa");
        model3.addColumn("Costo tarifa");
        model3.addColumn("Bonificación");
        model3.addColumn("Descontado");
        model3.addColumn("Costo total");
        model3.addColumn("Fecha");
        
        model4.addColumn("Fecha");
        model4.addColumn("Monto");
        model4.addColumn("Estado");
        model4.addColumn("Administrador");

        model5.addColumn("Fecha");
        model5.addColumn("Mensaje");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_saldo = new javax.swing.JLabel();
        lbl_nombre_propietario = new javax.swing.JLabel();
        lbl_cantidad_vehiculos = new javax.swing.JLabel();
        lbl_cantidad_bonificaciones = new javax.swing.JLabel();
        lbl_cantidad_transitos = new javax.swing.JLabel();
        lbl_cantidad_recargas = new javax.swing.JLabel();
        lbl_cantidad_notificaciones = new javax.swing.JLabel();
        btn_recargar_saldo = new javax.swing.JButton();
        btn_borrar_notificaciones = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vehiculos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_bonifs = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_transitos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_recargas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_notifs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lbl_saldo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_saldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dinero.png"))); // NOI18N
        lbl_saldo.setText("Saldo disponible: *número*");

        lbl_nombre_propietario.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_nombre_propietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        lbl_nombre_propietario.setText("*nombre*");

        lbl_cantidad_vehiculos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_cantidad_vehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/coche.png"))); // NOI18N
        lbl_cantidad_vehiculos.setText("*#*");

        lbl_cantidad_bonificaciones.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_cantidad_bonificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/factura.png"))); // NOI18N
        lbl_cantidad_bonificaciones.setText("*#*");

        lbl_cantidad_transitos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_cantidad_transitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/peaje.png"))); // NOI18N
        lbl_cantidad_transitos.setText("*#*");

        lbl_cantidad_recargas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_cantidad_recargas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reembolso.png"))); // NOI18N
        lbl_cantidad_recargas.setText("*#*");

        lbl_cantidad_notificaciones.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        lbl_cantidad_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/notificacion.png"))); // NOI18N
        lbl_cantidad_notificaciones.setText("*#*");

        btn_recargar_saldo.setBackground(new java.awt.Color(101, 225, 101));
        btn_recargar_saldo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btn_recargar_saldo.setForeground(new java.awt.Color(255, 255, 255));
        btn_recargar_saldo.setText("Recargar");
        btn_recargar_saldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_recargar_saldo.setBorderPainted(false);
        btn_recargar_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recargar_saldoActionPerformed(evt);
            }
        });

        btn_borrar_notificaciones.setBackground(new java.awt.Color(227, 69, 65));
        btn_borrar_notificaciones.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btn_borrar_notificaciones.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar_notificaciones.setText("Borrar");
        btn_borrar_notificaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_borrar_notificaciones.setBorderPainted(false);
        btn_borrar_notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_notificacionesActionPerformed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(227, 69, 65));
        btn_cerrar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar.setText("Cerrar sesión");
        btn_cerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        tbl_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Modelo", "Color", "Cant. tránsitos", "Total gastado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_vehiculos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_vehiculos);
        if (tbl_vehiculos.getColumnModel().getColumnCount() > 0) {
            tbl_vehiculos.getColumnModel().getColumn(0).setResizable(false);
            tbl_vehiculos.getColumnModel().getColumn(1).setResizable(false);
            tbl_vehiculos.getColumnModel().getColumn(2).setResizable(false);
            tbl_vehiculos.getColumnModel().getColumn(3).setResizable(false);
            tbl_vehiculos.getColumnModel().getColumn(4).setResizable(false);
        }

        tbl_bonifs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bonificación", "Puesto", "Fecha de asignación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_bonifs.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_bonifs);
        if (tbl_bonifs.getColumnModel().getColumnCount() > 0) {
            tbl_bonifs.getColumnModel().getColumn(0).setResizable(false);
            tbl_bonifs.getColumnModel().getColumn(1).setResizable(false);
            tbl_bonifs.getColumnModel().getColumn(2).setResizable(false);
        }

        tbl_transitos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 10)); // NOI18N
        tbl_transitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Puesto", "Matrícula", "Tarifa", "Costo tarifa", "Bonificación", "Descontado", "Costo total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_transitos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_transitos);
        if (tbl_transitos.getColumnModel().getColumnCount() > 0) {
            tbl_transitos.getColumnModel().getColumn(0).setResizable(false);
            tbl_transitos.getColumnModel().getColumn(1).setResizable(false);
            tbl_transitos.getColumnModel().getColumn(2).setResizable(false);
            tbl_transitos.getColumnModel().getColumn(3).setResizable(false);
            tbl_transitos.getColumnModel().getColumn(4).setResizable(false);
            tbl_transitos.getColumnModel().getColumn(5).setResizable(false);
            tbl_transitos.getColumnModel().getColumn(6).setResizable(false);
            tbl_transitos.getColumnModel().getColumn(7).setResizable(false);
        }

        tbl_recargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Monto", "Estado", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane4.setViewportView(tbl_recargas);
        if (tbl_recargas.getColumnModel().getColumnCount() > 0) {
            tbl_recargas.getColumnModel().getColumn(0).setResizable(false);
            tbl_recargas.getColumnModel().getColumn(1).setResizable(false);
            tbl_recargas.getColumnModel().getColumn(2).setResizable(false);
            tbl_recargas.getColumnModel().getColumn(3).setResizable(false);
        }

        tbl_notifs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "Mensaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
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
        tbl_notifs.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbl_notifs);
        if (tbl_notifs.getColumnModel().getColumnCount() > 0) {
            tbl_notifs.getColumnModel().getColumn(0).setResizable(false);
            tbl_notifs.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nombre_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_cantidad_vehiculos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(lbl_cantidad_bonificaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_cantidad_recargas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_recargar_saldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_cantidad_transitos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_cantidad_notificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_borrar_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_saldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cantidad_vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad_bonificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad_transitos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_cantidad_recargas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_recargar_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_cantidad_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_borrar_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrar_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_notificacionesActionPerformed
        controlador.borrarNotificaciones();
    }//GEN-LAST:event_btn_borrar_notificacionesActionPerformed

    private void btn_recargar_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recargar_saldoActionPerformed
        mostrarProximaInterfaz();
    }//GEN-LAST:event_btn_recargar_saldoActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        controlador.cerrarSesion(prop);
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.cerrarSesion(prop);
    }//GEN-LAST:event_formWindowClosed

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
    private javax.swing.JLabel lbl_cantidad_bonificaciones;
    private javax.swing.JLabel lbl_cantidad_notificaciones;
    private javax.swing.JLabel lbl_cantidad_recargas;
    private javax.swing.JLabel lbl_cantidad_transitos;
    private javax.swing.JLabel lbl_cantidad_vehiculos;
    private javax.swing.JLabel lbl_nombre_propietario;
    private javax.swing.JLabel lbl_saldo;
    private javax.swing.JTable tbl_bonifs;
    private javax.swing.JTable tbl_notifs;
    private javax.swing.JTable tbl_recargas;
    private javax.swing.JTable tbl_transitos;
    private javax.swing.JTable tbl_vehiculos;
    // End of variables declaration//GEN-END:variables
}