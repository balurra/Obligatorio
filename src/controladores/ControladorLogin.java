package controladores;

import dominio.Fachada;
import dominio.usuario.Sesion;
import dominio.usuario.UsuarioException;
import vistas.VistaLogin;

public class ControladorLogin  {
    private Fachada fachada = Fachada.getInstancia();
    private VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }

    public void login(String cedula, String password, String tipoUsuario){
        if (validarCampos(cedula, password)) {
            try {
                Sesion sesion;
                if (tipoUsuario.equals("admin")) {
                    sesion = fachada.loginAdmin(cedula, password);
                } else {
                    sesion = fachada.loginProp(cedula, password);
                }

                if (sesion != null) {
                    vista.mostrarProximaInterfaz(sesion.getUsuario());
                } else {
                    vista.mostrarError("Datos incorrectos");
                }
            } catch (UsuarioException e){
                vista.mostrarError(e.getMessage());
            }
        } else {
            vista.mostrarError("Completar los campos");
        }
    }
    
    private boolean validarCampos(String cedula, String password) {
        return !cedula.isEmpty() && !password.isEmpty();
    }
}