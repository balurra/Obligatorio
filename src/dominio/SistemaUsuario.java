package dominio;

import java.util.ArrayList;

public class SistemaUsuario {
    private ArrayList<Propietario> propietarios = new ArrayList<>();
    private ArrayList<Administrador> administradores = new ArrayList<>();
    
    public void agregarPropietario(Propietario propietario) {
        if (validarListaPropietarios(propietario)) {
            propietarios.add(propietario);
        }
    }

    private boolean validarListaPropietarios(Propietario propietario) {
        if (propietarios.contains(propietario)) {
            return false;
        }
        return true;
    }
    
    public void agregarAdministrador(Administrador admin) {
        if (validarListaAdministradores(admin)) {
            administradores.add(admin);
        }
    }

    private boolean validarListaAdministradores(Administrador admin) {
        if (administradores.contains(admin)) {
            return false;
        }
        return true;
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }
    
    
    
}
