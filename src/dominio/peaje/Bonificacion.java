package dominio.peaje;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Bonificacion {
    private TipoBonificacion tipo;
    private Puesto puesto;
    private Date fechaAsignada = new Date();

    public Bonificacion(TipoBonificacion tipo, Puesto puesto) {
        this.tipo = tipo;
        this.puesto = puesto;
    }
    
    public TipoBonificacion getTipoBonificacion() {
        return tipo;
    }
    
    public Puesto getPuesto() {
        return puesto;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
    }
    
    public void validar() throws PeajeException {
        if (tipo == null) {
            throw new PeajeException("Falta el tipo de bonificación");
        }
    }
    
    public int calcularPorcentajeDesc(Vehiculo vehiculo, Date fechaTransito) {
        int descuento = 0;
        if (tipo instanceof Exonerado) {
            descuento = tipo.getPorcentaje();
        } else if (tipo instanceof Frecuente) {
            if (validarFrecuente(vehiculo, fechaTransito)) {
                descuento = tipo.getPorcentaje();
            }
        } else if (tipo instanceof Trabajador) {
            if (validarTrabajador(fechaTransito)) {
                descuento = tipo.getPorcentaje();
            }
        }
        return descuento;
    }
    
    public boolean validarFrecuente(Vehiculo vehiculo, Date fechaTransito){
        boolean exito = false;
        int cantTransitosDia = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        
        for (Transito t : vehiculo.getTransitos()) {
            if (sdf.format(fechaTransito).equals(sdf.format(t.getFecha()))) {
                cantTransitosDia++;
            }
        }
        
        if (cantTransitosDia > 1) {
            exito = true;
        }
        
        return exito;
    }
    
    public boolean validarTrabajador(Date fechaTransito){
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