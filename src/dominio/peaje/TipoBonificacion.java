package dominio.peaje;

public abstract class TipoBonificacion {
    
    private String nombre;

    public TipoBonificacion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
