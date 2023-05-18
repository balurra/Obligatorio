
package inicio;

import dominio.Administrador;
import dominio.Bonificacion;
import dominio.Categoria;
import dominio.Fachada;
import dominio.Propietario;
import dominio.Puesto;
import dominio.Vehiculo;

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
        
        logica.agregarPuesto(new Puesto("Puesto Montevideo","Ruta9 km28"));
        logica.agregarPuesto(new Puesto("Puesto Maldonado","Ruta6 km102"));
        logica.agregarPuesto(new Puesto("Puesto Colonia","Ruta3 km280"));
        logica.agregarPuesto(new Puesto("Puesto San Jose","Ruta4 km98"));
        logica.agregarPuesto(new Puesto("Puesto Fray Bentos","Ruta5 km265"));
        logica.agregarPuesto(new Puesto("Puesto Canelones","Ruta1 km 50"));
        logica.agregarPuesto(new Puesto("Puesto Rocha","Ruta12 km 324"));
        logica.agregarPuesto(new Puesto("Puesto Tacuarembo","Ruta7 km347"));
        logica.agregarPuesto(new Puesto("Puesto Treinta y Tres","Ruta8 km221"));
        logica.agregarPuesto(new Puesto("Puesto Salto","Ruta9 km490"));
        logica.agregarPuesto(new Puesto("Puesto Artigas","Ruta10 km548"));
        logica.agregarPuesto(new Puesto("Puesto Rivera","Ruta11 km555"));
        
        logica.agregarCategoria(new Categoria("Automovil"));
        logica.agregarCategoria(new Categoria("Motocicleta"));
        logica.agregarCategoria(new Categoria("Bus"));
        logica.agregarCategoria(new Categoria("Microbus"));
        logica.agregarCategoria(new Categoria("Cuatriciclo"));
        
        logica.agregarVehiculo(new Vehiculo("SBU 9357","Audi TT RS","Blanco", new Categoria("Automovil")));
        logica.agregarVehiculo(new Vehiculo("JNK 2540","BMW X6","Negro", new Categoria("Automovil")));
        logica.agregarVehiculo(new Vehiculo("SON 2309","Volkswagen Up","Rojo", new Categoria("Automovil")));
        logica.agregarVehiculo(new Vehiculo("KJH 8778","Honda Civic","Amarillo", new Categoria("Automovil")));
        logica.agregarVehiculo(new Vehiculo("GVD 3432","Chevrolet Spin","Verde", new Categoria("Automovil")));
        logica.agregarVehiculo(new Vehiculo("QRW 2455","Yamaha Crypton","Blanco", new Categoria("Motocicleta")));
        logica.agregarVehiculo(new Vehiculo("MYT 5823","Kiden KD 150 Z","Rojo", new Categoria("Motocicleta")));
        logica.agregarVehiculo(new Vehiculo("DFJ 2129","Zanella ZT 150","Negro", new Categoria("Motocicleta")));
        logica.agregarVehiculo(new Vehiculo("VFR 8868","Marcopolo Viaggio 1050","Negro", new Categoria("Bus")));
        logica.agregarVehiculo(new Vehiculo("KIO 3465","Marcopolo Audace","Rojo", new Categoria("Bus")));
        logica.agregarVehiculo(new Vehiculo("ERP 2458","Mercedes-Benz Sprinter","Amarillo", new Categoria("Microbus")));
        logica.agregarVehiculo(new Vehiculo("MOT 9592","Renault Master","Blanco", new Categoria("Microbus")));
        logica.agregarVehiculo(new Vehiculo("YRP 6675","Yamaha Raptor 700","Rojo", new Categoria("Cuatriciclo")));

//        logica.agregarTarifa(new Tarifa(200, new Categoria("Automovil")));
//        logica.agregarTarifa(new Tarifa(100, new Categoria("Motocicleta")));
//        logica.agregarTarifa(new Tarifa(320, new Categoria("Bus")));
//        logica.agregarTarifa(new Tarifa(239, new Categoria("Microbus")));
//        logica.agregarTarifa(new Tarifa(67, new Categoria("Cuatriciclo")));
//        
        logica.agregarBonificacion(new Bonificacion("Manejo seguro"));
        logica.agregarBonificacion(new Bonificacion("Buen estado de luces"));
        logica.agregarBonificacion(new Bonificacion("Buen estado de ruedas"));
        logica.agregarBonificacion(new Bonificacion("Frenos ABS"));
        logica.agregarBonificacion(new Bonificacion("Airbag"));
        logica.agregarBonificacion(new Bonificacion("Cinturon"));
        logica.agregarBonificacion(new Bonificacion("Carroceria limpia"));
        logica.agregarBonificacion(new Bonificacion("Aire acondicionado"));
        logica.agregarBonificacion(new Bonificacion("Asientos de cuero"));
        logica.agregarBonificacion(new Bonificacion("Radio"));
    
    }
}
