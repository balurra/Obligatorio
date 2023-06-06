package dominio.usuario;


public abstract class Usuario{
    private String cedula;
    private String password;
    private String nombreCompleto;

    public Usuario(String cedula, String password, String nombreCompleto) {
        this.cedula = cedula;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }
    
    public boolean validarUsuario() {
        return validarNombre() &&
               validarPassword() &&
               validarCedula();
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

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    @Override
    public boolean equals(Object obj) {
        Usuario otro = (Usuario)obj;
        return this.cedula.equals(otro.cedula);
    }
    
    private boolean validarNombre() {
        return nombreCompleto != null && !nombreCompleto.isEmpty();
    }

    private boolean validarPassword() {
        return password != null && !password.isEmpty();
    }
    
    private boolean validarCedula() {
        return cedula != null &&
               !cedula.isEmpty() &&
               cedula.length() == 8;
    }
}