package inicio;

import dominio.usuario.Administrador;
import dominio.peaje.Bonificacion;
import dominio.peaje.CatVehiculo;
import dominio.Fachada;
import dominio.usuario.Propietario;
import dominio.peaje.Puesto;
import dominio.peaje.Tarifa;
import dominio.peaje.Vehiculo;
import java.util.ArrayList;

public class DatosPrueba {
    public static void cargar(){
        Fachada logica = Fachada.getInstancia();
        //-------------------------------------------------USUARIOS ADMIN-------------------------------------------------
        logica.agregarUsuario(new Administrador("50882785","12345","Michelle Lazcano","mlazcano"));
        logica.agregarUsuario(new Administrador("49808351","12345","Nicolas Urraburu","nurraburu"));
        logica.agregarUsuario(new Administrador("27342119","12345","Juan Pérez","jperez"));
        
        //-----------------------------------------------USUARIOS PROPIETARIOS-----------------------------------------------
        logica.agregarUsuario(new Propietario("25736424","12345","Micaela Aguilar","ma321",2000));
        logica.agregarUsuario(new Propietario("17394758","12345","Ana Ruiz","ruizana",0));
        logica.agregarUsuario(new Propietario("18467373","12345","Pablo González","pg2023",5000));
        logica.agregarUsuario(new Propietario("23746551","12345","Joaquín Álvarez","1152023j.a",23000));
        logica.agregarUsuario(new Propietario("33256986","12345","Roberto Rodríguez","r_r_23",28500));
        logica.agregarUsuario(new Propietario("12387645","12345","Joaquina Iglesias","2320joa",68200));
        logica.agregarUsuario(new Propietario("27839422","12345","Cecilia Sánchez","cecilia.san",490));
        logica.agregarUsuario(new Propietario("37845321","12345","Ana Clara Santos","acs_79",33000));
        logica.agregarUsuario(new Propietario("48959877","12345","Óscar Cruz","cruz84",0));
        logica.agregarUsuario(new Propietario("24384969","12345","Tobías González","tg2000",230));
        
        //------------------------CATEGORÍAS DE VEHÍCULOS------------------------
        CatVehiculo c1 = logica.agregarCategoria(new CatVehiculo("Automóvil"));
        CatVehiculo c2 = logica.agregarCategoria(new CatVehiculo("Motocicleta"));
        CatVehiculo c3 = logica.agregarCategoria(new CatVehiculo("Bus"));
        CatVehiculo c4 = logica.agregarCategoria(new CatVehiculo("Microbus"));
        CatVehiculo c5 = logica.agregarCategoria(new CatVehiculo("Cuatriciclo"));
        
        //----------LISTAS DE TARIFAS PARA PUESTOS----------
        Tarifa t11 = new Tarifa(200,c1);
        Tarifa t12 = new Tarifa(100,c2);
        Tarifa t13 = new Tarifa(320,c3);
        Tarifa t14 = new Tarifa(239,c4);
        Tarifa t15 = new Tarifa(67,c5);
        
        ArrayList<Tarifa> tarifas1= new ArrayList<>();
        tarifas1.add(t11);tarifas1.add(t12);tarifas1.add(t13);tarifas1.add(t14);tarifas1.add(t15);
        
        ArrayList<Tarifa> tarifas2= new ArrayList<>();
        tarifas1.add(t11);tarifas1.add(t12);tarifas1.add(t13); 
        
        ArrayList<Tarifa> tarifas3= new ArrayList<>();
        tarifas1.add(t11);tarifas1.add(t13);
        
        ArrayList<Tarifa> tarifas4= new ArrayList<>();
        tarifas1.add(t12);
        
        //--------------------------------------------PUESTOS--------------------------------------------
        logica.agregarPuesto(new Puesto("Puesto Montevideo","Ruta9 km28",tarifas1));
        logica.agregarPuesto(new Puesto("Puesto Maldonado","Ruta6 km102",tarifas1));
        logica.agregarPuesto(new Puesto("Puesto Colonia","Ruta3 km280",tarifas2));
        logica.agregarPuesto(new Puesto("Puesto San José","Ruta4 km98",tarifas4));
        logica.agregarPuesto(new Puesto("Puesto Fray Bentos","Ruta5 km265"));
        logica.agregarPuesto(new Puesto("Puesto Canelones","Ruta1 km 50",tarifas2));
        logica.agregarPuesto(new Puesto("Puesto Rocha","Ruta12 km 324",tarifas3));
        logica.agregarPuesto(new Puesto("Puesto Tacuarembó","Ruta7 km347",tarifas3));
        logica.agregarPuesto(new Puesto("Puesto Treinta y Tres","Ruta8 km221"));
        logica.agregarPuesto(new Puesto("Puesto Salto","Ruta9 km490",tarifas1));
        logica.agregarPuesto(new Puesto("Puesto Artigas","Ruta10 km548",tarifas2));
        logica.agregarPuesto(new Puesto("Puesto Rivera","Ruta11 km555",tarifas1));
       
        //---------------------------------------------VEHÍCULOS---------------------------------------------
        logica.agregarVehiculo(new Vehiculo("SBU 9357","Audi TT RS","Blanco",c1));
        logica.agregarVehiculo(new Vehiculo("JNK 2540","BMW X6","Negro",c1));
        logica.agregarVehiculo(new Vehiculo("SON 2309","Volkswagen Up","Rojo",c1));
        logica.agregarVehiculo(new Vehiculo("KJH 8778","Honda Civic","Amarillo",c1));
        logica.agregarVehiculo(new Vehiculo("GVD 3432","Chevrolet Spin","Verde",c1));
        logica.agregarVehiculo(new Vehiculo("QRW 2455","Yamaha Crypton","Blanco",c2));
        logica.agregarVehiculo(new Vehiculo("MYT 5823","Kiden KD 150 Z","Rojo",c2));
        logica.agregarVehiculo(new Vehiculo("DFJ 2129","Zanella ZT 150","Negro",c2));
        logica.agregarVehiculo(new Vehiculo("VFR 8868","Marcopolo Viaggio 1050","Negro",c3));
        logica.agregarVehiculo(new Vehiculo("KIO 3465","Marcopolo Audace","Rojo",c3));
        logica.agregarVehiculo(new Vehiculo("ERP 2458","Mercedes-Benz Sprinter","Amarillo",c4));
        logica.agregarVehiculo(new Vehiculo("MOT 9592","Renault Master","Blanco",c4));
        logica.agregarVehiculo(new Vehiculo("YRP 6675","Yamaha Raptor 700","Rojo",c5));

        //--------------------------BONIFICACIONES--------------------------
        logica.agregarBonificacion(new Bonificacion("Manejo seguro"));
        logica.agregarBonificacion(new Bonificacion("Buen estado de luces"));
        logica.agregarBonificacion(new Bonificacion("Buen estado de ruedas"));
        logica.agregarBonificacion(new Bonificacion("Frenos ABS"));
        logica.agregarBonificacion(new Bonificacion("Airbag"));
        logica.agregarBonificacion(new Bonificacion("Cinturon"));
        logica.agregarBonificacion(new Bonificacion("Carrocería limpia"));
        logica.agregarBonificacion(new Bonificacion("Aire acondicionado"));
        logica.agregarBonificacion(new Bonificacion("Asientos de cuero"));
        logica.agregarBonificacion(new Bonificacion("Radio"));
    }
}