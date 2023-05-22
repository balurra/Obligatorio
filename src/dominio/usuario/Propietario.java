package dominio.usuario;

public class Propietario extends Usuario{
    private int saldo;

    public Propietario(String cedula, String password, String nombreCompleto, String username, int saldo) {
        super(cedula, password, nombreCompleto, username);
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }   
}