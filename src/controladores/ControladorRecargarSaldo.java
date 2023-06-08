package controladores;

import dominio.peaje.EventosProp;
import dominio.usuario.Propietario;
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

    public void recargarSaldo(int monto) {
        prop.recargarSaldo(monto);
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