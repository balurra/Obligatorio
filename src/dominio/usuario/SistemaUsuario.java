package dominio.usuario;

import java.util.ArrayList;
import java.util.List;

public class SistemaUsuario {
    private List<Propietario> propietarios = new ArrayList<>();
    private List<Administrador> administradores = new ArrayList<>();
    private List<Sesion> logueados = new ArrayList<>();
    
    public List<Sesion> getLogueados() {
        return logueados;
    }

    public Sesion loginProp(String cedula, String password) {
        Sesion sesion = login(cedula, password, propietarios);
        return sesion;
    }
    
    public Sesion loginAdmin(String cedula, String password) {
        Sesion sesion = login(cedula, password, administradores);
        return sesion;
    }
    
    public void registrarProp(Propietario prop) {
        if (validarListaPropietarios(prop)) {
            propietarios.add(prop);
        }
    }
    
    public void registrarAdmin(Administrador admin) {
        if (validarListaAdministradores(admin)) {
            administradores.add(admin);
        }
    }
    
    private Sesion login(String cedula, String password, List usuarios) {
        Usuario usuario;
        for (Object usuarioObj : usuarios) {
            usuario = (Usuario) usuarioObj;
            if (validarLogin(usuario, cedula, password)) {
                Sesion sesion = new Sesion(usuario);
                if (validarListaLogueados(sesion)) {
                    logueados.add(sesion);
                    return sesion;
                }
            }
        }
        return null;
    }
    
    private static boolean validarLogin(Usuario usuario, String cedula, String password) {
        return usuario.getCedula().equals(cedula) &&
               usuario.getPassword().equals(password);
    }

    private boolean validarListaPropietarios(Propietario prop) {
        return !propietarios.contains(prop) && prop.validarUsuario();
    }
    
    private boolean validarListaAdministradores(Administrador admin) {
        return !administradores.contains(admin) && admin.validarUsuario();
    }
    
    private boolean validarListaLogueados(Sesion sesion) {
        for(Sesion s : logueados) {
            if(s.getUsuario().equals(sesion.getUsuario())) {
                return false;
            }
        }
        return true;
    }
}