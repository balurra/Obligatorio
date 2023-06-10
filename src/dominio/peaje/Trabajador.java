package dominio.peaje;

import java.time.LocalDate;
import java.util.Date;

public class Trabajador extends TipoBonificacion {

    public Trabajador() {
        super("Trabajador", 80);
    } 
    
    @Override
    public int retornarDesc(Transito t) {
        int descuento = 0;
        if (validar(t.getFecha())) {
            descuento = getPorcentaje();
        }
        return descuento;
    }
    
    private boolean validar(Date fechaTransito) {
        boolean exito = false;
        LocalDate fechaTransitoLocal = new java.sql.Date(fechaTransito.getTime()).toLocalDate();
        String dia = fechaTransitoLocal.getDayOfWeek().toString();
        if (!dia.equals("SATURDAY") && 
            !dia.equals("SUNDAY")) {
            exito = true;
        }
        return exito;
    }
}