package ius_swing;

import controladores.ControladorTableroProp;
import dominio.peaje.Bonificacion;
import dominio.peaje.Notificacion;
import dominio.peaje.Recarga;
import dominio.peaje.Transito;
import dominio.peaje.Vehiculo;
import dominio.usuario.Propietario;
import java.util.ArrayList;
import vistas.VistaTableroProp;

public class TableroProp extends javax.swing.JDialog implements VistaTableroProp{
    private ControladorTableroProp controlador;
        
    public TableroProp(java.awt.Frame parent, boolean modal, Propietario prop) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorTableroProp(prop,this);
        setTitle("Tablero de control del propietario");
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_vehiculos = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        ta_bonificaciones = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        ta_transitos = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        ta_recargas = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        ta_notificaciones = new javax.swing.JTextArea();

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

        lbl_cantidad_bonificaciones.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_bonificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/factura (1).png"))); // NOI18N
        lbl_cantidad_bonificaciones.setText("Nºbs.");

        lbl_cantidad_transitos.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_transitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/peaje (1).png"))); // NOI18N
        lbl_cantidad_transitos.setText("Nºtrs.");

        lbl_cantidad_recargas.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_recargas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reembolso (1).png"))); // NOI18N
        lbl_cantidad_recargas.setText("Nºrs.");

        lbl_cantidad_notificaciones.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_cantidad_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/notificacion (1).png"))); // NOI18N
        lbl_cantidad_notificaciones.setText("Nºns.");

        btn_recargar_saldo.setBackground(new java.awt.Color(51, 255, 51));
        btn_recargar_saldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_recargar_saldo.setText("Recargar");
        btn_recargar_saldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_recargar_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recargar_saldoActionPerformed(evt);
            }
        });

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
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator4.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator5.setForeground(new java.awt.Color(0, 51, 255));

        jSeparator6.setForeground(new java.awt.Color(0, 51, 255));

        ta_vehiculos.setColumns(20);
        ta_vehiculos.setRows(5);
        jScrollPane6.setViewportView(ta_vehiculos);

        ta_bonificaciones.setColumns(20);
        ta_bonificaciones.setRows(5);
        jScrollPane7.setViewportView(ta_bonificaciones);

        ta_transitos.setColumns(20);
        ta_transitos.setRows(5);
        jScrollPane8.setViewportView(ta_transitos);

        ta_recargas.setColumns(20);
        ta_recargas.setRows(5);
        jScrollPane9.setViewportView(ta_recargas);

        ta_notificaciones.setColumns(20);
        ta_notificaciones.setRows(5);
        jScrollPane10.setViewportView(ta_notificaciones);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                            .addComponent(jScrollPane7)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane8)
                                    .addComponent(jScrollPane9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane10))))
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
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cantidad_bonificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lbl_cantidad_transitos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_cantidad_recargas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_recargar_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_cantidad_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_borrar_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar_notificaciones;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_recargar_saldo;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl_cantidad_bonificaciones;
    private javax.swing.JLabel lbl_cantidad_notificaciones;
    private javax.swing.JLabel lbl_cantidad_recargas;
    private javax.swing.JLabel lbl_cantidad_transitos;
    private javax.swing.JLabel lbl_cantidad_vehiculos;
    private javax.swing.JLabel lbl_nombre_propietario;
    private javax.swing.JLabel lbl_saldo;
    private javax.swing.JTextArea ta_bonificaciones;
    private javax.swing.JTextArea ta_notificaciones;
    private javax.swing.JTextArea ta_recargas;
    private javax.swing.JTextArea ta_transitos;
    private javax.swing.JTextArea ta_vehiculos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarDatos(Propietario prop) {
        lbl_saldo.setText("$" + prop.getSaldo());
        lbl_nombre_propietario.setText(prop.getNombreCompleto());
        lbl_cantidad_vehiculos.setText(Integer.toString(prop.getVehiculos().size()));
        lbl_cantidad_bonificaciones.setText(Integer.toString(prop.getBonificaciones().size()));
        lbl_cantidad_transitos.setText(Integer.toString(prop.cantidadTransitos()));
        lbl_cantidad_recargas.setText(Integer.toString(prop.getRecargas().size()));
        lbl_cantidad_notificaciones.setText(Integer.toString(prop.getNotificaciones().size()));
    }

    @Override
    public void mostrarDetalles(Propietario prop) {
        ta_vehiculos.setText(datosVehiculos(prop));
        ta_bonificaciones.setText(datosBonificaciones(prop));
        ta_transitos.setText(datosTransitos(prop));
        ta_recargas.setText(datosRecargas(prop));
        ta_notificaciones.setText(datosNotificaciones(prop)); 
    }

    private String datosVehiculos(Propietario prop) {
        String ret="";
        for(Vehiculo v:prop.getVehiculos()){
            ret+= "MATRICULA: " + v.getMatricula() + " | MODELO: " + v.getModelo() + " | COLOR: " + v.getColor() + 
                    " | #TRANSITOS: " + v.getTransitos().size() + " | MONTOS TOTALES: " + v.gastosTotalesEnPeajes() + "\n" 
                    + "--------------------------------------------------------------------------------------" + "\n";
        }
        return ret;
    }

    private String datosBonificaciones(Propietario prop) {
        String ret="";
        for(Bonificacion b:prop.getBonificaciones()){
            ret+= "NOMBRE: " + b.getTipoBonificacion().toString() + " | PUESTO: " + b.getPuesto().getNombre() + 
                    " | FECHA: " + b.getFechaAsignada() + "\n"
                    + "--------------------------------------------------------------------------------------" + "\n";
        }
        return ret; 
    }

    private String datosTransitos(Propietario prop) {
        String ret="";
        ArrayList<Transito> transitos = prop.transitosDelPropietario();
        transitos.sort((obj1, obj2) -> obj2.getFecha().compareTo(obj1.getFecha()));
        
        for(Transito t:transitos){
            ret+= "PUESTO: " + t.getPuesto().getNombre() + " | MATRICULA: " + t.getVehiculo().getMatricula() + 
                    " | TARIFA: " + t.tarifaTransito().getNombre() + " | MONTO TARIFA: " + t.tarifaTransito().getMonto() + 
                    " | BONIFICACION: " + t.getBonificacion().getTipoBonificacion() + " | MONTO BONIFICACION: "; //falta bonificacion, monto pagado y fecha
        }
        return ret;
    }

    private String datosRecargas(Propietario prop) {
        String ret="";
        prop.getRecargas().sort((obj1, obj2) -> obj2.getFechaIniciada().compareTo(obj1.getFechaIniciada()));
        for(Recarga r:prop.getRecargas()){
            ret+= "FECHA: " + r.getFechaIniciada() + " | MONTO: " + r.getMonto() + " | ESTADO: " + r.getEstado() + 
                    " | ADMINISTRADOR: " + r.getAdmin().getNombreCompleto() + "/n" 
                    + "--------------------------------------------------------------------------------------" + "\n";
        }
        return ret;
    }

    private String datosNotificaciones(Propietario prop) {
        String ret="";
        prop.getNotificaciones().sort((obj1, obj2) -> obj2.getFecha().compareTo(obj1.getFecha()));
        for(Notificacion n:prop.getNotificaciones()){
            ret+= "FECHA: " + n.getFecha() + " | MENSAJE: " + n.getNotificacion();
        }
        return ret;
    }

    private void recargarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void mostrarProximaInterfaz() {
        RecargarSaldo recargarSaldo = new RecargarSaldo(null,false, controlador.getProp());
        recargarSaldo.setVisible(true);
    }

}
