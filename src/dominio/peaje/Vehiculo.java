package dominio.peaje;

import java.util.ArrayList;
import java.util.List;
import observer.Observable;
import observer.Observador;

public class Vehiculo implements Observable {
    private String matricula;
    private String modelo;
    private String color;
    private CatVehiculo categoria;
    private final ArrayList<Transito> transitos = new ArrayList();

    public Vehiculo(String matricula, String modelo, String color, CatVehiculo categoria) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.categoria = categoria;
    }
    
    public int gastosTotalesEnPeajes(){
        int ret=0;
        for(Transito t:transitos){
            ret+=t.gastoVehiculo(this);
        }
        return ret;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    @Override
    public void agregar(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    @Override
    public void quitar(Observador observador) {
        if (observadores.contains(observador)) {
            observadores.remove(observador);
        }
    }

    @Override
    public void avisar(Object evento) {
        List<Observador> observadoresTemporal = new ArrayList<>(observadores);
        for (Observador observador : observadoresTemporal) {
            observador.actualizar(this, evento);
        }
    }

    public void asignarTransitos(ArrayList<Transito> transitos) {
            for(Transito t:this.transitos){
                transitos.add(t);
            }    }
}