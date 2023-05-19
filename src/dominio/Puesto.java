package dominio;

import java.util.ArrayList;

public class Puesto {
    private String nombre;
    private String direccion;
    private ArrayList<Tarifa> tarifas;

    public Puesto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Puesto(String nombre, String direccion, ArrayList<Tarifa> tarifas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifas = tarifas;
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

    boolean validarListaTarifas(ArrayList<Tarifa> ts) {
        if(ts==null){
            return true;
        }
        for(Tarifa t:ts){
            if (tarifas.contains(t)) {
            return false;
        }}
        return true;
    }
        

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }
    
    

    
    
}
