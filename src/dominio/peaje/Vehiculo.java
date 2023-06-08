package dominio.peaje;

import dominio.usuario.Propietario;
import java.util.ArrayList;
import observer.Observable;

public class Vehiculo extends Observable {
    private String matricula;
    private String modelo;
    private String color;
    private CatVehiculo categoria;
    private final ArrayList<Transito> transitos = new ArrayList();
    private Propietario prop;

    public Vehiculo(String matricula, String modelo, String color, CatVehiculo categoria, Propietario prop) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.categoria = categoria;
        this.prop = prop;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }
    
    

    public ArrayList<Transito> getTransitos() {
        return transitos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CatVehiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(CatVehiculo categoria) {
        this.categoria = categoria;
    }
    
    public void asignarTransitos(ArrayList<Transito> transitos) {
            for(Transito t:this.transitos){
                transitos.add(t);
            }    }
    
    public int gastosTotalesEnPeajes(){
        int ret=0;
        for(Transito t:transitos){
            ret+=t.gastoVehiculo(this);
        }
        return ret;
    }
}