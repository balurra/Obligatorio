package dominio;

import dominio.peaje.Puesto;
import dominio.peaje.SistemaPeaje;
import dominio.peaje.TipoBonificacion;
import dominio.usuario.SistemaUsuario;
import dominio.peaje.Vehiculo;
import dominio.usuario.Administrador;
import dominio.usuario.Propietario;
import dominio.usuario.Sesion;
import dominio.usuario.UsuarioException;
import java.util.ArrayList;
import java.util.List;
import observer.Observable;
import observer.Observador;

public class Fachada implements Observable {
    private static Fachada instancia = new Fachada();
    private SistemaPeaje sistemaPeaje = new SistemaPeaje();
    private SistemaUsuario sistemaUsuario = new SistemaUsuario();
    
    public static Fachada getInstancia() {
        return instancia;
    }
    
    public Sesion loginAdmin(String cedula, String password) throws UsuarioException {
        return sistemaUsuario.loginAdmin(cedula, password);
    }
    
    public Sesion loginProp(String cedula, String password) {
        return sistemaUsuario.loginProp(cedula, password);
    }

    public Propietario registrarProp(Propietario prop) {
        return sistemaUsuario.registrarProp(prop);
    }
    
    public void registrarAdmin(Administrador admin) {
        sistemaUsuario.registrarAdmin(admin);
    }

    public List<Sesion> getLogueados() {
        return sistemaUsuario.getLogueados();
    }

    public Puesto agregarPuesto(Puesto puesto) {
        return sistemaPeaje.agregarPuesto(puesto);
    }

    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        return sistemaPeaje.agregarVehiculo(vehiculo);
    }

    public void agregarTipoBonif(TipoBonificacion tipo) {
        sistemaPeaje.agregarTipoBonif(tipo);
    }

    @Override
    public void agregar(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    @Override
    public void quitar(Observador observador) {
        if (observadores.contains(observador)) {
            observadores.remove(observador);
        }
    }

    @Override
    public void avisar(Object evento) {
        List<Observador> observadoresTemporal = new ArrayList<>(observadores);
        for (Observador observador : observadoresTemporal) {
            observador.actualizar(this, evento);
        }
    }
}