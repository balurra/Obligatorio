package vistas;

import dominio.peaje.Bonificacion;
import dominio.peaje.Notificacion;
import dominio.peaje.Recarga;
import dominio.peaje.Transito;
import dominio.peaje.Vehiculo;
import java.util.ArrayList;

public interface VistaTableroProp {
    public void mostrarDatos();
    public void datosVehiculos(ArrayList<Vehiculo> vehiculos);
    public void datosBonifs(ArrayList<Bonificacion> bonifs);
    public void datosTransitos(ArrayList<Transito> transitos);
    public void datosRecargas(ArrayList<Recarga> recargas);
    public void datosNotifs(ArrayList<Notificacion> notifs);
}