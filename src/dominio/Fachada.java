package dominio;

import dominio.peaje.PeajeException;
import dominio.peaje.Puesto;
import dominio.peaje.Recarga;
import dominio.peaje.SistemaPeaje;
import dominio.peaje.TipoBonificacion;
import dominio.peaje.Transito;
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
    
    public List<Puesto> getPuestos() {
        return sistemaPeaje.getPuestos();
    }
    
    public List<Vehiculo> getVehiculos() {
        return sistemaPeaje.getVehiculos();
    }
    
    public List<TipoBonificacion> getTiposBonif() {
        return sistemaPeaje.getTiposBonif();
    }
    
    public List<Recarga> getRecargas() {
        return sistemaPeaje.getRecargas();
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
    
    public Puesto buscarPuestoPorPos(int pos) {
        return sistemaPeaje.buscarPuestoPorPos(pos);
    }

    public Vehiculo buscarVehiculo(String matricula) {
        return sistemaPeaje.buscarVehiculo(matricula);
    }
    
    public Transito emularTransito(Puesto puesto, Vehiculo vehiculo) throws PeajeException {
        return sistemaPeaje.emularTransito(puesto, vehiculo);
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