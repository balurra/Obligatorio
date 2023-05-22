package dominio.usuario;

public abstract class Usuario {
    private String cedula;
    private String password;
    private String nombreCompleto;
    private String username;

    public Usuario(String cedula, String password, String nombreCompleto, String username) {
        this.cedula = cedula;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.username = username;
    }
    
    public boolean validarUsuario() {
        return validarNombre() &&
               validarPassword();
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    @Override
    public boolean equals(Object obj) {
        Usuario otro = (Usuario)obj;
        return this.username.equals(otro.username);
    }
    
    private boolean validarNombre() {
        return username != null && !username.isEmpty();
    }

    private boolean validarPassword() {
        return password != null && !password.isEmpty();
    }
}