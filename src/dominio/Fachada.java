package dominio;

import dominio.peaje.Bonificacion;
import dominio.peaje.CatVehiculo;
import dominio.peaje.Puesto;
import dominio.peaje.SistemaPeaje;
import dominio.usuario.SistemaUsuario;
import dominio.peaje.Vehiculo;
import dominio.usuario.Administrador;
import dominio.usuario.Propietario;
import dominio.usuario.Sesion;
import java.util.List;

public class Fachada {
    private static Fachada instancia = new Fachada();
    private SistemaPeaje sistemaPeaje = new SistemaPeaje();
    private SistemaUsuario sistemaUsuario = new SistemaUsuario();
    
    public static Fachada getInstancia() {
        return instancia;
    }
    
    public Sesion loginAdmin(String cedula, String password) {
        return sistemaUsuario.loginAdmin(cedula, password);
    }
    
    public Sesion loginProp(String cedula, String password) {
        return sistemaUsuario.loginProp(cedula, password);
    }

    public void registrarProp(Propietario prop) {
        sistemaUsuario.registrarProp(prop);
    }
    
    public void registrarAdmin(Administrador admin) {
        sistemaUsuario.registrarAdmin(admin);
    }

    public List<Sesion> getLogueados() {
        return sistemaUsuario.getLogueados();
    }

    public void agregarPuesto(Puesto puesto) {
        sistemaPeaje.agregarPuesto(puesto);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        sistemaPeaje.agregarVehiculo(vehiculo);
    }

    public CatVehiculo agregarCategoria(CatVehiculo categoria) {
        return sistemaPeaje.agregarCategoria(categoria);
    }

    public void agregarBonificacion(Bonificacion bonificacion) {
        sistemaPeaje.agregarBonificacion(bonificacion);
    }
}