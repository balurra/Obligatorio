package dominio.usuario;

import dominio.peaje.Bonificacion;
import dominio.peaje.Notificacion;
import dominio.peaje.Puesto;
import dominio.peaje.Recarga;
import dominio.peaje.Transito;
import dominio.peaje.Vehiculo;
import java.util.ArrayList;

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
        this.notificaciones.clear();
        avisar(EventosPropietario.CAMBIO_DATOS);
    }

    public int cantidadTransitos(){
        int ret=0;
        for(Vehiculo v:vehiculos){
            ret+=v.getTransitos().size();
        }
        return ret;
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
    
    public void recargarSaldo(int monto, Propietario prop) { //falta exception
        if(monto>-1){
            this.saldo+=monto;
            Recarga r = new Recarga(monto,prop);
            this.recargas.add(r);
            this.avisar(EventosPropietario.CAMBIO_DATOS);
        }
    }
}