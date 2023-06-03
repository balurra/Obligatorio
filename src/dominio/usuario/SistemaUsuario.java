package dominio.usuario;

import java.util.ArrayList;
import java.util.List;

public class SistemaUsuario {
    private final List<Propietario> propietarios = new ArrayList<>();
    private final List<Administrador> administradores = new ArrayList<>();
    private final List<Sesion> logueados = new ArrayList<>();
    
    public List<Sesion> getLogueados() {
        return logueados;
    }

    public Sesion loginProp(String cedula, String password) {
        Propietario propietario = null;
        Sesion sesion = null;
        
        for (Propietario prop : propietarios) {
            if (cedula.equals(prop.getCedula())) {
                propietario = prop;
            }
        }
        if (propietario != null) {
            sesion = login(cedula, password, propietario);
        }
        return sesion;
    }
    
    public Sesion loginAdmin(String cedula, String password) throws UsuarioException {
        Administrador administrador = null;
        Sesion sesion = null;
        
        for (Administrador admin : administradores) {
            if (cedula.equals(admin.getCedula())) {
                administrador = admin;
            }
        }
        if (administrador != null) {
            if (validarListaLogueados(administrador)) {
                sesion = login(cedula, password, administrador);
            } else {
                throw new UsuarioException("El administrador ya está logueado");
            }
        }
        
        return sesion;
    }
    
    public Propietario registrarProp(Propietario prop) {
        Propietario retorno = null;
        if (validarListaPropietarios(prop)) {
            propietarios.add(prop);
            retorno = prop;
        }
        return retorno;
    }
    
    public void registrarAdmin(Administrador admin) {
        if (validarListaAdministradores(admin)) {
            administradores.add(admin);
        }
    }
    
    private Sesion login(String cedula, String password, Usuario usuario) {
        if (usuario != null &&
            validarLogin(usuario, cedula, password)) {
            Sesion sesion = new Sesion(usuario);
            logueados.add(sesion);
            return sesion;
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
    
    private boolean validarListaLogueados(Usuario usuario) {
        for(Sesion s : logueados) {
            if(s.getUsuario().equals(usuario)) {
                return false;
            }
        }
        return true;
    }

    private Usuario buscarUsuario(String cedula) {
        Usuario retorno = null;
        for (Administrador admin : administradores) {
            if (cedula.equals(admin.getCedula())) {
                retorno = admin;
            }
        }
        if (retorno == null) {
            for (Propietario prop : propietarios) {
                if (cedula.equals(prop.getCedula())) {
                    retorno = prop;
                }
            }
        }
        
        return retorno;
    }
}