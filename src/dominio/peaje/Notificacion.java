package dominio.peaje;

import java.util.Date;

public class Notificacion {
    private String notificacion;
    private Date fecha = new Date();

    public Notificacion(String notificacion) {
        this.notificacion = notificacion;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public Date getFecha() {
        return fecha;
    }
}