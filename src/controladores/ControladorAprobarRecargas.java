package controladores;

import dominio.Fachada;
import dominio.peaje.EventosProp;
import dominio.usuario.Administrador;
import observer.Observable;
import observer.Observador;
import vistas.VistaAprobarRecargas;

public class ControladorAprobarRecargas implements Observador {
    private VistaAprobarRecargas vista;
    private Fachada fachada = Fachada.getInstancia();
    private Administrador admin;

    public ControladorAprobarRecargas(VistaAprobarRecargas vista, Administrador admin) {
        this.vista = vista;
        this.admin = admin;
        vista.cargarRecargas(fachada.getRecargasPendientes());
        fachada.agregarObservador(this);
    } 
    
    public void aprobarRecarga(int idRecarga){
        fachada.aprobarRecarga(idRecarga, admin);
    }
    
    @Override
    public void actualizar(Observable origen, Object evento) {
        if (evento.equals(EventosProp.CAMBIO_DATOS)) {
            vista.cargarRecargas(fachada.getRecargasPendientes());
        }
    }
}