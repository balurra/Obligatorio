package vistas;

import dominio.usuario.Usuario;

public interface VistaLogin {
    public void mostrarError(String mensaje);
    public abstract void login(String cedula, String password);
    public abstract void mostrarProximaInterfaz(Usuario usuario);
}