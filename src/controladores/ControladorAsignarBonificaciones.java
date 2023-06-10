package controladores;

import dominio.Fachada;
import dominio.peaje.PeajeException;
import dominio.peaje.Puesto;
import dominio.peaje.TipoBonificacion;
import dominio.usuario.Propietario;
import observer.Observable;
import observer.Observador;
import vistas.VistaAsignarBonificaciones;

public class ControladorAsignarBonificaciones implements Observador {
    private Fachada fachada = Fachada.getInstancia();
    private VistaAsignarBonificaciones vista;

    public ControladorAsignarBonificaciones(VistaAsignarBonificaciones vista) {
        this.vista = vista;
        vista.cargarBonifs(fachada.getTiposBonif());
        vista.cargarPuestos(fachada.getPuestos());
    }

    private TipoBonificacion buscarTipoBonifPorPos(int pos) {
        return fachada.buscarTipoBonifPorPos(pos);
    }

    private Puesto buscarPuestoPorPos(int pos) {
        return fachada.buscarPuestoPorPos(pos);
    }

    public Propietario buscarProp(String cedula) {
        Propietario prop = null;
        if (!cedula.isEmpty()) {
            prop = fachada.buscarProp(cedula);
            if (prop != null) {
                prop.agregar(this);
                vista.setNombreProp(prop.getNombreCompleto());
                vista.actualizarTabla(prop);
            } else {
                vista.mostrarError("No existe el propietario");
            }
        } else {
            vista.mostrarError("Ingresar cédula");
        }
        return prop;
    }

    public void asignarBonificacion(int posBonif, int posPuesto, String cedula) {
        Propietario prop = buscarProp(cedula);
        if (prop != null) {
            if (posBonif == -1) {
<<<<<<< HEAD
            vista.mostrarError("Seleccionar tipo de bonificación");
=======
                vista.mostrarError("Seleccionar tipo de bonificación");
>>>>>>> main
            } else if (posPuesto == -1) {
                vista.mostrarError("Seleccionar puesto");
            } else {
                TipoBonificacion tipoBonif = buscarTipoBonifPorPos(posBonif);
                Puesto puesto = buscarPuestoPorPos(posPuesto);
                try {
                    fachada.asignarBonificacion(prop, tipoBonif, puesto);
                    vista.mostrarExito("Bonificación asignada");
                } catch(PeajeException e) {
                    vista.mostrarError(e.getMessage());
                }
            }
        }
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        vista.actualizarTabla((Propietario)origen);
    }
}