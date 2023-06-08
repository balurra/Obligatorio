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
import dominio.usuario.Usuario;
import dominio.usuario.UsuarioException;
import java.util.List;
import observer.Observable;
import observer.Observador;

public class Fachada extends Observable {
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
    
    public TipoBonificacion buscarTipoBonifPorPos(int pos) {
        return sistemaPeaje.buscarTipoBonifPorPos(pos);
    }

    public Propietario buscarProp(String cedula) {
        return sistemaUsuario.buscarProp(cedula);
    }

    public void asignarBonificacion(Propietario prop, TipoBonificacion tipoBonif, Puesto puesto) throws PeajeException {
        sistemaPeaje.asignarBonificacion(prop, tipoBonif, puesto);
    }

    public void cerrarSesion(Usuario usuario) {
        sistemaUsuario.cerrarSesion(usuario);
    }

    public List<Propietario> getPropietarios() {
        return sistemaUsuario.getPropietarios();
    }

    public void aprobarRecarga(int idRecarga, Administrador admin) {
        sistemaUsuario.aprobarRecarga(idRecarga, admin);
    }

    public void agregarObservador(Observador obs) {
        sistemaUsuario.agregarObservador(obs);
    }

    public List<Recarga> getRecargasPendientes() {
        return sistemaUsuario.recargasPendientes();
    }
}