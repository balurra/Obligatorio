package dominio.peaje;

<<<<<<< HEAD
import java.text.SimpleDateFormat;
=======
>>>>>>> main
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
<<<<<<< HEAD
        int cantTransitosDiaPorPuesto = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
=======
>>>>>>> main
        Vehiculo v = transito.getVehiculo();
        Date fecha = transito.getFecha();
        Puesto puesto = transito.getPuesto();
        
<<<<<<< HEAD
        for (Transito t : v.getTransitos()) {
            if (sdf.format(fecha).equals(sdf.format(t.getFecha()))) {
                if (t.getPuesto().equals(puesto)) {
                    cantTransitosDiaPorPuesto++;
                }
            }
        }

        if (cantTransitosDiaPorPuesto > 1) { 
=======
        if (v.cantTransitosEnFechaPorPuesto(fecha, puesto) > 1) {
>>>>>>> main
            exito = true;
        }
        
        return exito;
    }
}