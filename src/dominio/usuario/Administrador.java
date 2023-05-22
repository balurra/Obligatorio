package dominio.usuario;

public class Administrador extends Usuario {
    public Administrador(String cedula, String password, String nombreCompleto, String username) {
        super(cedula, password, nombreCompleto, username);
    }
}