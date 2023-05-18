package dominio;

public class Propietario extends Usuario{
    private int saldo;

    public Propietario(String cedula, String password, String nombreCompleto, int saldo) {
        super(cedula, password, nombreCompleto);
        this.saldo=saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
