package dominio.usuario;

import java.util.Date;

public class Sesion {
    private Usuario usuario;
    private Date fechaUltIngreso = new Date();

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFechaUlitmoIngreso() {
        return fechaUltIngreso;
    }
}