package dominio.peaje;

import java.util.Date;

public class Notificacion {
    private String notificacion;
    private Date fecha;

    public Notificacion(String notificacion, Date fecha) {
        this.notificacion = notificacion;
        this.fecha = fecha;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public Date getFecha() {
        return fecha;
    }
}