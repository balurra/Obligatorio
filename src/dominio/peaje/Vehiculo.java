package dominio.peaje;

import dominio.usuario.Propietario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Vehiculo {
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
    
    public int gastosTotalesEnPeajes(){
        int total = 0;
        for(Transito t : transitos){
            total += t.getCosto();
        }
        return total;
    }

    public void agregarTransito(Transito transito) {
        transitos.add(transito);
    }
    
    public int cantTransitosEnFechaPorPuesto(Date fecha, Puesto puesto) {
        int cant = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        for (Transito t : transitos) {
            if (sdf.format(fecha).equals(sdf.format(t.getFecha()))) {
                if (t.getPuesto().equals(puesto)) {
                    cant++;
                }
            }
        }
        return cant;
    }
    
    @Override
    public boolean equals(Object obj) {
        Vehiculo v = (Vehiculo)obj;
        return matricula.equals(v.matricula);
    }
}