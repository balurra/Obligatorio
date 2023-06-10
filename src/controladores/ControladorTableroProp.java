package controladores;

import dominio.Fachada;
import dominio.usuario.Propietario;
import observer.Observable;
import observer.Observador;
import dominio.peaje.EventosProp;
import dominio.peaje.Notificacion;
import dominio.peaje.Recarga;
import dominio.peaje.Transito;
import java.util.ArrayList;
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
        ArrayList<Transito> transitos = prop.transitosRealizados();
        transitos.sort((obj1, obj2) -> obj2.getFecha().compareTo(obj1.getFecha()));
        vista.datosTransitos(transitos);
    }
    
    private void datosRecargas() {
        ArrayList<Recarga> recargas = prop.getRecargas();
        recargas.sort((obj1, obj2) -> obj2.getFechaIniciada().compareTo(obj1.getFechaIniciada()));
        vista.datosRecargas(recargas);
    }
    
    private void datosNotifs() {
        ArrayList<Notificacion> notifs = prop.getNotificaciones();
        notifs.sort((obj1, obj2) -> obj2.getFecha().compareTo(obj1.getFecha()));
        vista.datosNotifs(notifs);
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