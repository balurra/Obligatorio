package controladores;

import dominio.peaje.EventosSistema;
import dominio.Fachada;
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
        fachada.agregar(this);
        vista.cargarRecargas(fachada.getRecargasPendientes());
    } 
    
    public void aprobarRecarga(int idRecarga){
        int cantRecargas = fachada.getRecargasPendientes().size();
        if (cantRecargas == 0) {
            vista.mostrarError("No hay recargas pendientes de aprobación");
        } else if (idRecarga == -1) {
            vista.mostrarError("Seleccionar recarga a aprobar");
        } else {
            fachada.aprobarRecarga(idRecarga, admin);
        }
    }
    
    @Override
    public void actualizar(Observable origen, Object evento) {
        if (evento.equals(EventosSistema.CAMBIO_DATOS)) {
            vista.cargarRecargas(fachada.getRecargasPendientes());
        }
    }
}