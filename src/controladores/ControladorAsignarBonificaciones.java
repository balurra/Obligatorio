package controladores;

import dominio.Fachada;
import dominio.peaje.PeajeException;
import dominio.peaje.Puesto;
import dominio.peaje.TipoBonificacion;
import dominio.usuario.Propietario;
import vistas.VistaAsignarBonificaciones;

public class ControladorAsignarBonificaciones {
    private Fachada fachada = Fachada.getInstancia();
    private VistaAsignarBonificaciones vista;

    public ControladorAsignarBonificaciones(VistaAsignarBonificaciones vista) {
        this.vista = vista;
        vista.cargarBonifs(fachada.getTiposBonif());
        vista.cargarPuestos(fachada.getPuestos());
    }

    public TipoBonificacion buscarTipoBonifPorPos(int pos) {
        return fachada.buscarTipoBonifPorPos(pos);
    }

    public Puesto buscarPuestoPorPos(int pos) {
        return fachada.buscarPuestoPorPos(pos);
    }

    public Propietario buscarProp(String cedula) {
        Propietario prop = fachada.buscarProp(cedula);
        if (prop  == null) {
            vista.mostrarError("No existe el propietario");
        }
        return prop;
    }

    public void asignarBonificacion(Propietario prop, TipoBonificacion tipoBonif, Puesto puesto) {
        try {
            fachada.asignarBonificacion(prop, tipoBonif, puesto);
            vista.mostrarExito("Bonificación asignada");
        } catch(PeajeException e) {
            vista.mostrarError(e.getMessage());
        }
    }
}