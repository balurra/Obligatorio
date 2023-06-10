package dominio.peaje;

public class Exonerado extends TipoBonificacion {

    public Exonerado() {
        super("Exonerado", 100);
    } 
    
    @Override
    public int retornarDesc(Transito t) {
        return getPorcentaje();
    }
}