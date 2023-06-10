package dominio.usuario;

import dominio.Fachada;
import dominio.peaje.EventosSistema;
import dominio.peaje.Recarga;
import java.util.ArrayList;
import java.util.List;
import observer.Observador;

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
        Sesion sesion = null;
        for (Sesion s : logueados) {
            if (usuario.equals(s.getUsuario())) {
                sesion = s;
            }
        }
        if (sesion != null) {
            logueados.remove(sesion);
        }
    }
    
    public void agregarObservador(Observador obs) {
        for (Propietario p : propietarios) {
            p.agregar(obs);
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
}