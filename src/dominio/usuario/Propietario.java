package dominio.usuario;

import dominio.peaje.Bonificacion;
import dominio.peaje.Notificacion;
import dominio.peaje.Recarga;
import dominio.peaje.Vehiculo;
import java.util.ArrayList;

public class Propietario extends Usuario{
    private int saldo;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Bonificacion> bonificaciones;
    private final ArrayList<Notificacion> notificaciones = new ArrayList();
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
    
    public int cantidadTransitos(){
        int ret=0;
        for(Vehiculo v:vehiculos){
            ret+=v.getTransitos().size();
        }
        return ret;
    }
    
    @Override
    public boolean validarUsuario() {
        return super.validarUsuario() &&
               saldo > -1;
    }
}