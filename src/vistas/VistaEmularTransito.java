package vistas;

import dominio.peaje.Puesto;
import java.util.List;

public interface VistaEmularTransito {
    public void mostrarError(String mensaje);
    public void mostrarExito(String mensaje);
    public abstract void cargarPuestos(List<Puesto> puestos);
}