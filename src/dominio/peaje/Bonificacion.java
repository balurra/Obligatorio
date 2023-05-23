package dominio.peaje;

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
}