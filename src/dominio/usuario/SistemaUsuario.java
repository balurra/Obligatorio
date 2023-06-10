package dominio.usuario;

import dominio.Fachada;
import dominio.peaje.EventosSistema;
import dominio.peaje.Recarga;
import java.util.ArrayList;
import java.util.List;

public class SistemaUsuario {
    private final List<Propietario> propietarios = new ArrayList<>();
    private final List<Administrador> administradores = new ArrayList<>();
    private final List<Sesion> logueados = new ArrayList<>();
    
    public List<Sesion> getLogueados() {
        return logueados;
    }
    
    public List<Propietario> getPropietarios() {
        return propietarios;
    }
    
    public Sesion loginProp(String cedula, String password) {
        Propietario prop = buscarProp(cedula);
        if (prop != null && validarLogin(prop, cedula, password)) {
            return login(prop);
        }
        return null;
    }

    public Sesion loginAdmin(String cedula, String password) throws UsuarioException {
        Administrador admin = buscarAdmin(cedula);
        if (admin != null) {
<<<<<<< HEAD
            if (validarListaLogueados(admin) &&
                validarLogin(admin, cedula, password)) {
                return login(admin);
            } else {
                throw new UsuarioException("El administrador ya está logueado");
=======
            if (validarLogin(admin, cedula, password)) {
                validarListaLogueados(admin);
                return login(admin);
>>>>>>> main
            }
        }
        return null;
    }
    
    public void aprobarRecarga(int idRecarga, Administrador admin) {
        Recarga recarga = buscarRecarga(idRecarga);
        recarga.aprobar(admin);
        Fachada.getInstancia().avisar(EventosSistema.CAMBIO_DATOS);
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
    
    public Propietario buscarProp(String cedula) {
        Propietario retorno = null;
        
        for (Propietario prop : propietarios) {
            if (cedula.equals(prop.getCedula())) {
                retorno = prop;
            }
        }

        return retorno;
    }
     
    public void cerrarSesion(Usuario usuario) {
        Sesion sesion = buscarSesion(usuario);
        if (sesion != null) {
            logueados.remove(sesion);
        }
    }
    
    public Recarga buscarRecarga(int id) {
        Recarga recarga = null;
        for (Recarga r : recargasPendientes()) {
            if (r.getId() == id) {
                recarga = r;
            }
        }
        return recarga;
    }
    
    public ArrayList<Recarga> recargasPendientes(){
        ArrayList<Recarga> recargas = new ArrayList();
        for (Propietario p : propietarios) {
            for (Recarga r : p.recargasPendientes()) {
                recargas.add(r);
            }
        }
        return recargas;
    }
    
    private Sesion buscarSesion(Usuario usuario) {
        for (Sesion s : logueados) {
            if (usuario.equals(s.getUsuario())) {
                return s;
            }
        }
        return null;
    }
    
    private Administrador buscarAdmin(String cedula) {
        Administrador retorno = null;
        
        for (Administrador admin : administradores) {
            if (cedula.equals(admin.getCedula())) {
                retorno = admin;
            }
        }

        return retorno;
    }
    
    private Sesion login(Usuario usuario) {
        Sesion sesion = new Sesion(usuario);
        logueados.add(sesion);
        return sesion;
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
    
<<<<<<< HEAD
    private boolean validarListaLogueados(Usuario usuario) {
        for(Sesion s : logueados) {
            if(s.getUsuario().equals(usuario)) {
                return false;
=======
    private void validarListaLogueados(Usuario usuario) throws UsuarioException {
        for(Sesion s : logueados) {
            if(s.getUsuario().equals(usuario)) {
                throw new UsuarioException("El usuario ya está logueado");
>>>>>>> main
            }
        }
    }
}