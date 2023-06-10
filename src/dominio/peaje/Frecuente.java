package dominio.peaje;

import java.text.SimpleDateFormat;
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
        int cantTransitosDiaPorPuesto = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Vehiculo v = transito.getVehiculo();
        Date fecha = transito.getFecha();
        Puesto puesto = transito.getPuesto();
        
        for (Transito t : v.getTransitos()) {
            if (sdf.format(fecha).equals(sdf.format(t.getFecha()))) {
                if (t.getPuesto().equals(puesto)) {
                    cantTransitosDiaPorPuesto++;
                }
            }
        }

        if (cantTransitosDiaPorPuesto > 1) { 
            exito = true;
        }
        
        return exito;
    }
}