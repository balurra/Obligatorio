package ius_swing;

import dominio.Fachada;
import dominio.usuario.Propietario;
import dominio.usuario.Sesion;
import dominio.usuario.Usuario;
import java.awt.Frame;

public class LoginProp extends Login {

    public LoginProp(Frame parent, boolean modal) {
        super(parent, modal);
    }
    
    @Override
    public Sesion login(String cedula, String password) {
        return Fachada.getInstancia().loginProp(cedula, password);
    }

    @Override
    public void mostrarProximaInterfaz(Usuario usuario) {
        TableroProp tableroProp = new TableroProp(null, false, (Propietario) usuario);
        tableroProp.setVisible(true);
    }
}