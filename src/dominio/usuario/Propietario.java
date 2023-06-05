package dominio.usuario;

import dominio.peaje.Bonificacion;
import dominio.peaje.Notificacion;
import dominio.peaje.Puesto;
import dominio.peaje.Recarga;
import dominio.peaje.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import observer.Observable;
import observer.Observador;

public class Propietario extends Usuario implements Observable {
    private int saldo;
    private final ArrayList<Bonificacion> bonificaciones = new ArrayList();
    private final ArrayList<Notificacion> notificaciones = new ArrayList();
    private final ArrayList<Vehiculo> vehiculos = new ArrayList();
    private final ArrayList<Recarga> recargas = new ArrayList();

    public Propietario(String cedula, String password, String nombreCompleto, int saldo) {
        super(cedula, password, nombreCompleto);
        this.saldo = saldo;
    }
    
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public ArrayList<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }
    
    public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public Bonificacion bonifParaPuesto(Puesto puesto) {
        Bonificacion bonif = null;
        
        for (Bonificacion b : bonificaciones) {
            if (puesto.equals(b.getPuesto())) {
                bonif = b;
            }
        }
        
        return bonif;
    } 
    
    @Override
    public boolean validarUsuario() {
        return super.validarUsuario() &&
               saldo > -1;
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