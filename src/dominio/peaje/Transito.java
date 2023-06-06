package dominio.peaje;

import java.util.Date;

public class Transito {
    private Puesto puesto;
    private Vehiculo vehiculo;
    private Bonificacion bonificacion;
    private Date fecha = new Date();
    

    public Transito(Puesto puesto, Vehiculo vehiculo) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
    }
    
    public int gastoVehiculo(Vehiculo vehiculo){
        return puesto.gastoVehiculo(vehiculo.getCategoria());
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

    public Bonificacion getBonificacion() {
        return bonificacion;
    }
    
    public Tarifa tarifaTransito(){
        return this.puesto.tarifaTransito(this.vehiculo.getCategoria());
    }
}