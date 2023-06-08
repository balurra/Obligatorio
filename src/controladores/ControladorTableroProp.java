package controladores;

import dominio.Fachada;
import dominio.usuario.Propietario;
import observer.Observable;
import observer.Observador;
import dominio.peaje.EventosProp;
import vistas.VistaTableroProp;

public class ControladorTableroProp implements Observador{
    private Propietario prop;
    private VistaTableroProp vista;
    private Fachada fachada = Fachada.getInstancia();

    public ControladorTableroProp(Propietario prop, VistaTableroProp vista) {
        this.prop = prop;
        this.vista = vista;
        prop.agregar(this);
        mostrarDatos();
        mostrarListas();
    }
    
    private void mostrarListas() {
        datosVehiculos();
        datosBonifs();
        datosTransitos();
        datosRecargas();
        datosNotifs();
    }

    private void mostrarDatos() {
        vista.mostrarDatos();
    }

    private void datosVehiculos() {
        vista.datosVehiculos(prop.getVehiculos());
    }
    
    private void datosBonifs() {
        vista.datosBonifs(prop.getBonificaciones());
    }
    
    private void datosTransitos() {
        vista.datosTransitos(prop.transitosRealizados());
    }
    
    private void datosRecargas() {
        vista.datosRecargas(prop.getRecargas());
    }
    
    private void datosNotifs() {
        vista.datosNotifs(prop.getNotificaciones());
    }

    public void borrarNotificaciones() {
        prop.borrarNotificaciones();
    }
    
    public void cerrarSesion(Propietario prop){
        fachada.cerrarSesion(prop);
    }
    
    @Override
    public void actualizar(Observable origen, Object evento) {
        if (evento.equals(EventosProp.CAMBIO_DATOS)) {
            mostrarDatos();
            mostrarListas();
        }
    }
}