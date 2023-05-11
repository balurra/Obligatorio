
package inicio;

import dominio.Administrador;
import dominio.Fachada;

public class DatosPrueba {
    public static void cargar(){
        Fachada logica = Fachada.getInstancia();
        
        logica.agregarAdministrador(new Administrador("34663085","Michelle Lazcano","mlazcano"));
        logica.agregarAdministrador(new Administrador("49808351","Nicolas Urraburu","nurraburu"));
        logica.agregarAdministrador(new Administrador("27342119","Juan Perez","jp23"));
        
        logica.agregarPropietario(new Propietario("25736424","Micaela Aguiar","ma321",2000));
        logica.agregarPropietario(new Propietario("17394758","Ana Ruiz","ruizana",0));
        logica.agregarPropietario(new Propietario("18467373","Pablo Gonzalez","pg2023",5000));
        logica.agregarPropietario(new Propietario("23746551","Joaquin Alvarez","1152023j.a",23000));
        logica.agregarPropietario(new Propietario("33256986","Roberto Rodriguez","r_r_23",28500));
        logica.agregarPropietario(new Propietario("12387645","Joaquina Iglesias","2320joa",68200));
        logica.agregarPropietario(new Propietario("27839422","Cecilia Sanchez","cecilia.san",490));
        logica.agregarPropietario(new Propietario("37845321","Ana Clara Santos","acs_79",33000));
        logica.agregarPropietario(new Propietario("48959877","Oscar Cruz","cruz84",0));
        logica.agregarPropietario(new Propietario("24384969","Tobias Gonzalez","tg2000",230));
        
        
        
        
    }
}
