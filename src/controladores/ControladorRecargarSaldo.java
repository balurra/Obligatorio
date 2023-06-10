package controladores;

import dominio.peaje.EventosProp;
import dominio.usuario.Propietario;
import dominio.usuario.UsuarioException;
import observer.Observable;
import observer.Observador;
import vistas.VistaRecargarSaldo;

public class ControladorRecargarSaldo implements Observador {
    private VistaRecargarSaldo vista;
    private Propietario prop;

    public ControladorRecargarSaldo(VistaRecargarSaldo vista, Propietario prop) {
        this.vista = vista;
        this.prop = prop;
        prop.agregar(this);
        mostrarDatos();
    } 

    public void recargarSaldo(String monto) {
        try {
            if (monto.isEmpty()) {
                vista.mostrarError("Ingresar monto");
            } else if (!monto.matches("^-?\\d*\\.{0,1}\\d+$")) {
                vista.mostrarError("Ingresar números");
            } else {
                int montoInt = Integer.parseInt(monto);
                prop.recargarSaldo(montoInt);
                vista.mostrarExito("Se agregó la recarga a la lista de pendientes de aprobación");
            }
        } catch(UsuarioException e) {
            vista.mostrarError(e.getMessage());
        }
    }

    private void mostrarDatos() {
        vista.mostrarDatos(prop);
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        if (evento.equals(EventosProp.CAMBIO_DATOS)) {
            mostrarDatos();
        }    
    }
}