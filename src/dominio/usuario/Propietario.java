package dominio.usuario;

import dominio.peaje.EventosProp;
import dominio.peaje.Bonificacion;
import dominio.peaje.Notificacion;
import dominio.peaje.Puesto;
import dominio.peaje.Recarga;
import dominio.peaje.Transito;
import dominio.peaje.Vehiculo;
import java.util.ArrayList;
import java.util.Date;

public class Propietario extends Usuario {
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
    
    public void borrarNotificaciones() {
        notificaciones.clear();
        avisar(EventosProp.CAMBIO_DATOS);
    }

    public void recargarSaldo(int monto) throws UsuarioException {
        if(monto > 0) {
            Recarga recarga = new Recarga(monto, this);
            recargas.add(recarga);
            avisar(EventosProp.CAMBIO_DATOS);
        } else  {
            throw new UsuarioException("Monto inválido");
        }
    }

    public ArrayList<Transito> transitosRealizados(){
        ArrayList<Transito> transitos = new ArrayList();
        for(Vehiculo v : vehiculos){
            for (Transito t : v.getTransitos()) {
                transitos.add(t);
            }
        }
        return transitos;
    }
    
    public void recargaAprobada(int monto, Date fecha) {
        saldo += monto;
        Notificacion notif = new Notificacion(fecha + "Tu recarga de $" + monto + " fue aprobada");
        notificaciones.add(notif);
        avisar(EventosProp.CAMBIO_DATOS);
    }
    
    //duda experto
    public ArrayList<Transito> transitosDelPropietario(){
        ArrayList<Transito> transitos = new ArrayList<>();
        for(Vehiculo v:vehiculos){
            v.asignarTransitos(transitos);
        }
        return transitos;        
    }
    
    @Override
    public boolean validarUsuario() {
        return super.validarUsuario() &&
               saldo > -1;
    }
}