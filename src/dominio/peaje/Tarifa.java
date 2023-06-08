package dominio.peaje;

public class Tarifa {
    private String nombre;
    private int monto;
    private CatVehiculo categoriaVehiculo;

    public Tarifa(int monto, CatVehiculo categoriaVehiculo) {
        this.monto = monto;
        this.categoriaVehiculo = categoriaVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public CatVehiculo getCategoriaVehiculo() {
        return categoriaVehiculo;
    }

    public void setCategoriaVehiculo(CatVehiculo categoriaVehiculo) {
        this.categoriaVehiculo = categoriaVehiculo;
    }
}