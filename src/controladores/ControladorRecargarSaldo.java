package controladores;

import dominio.Fachada;
import dominio.usuario.EventosPropietario;
import dominio.usuario.Propietario;
import observer.Observable;
import observer.Observador;
import vistas.VistaRecargarSaldo;

public class ControladorRecargarSaldo implements Observador{
    private Propietario prop;
    private VistaRecargarSaldo vista;

    public ControladorRecargarSaldo(Propietario prop, VistaRecargarSaldo vista) {
        this.prop = prop;
        this.vista = vista;
        Fachada.getInstancia().agregar(this);
        mostrarDatos();
    } 
    

    public void recargarSaldo(int monto) {
        this.prop.recargarSaldo(monto);
    }

    private void mostrarDatos() {
        vista.mostrarDatos(prop);
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        if(evento.equals(EventosPropietario.CAMBIO_DATOS)){
            mostrarDatos();
        }   
    }
    
}