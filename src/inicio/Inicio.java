package inicio;

import ius_swing.Principal;

public class Inicio {
    public static void main(String[] args) {
        DatosPrueba.cargar();
        Principal principal = new Principal();
        principal.setVisible(true);
    }   
}