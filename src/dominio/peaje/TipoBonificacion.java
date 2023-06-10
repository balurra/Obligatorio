package dominio.peaje;

import java.util.Date;

public abstract class TipoBonificacion {
    
    private String nombre;
    private int porcentaje;

    public TipoBonificacion(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPorcentaje() {
        return porcentaje;
    }
    
    public abstract int retornarDesc(Transito transito);
}