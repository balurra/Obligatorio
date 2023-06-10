package dominio.peaje;

import java.util.ArrayList;

public class Puesto {
    private int nroPuesto;
    private static int ultId = 0;
    private String nombre;
    private String direccion;
    private final ArrayList<Tarifa> tarifas = new ArrayList();

    public Puesto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        ultId++;
        nroPuesto = ultId;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroPuesto() {
        return nroPuesto;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }
    
    public Tarifa buscarTarifaCorrespondiente(CatVehiculo categoria) {
        Tarifa ret = null;
        for(Tarifa t:tarifas){
            if(t.getCategoriaVehiculo().equals(categoria)){
                ret = t;
            }
        } 
        return ret;
    }
    
    public void agregarTarifa(Tarifa tarifa) {
        tarifas.add(tarifa);
    }
}