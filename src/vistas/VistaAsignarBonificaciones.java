package vistas;

import dominio.peaje.Puesto;
import dominio.peaje.TipoBonificacion;
import java.util.List;

public interface VistaAsignarBonificaciones {
    public void mostrarError(String mensaje);
    public void mostrarExito(String mensaje);
    public abstract void cargarPuestos(List<Puesto> puestos);
    public abstract void cargarBonifs(List<TipoBonificacion> bonifs);
}