package dominio.peaje;

import java.util.ArrayList;

public class Puesto {
    private String nombre;
    private String direccion;
    private final ArrayList<Tarifa> tarifas = new ArrayList();

    public Puesto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public int gastoVehiculo(CatVehiculo categoria) {
        int ret=0;
        for(Tarifa t:tarifas){
            if(t.getCategoriaVehiculo().equals(categoria)){
                ret+=t.getMonto();
            }
        }
        return ret;
    }
}