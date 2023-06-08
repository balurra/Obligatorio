package vistas;

import dominio.usuario.Propietario;

public interface VistaRecargarSaldo {
    public void mostrarDatos(Propietario prop);
    public void mostrarError(String mensaje);
    public void mostrarExito(String mensaje);
}