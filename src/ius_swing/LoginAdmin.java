package ius_swing;

import dominio.Fachada;
import dominio.usuario.Administrador;
import dominio.usuario.Sesion;
import dominio.usuario.Usuario;
import java.awt.Frame;

public class LoginAdmin extends Login {

    public LoginAdmin(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    public Sesion login(String cedula, String password) {
        return Fachada.getInstancia().loginAdmin(cedula, password);
    }

    @Override
    public void mostrarProximaInterfaz(Usuario usuario) {
        TableroAdmin tableroAdmin = new TableroAdmin(null, false, (Administrador)usuario);
        tableroAdmin.setVisible(true);
    }
}