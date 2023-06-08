package dominio.peaje;

import dominio.usuario.Administrador;
import dominio.usuario.Propietario;
import java.util.Date;

public class Recarga {
    private int id;
    private static int ultId = 0;
    private Date fechaIniciada = new Date();
    private int monto;
    private String estado = "Pendiente";
    private Propietario prop;
    private Administrador admin = null;

    public Recarga(int monto, Propietario prop) {
        this.monto = monto;
        this.prop = prop;
        id = ultId;
        ultId++;
    }
    
    public int getId() {
        return id;
    }
    
    public Propietario getProp() {
        return prop;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Date getFechaIniciada() {
        return fechaIniciada;
    }

    public int getMonto() {
        return monto;
    }
    
    public void aprobar(Administrador admin) {
        estado = "Aprobada";
        this.admin = admin;
        prop.recargaAprobada(monto, fechaIniciada);
    }
}