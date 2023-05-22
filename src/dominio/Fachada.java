package dominio;

import dominio.peaje.Bonificacion;
import dominio.peaje.CatVehiculo;
import dominio.peaje.Puesto;
import dominio.peaje.SistemaPeaje;
import dominio.usuario.SistemaUsuario;
import dominio.peaje.Vehiculo;
import dominio.usuario.Usuario;
import java.util.ArrayList;

public class Fachada {
    private static Fachada instancia = new Fachada();
    private SistemaPeaje sistemaPeaje = new SistemaPeaje();
    private SistemaUsuario sistemaUsuario = new SistemaUsuario();
    
    public static Fachada getInstancia() {
        return instancia;
    }
    
    public Usuario login(String username, String password) {
        return sistemaUsuario.login(username, password);
    }

    public void agregarUsuario(Usuario usuario) {
        sistemaUsuario.agregarUsuario(usuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return sistemaUsuario.getUsuarios();
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