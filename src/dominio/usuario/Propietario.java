package dominio.usuario;

import dominio.peaje.EventosSistema;
import dominio.Fachada;
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
            avisar(EventosProp.CAMBIO_DATOS); //actualizo datos propietario
            Fachada.getInstancia().avisar(EventosSistema.CAMBIO_DATOS); //actualizo recargas pendientes
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
    
    public boolean tieneBonifEnPuesto(Puesto puesto) {
        boolean exito = false;
        for (Bonificacion b : bonificaciones) {
            if (puesto.equals(b.getPuesto())) {
                exito = true;
            }
        }
        return exito;
    }
    
    public void enviarNotifs(Notificacion notif) {
        notificaciones.add(notif);
    }
    
    public void restarSaldo(int costo) {
        saldo = saldo - costo;
    }
    
    public void agregarBonif(Bonificacion bonif) {
        bonificaciones.add(bonif);
    }
    
    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
    
    public ArrayList<Recarga> recargasPendientes() {
        ArrayList<Recarga> retorno = new ArrayList();
        for (Recarga r : recargas) {
            if (r.getEstado().equals("Pendiente")) {
                retorno.add(r);
            }
        }
        return retorno;
    }
    
    @Override
    public boolean validarUsuario() {
        return super.validarUsuario() && saldo > -1;
    }
}