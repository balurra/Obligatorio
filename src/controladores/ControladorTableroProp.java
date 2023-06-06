package controladores;

import dominio.Fachada;
import dominio.usuario.EventosPropietario;
import dominio.usuario.Propietario;
import observer.Observable;
import observer.Observador;
import vistas.VistaTableroProp;

public class ControladorTableroProp implements Observador{
    private Propietario prop;
    private VistaTableroProp vista;

    public ControladorTableroProp(Propietario prop, VistaTableroProp vista) {
        this.prop = prop;
        this.vista = vista;
        Fachada.getInstancia().agregar(this);
        mostrarDatos();
        mostrarDetalles();
    }

    private void mostrarDatos() {
        vista.mostrarDatos(prop);
    }

    private void mostrarDetalles() {
        vista.mostrarDetalles(prop);
    }



    public void borrarNotificaciones() {
        this.prop.borrarNotificaciones();
    }
    
    @Override
    public void actualizar(Observable origen, Object evento) {
        if(evento.equals(EventosPropietario.CAMBIO_DATOS)){
            mostrarDatos();
            mostrarDetalles();
        }
    }

    public Propietario getProp() {
        return prop;
    }
    
    

}