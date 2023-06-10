package ius_swing;

import dominio.usuario.Administrador;
import dominio.usuario.Usuario;
import java.awt.Frame;

public class LoginAdmin extends Login{

    public LoginAdmin(Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Ingresar como administrador");
    }

    @Override
    public void login(String cedula, String password){
        getControlador().login(cedula, password, "admin");
    }

    @Override
    public void mostrarProximaInterfaz(Usuario usuario) {
        dispose();
        TableroAdmin tableroAdmin = new TableroAdmin((Administrador)usuario);
        tableroAdmin.setVisible(true);
    }
}