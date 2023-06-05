package dominio.peaje;

import dominio.usuario.Propietario;
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
}