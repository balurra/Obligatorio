package vistas;

import dominio.peaje.Recarga;
import java.util.List;

public interface VistaAprobarRecargas {
    public void mostrarError(String mensaje);
    public void mostrarExito(String mensaje);
    public void cargarRecargas(List<Recarga> recargas);
}