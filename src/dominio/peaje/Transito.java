package dominio.peaje;

import java.util.Date;

public class Transito {
    private Puesto puesto;
    private Vehiculo vehiculo;
    private Date fecha = new Date();

    public Transito(Puesto puesto, Vehiculo vehiculo) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Date getFecha() {
        return fecha;
    }
}