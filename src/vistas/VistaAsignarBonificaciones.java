package vistas;

import dominio.peaje.Puesto;
import dominio.peaje.TipoBonificacion;
import dominio.usuario.Propietario;
import java.util.List;

public interface VistaAsignarBonificaciones {
    public void mostrarError(String mensaje);
    public void mostrarExito(String mensaje);
    public void actualizarTabla(Propietario prop);
    public void cargarPuestos(List<Puesto> puestos);
    public void cargarBonifs(List<TipoBonificacion> bonifs);
}