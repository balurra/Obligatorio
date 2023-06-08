package dominio.peaje;

import java.util.Date;

public class Transito {
    private Puesto puesto;
    private Vehiculo vehiculo;
    private Date fecha = new Date();
    private int costo;
    private Bonificacion bonif;
    private int montoBonif;

    public Transito(Puesto puesto, Vehiculo vehiculo, int costo, Bonificacion bonif, int montoBonif) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.costo = costo;
        this.bonif = bonif;
        this.montoBonif = montoBonif;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getCosto() {
        return costo;
    }

    public Bonificacion getBonif() {
        return bonif;
    }

    public int getMontoBonif() {
        return montoBonif;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public Tarifa tarifaTransito(){
        return this.puesto.tarifaTransito(this.vehiculo.getCategoria());
    }
}