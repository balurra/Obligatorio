package dominio.peaje;

import dominio.usuario.Administrador;
import dominio.usuario.Propietario;
import java.util.Date;

public class Recarga {
    private Date fechaIniciada = new Date();
    private int monto;
    private String estado = "Pendiente";
    private Propietario prop;
    private Administrador admin = null;

    public Recarga(int monto, Propietario prop) {
        this.monto = monto;
        this.prop = prop;
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
    
    public String nombreAdmin(){
        if(this.admin==null){
            return "No tiene administrador aun";
        }else{
            return this.admin.getNombreCompleto();
        }
    }
}