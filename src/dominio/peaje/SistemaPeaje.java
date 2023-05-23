package dominio.peaje;

import java.util.ArrayList;
import java.util.List;

public class SistemaPeaje {
    private ArrayList<Puesto> puestos = new ArrayList<>();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<TipoBonificacion> tiposBonif = new ArrayList<>();
    private ArrayList<Recarga> recargas = new ArrayList<>();
    
    public Puesto agregarPuesto(Puesto puesto) {
        if (validarListaPuestos(puesto)) {
            puestos.add(puesto);
        }
        return puesto;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (validarListaVehiculos(vehiculo)) {
            vehiculos.add(vehiculo);
        }
    }
    
    public List<TipoBonificacion> getTiposBonif() {
        return tiposBonif;
    }

    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }
    
    public void agregarTipoBonif (TipoBonificacion tipo) {
        if (validarListaTiposBonif(tipo)) {
            tiposBonif.add(tipo);
        }
    }

    private boolean validarListaTiposBonif(TipoBonificacion tipo) {
        return !tiposBonif.contains(tipo);
    }

    private boolean validarListaVehiculos(Vehiculo vehiculo) {
        return !vehiculos.contains(vehiculo);
    }
    
    private boolean validarListaPuestos(Puesto puesto) {
        return !puestos.contains(puesto);
    }
}