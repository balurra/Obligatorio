package ius_swing;

import dominio.usuario.Propietario;
import dominio.usuario.Usuario;
import java.awt.Frame;

public class LoginProp extends Login {

    public LoginProp(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    public void login(String cedula, String password){
        getControlador().login(cedula, password, "prop");
    }

    @Override
    public void mostrarProximaInterfaz(Usuario usuario) {
        dispose();
        TableroProp tableroProp = new TableroProp(null, false, (Propietario)usuario); //null,false agregado
        tableroProp.setVisible(true);
    }
}