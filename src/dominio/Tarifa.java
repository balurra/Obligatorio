package dominio;

public class Tarifa {
    private int monto;
    private Categoria categoriaVehiculo;

    public Tarifa(int monto, Categoria categoriaVehiculo) {
        this.monto = monto;
        this.categoriaVehiculo = categoriaVehiculo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Categoria getCategoriaVehiculo() {
        return categoriaVehiculo;
    }

    public void setCategoriaVehiculo(Categoria categoriaVehiculo) {
        this.categoriaVehiculo = categoriaVehiculo;
    }
    
    
    
}
