package dominio;

import java.util.ArrayList;

public class Fachada {
    private static Fachada instancia = new Fachada();
    
    private SistemaPeaje sistemaPeaje = new SistemaPeaje();
    private SistemaUsuario sistemaUsuario = new SistemaUsuario();
    
    public static Fachada getInstancia() {
        return instancia;
    }

    public void agregarPropietario(Propietario propietario) {
        sistemaUsuario.agregarPropietario(propietario);
    }

    public void agregarAdministrador(Administrador admin) {
        sistemaUsuario.agregarAdministrador(admin);
    }

    public ArrayList<Propietario> getPropietarios() {
        return sistemaUsuario.getPropietarios();
    }

    public ArrayList<Administrador> getAdministradores() {
        return sistemaUsuario.getAdministradores();
    }

    public void agregarPuesto(Puesto puesto) {
        sistemaPeaje.agregarPuesto(puesto);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        sistemaPeaje.agregarVehiculo(vehiculo);
    }

    public Categoria agregarCategoria(Categoria categoria) {
        return sistemaPeaje.agregarCategoria(categoria);
    }

    public void agregarBonificacion(Bonificacion bonificacion) {
        sistemaPeaje.agregarBonificacion(bonificacion);
    }
    
    
    
    
    
    
}
