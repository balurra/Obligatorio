package dominio.peaje;

import java.util.Date;

public class Frecuente extends TipoBonificacion {

    public Frecuente() {
        super("Frecuente", 50);
    }
    
    @Override
    public int retornarDesc(Transito transito) {
        int descuento = 0;
        if (validar(transito)) {
            descuento = getPorcentaje();
        }
        return descuento;
    }
    
    private boolean validar(Transito transito) {
        boolean exito = false;
        Vehiculo v = transito.getVehiculo();
        Date fecha = transito.getFecha();
        Puesto puesto = transito.getPuesto();
        
        if (v.cantTransitosEnFechaPorPuesto(fecha, puesto) > 1) {
            exito = true;
        }
        
        return exito;
    }
}