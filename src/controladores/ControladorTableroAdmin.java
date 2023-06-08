package controladores;

import dominio.Fachada;
import vistas.VistaTableroAdmin;
import dominio.usuario.Administrador;

public class ControladorTableroAdmin {
    private Fachada fachada = Fachada.getInstancia();
    private VistaTableroAdmin vista;

    public ControladorTableroAdmin(VistaTableroAdmin vista) {
        this.vista = vista;
    }
    
    public void cerrarSesion(Administrador admin){
        fachada.cerrarSesion(admin);
    }
}