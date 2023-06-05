package inicio;

import dominio.usuario.Administrador;
import dominio.peaje.CatVehiculo;
import dominio.Fachada;
import dominio.usuario.Propietario;
import dominio.peaje.Puesto;
import dominio.peaje.Tarifa;
import dominio.peaje.Exonerado;
import dominio.peaje.Frecuente;
import dominio.peaje.Trabajador;
import dominio.peaje.Vehiculo;

public class DatosPrueba {
    public static void cargar(){
        Fachada logica = Fachada.getInstancia();
        
        //---------------------------------------------USUARIOS ADMIN---------------------------------------------
        logica.registrarAdmin(new Administrador("50882785","12345","Michelle Lazcano"));
        logica.registrarAdmin(new Administrador("49808351","12345","Nicolas Urraburu"));
        logica.registrarAdmin(new Administrador("27342119","12345","Juan Pérez"));
        
        //-------------------------------------------------------USUARIOS PROPIETARIOS-------------------------------------------------------
        Propietario prop1 = logica.registrarProp(new Propietario("25736424","12345","Micaela Aguilar",2000));
        Propietario prop2 = logica.registrarProp(new Propietario("17394758","12345","Ana Ruiz",0));
        Propietario prop3 = logica.registrarProp(new Propietario("18467373","12345","Pablo González",5000));
        Propietario prop4 = logica.registrarProp(new Propietario("23746551","12345","Joaquín Álvarez",23000));
        Propietario prop5 = logica.registrarProp(new Propietario("33256986","12345","Roberto Rodríguez",28500));
        Propietario prop6 = logica.registrarProp(new Propietario("12387645","12345","Joaquina Iglesias",68200));
        Propietario prop7 = logica.registrarProp(new Propietario("27839422","12345","Cecilia Sánchez",490));
        Propietario prop8 = logica.registrarProp(new Propietario("37845321","12345","Ana Clara Santos",33000));
        Propietario prop9 = logica.registrarProp(new Propietario("48959877","12345","Óscar Cruz",0));
        Propietario prop10 = logica.registrarProp(new Propietario("24384969","12345","Tobías González",230));
        
        //--------------CATEGORÍAS DE VEHÍCULOS--------------
        CatVehiculo c1 = new CatVehiculo("Automóvil");
        CatVehiculo c2 = new CatVehiculo("Motocicleta");
        CatVehiculo c3 = new CatVehiculo("Bus");
        CatVehiculo c4 = new CatVehiculo("Microbus");
        CatVehiculo c5 = new CatVehiculo("Cuatriciclo");
        
        //--------------TARIFAS PARA PUESTOS--------------
        Tarifa t1 = new Tarifa(200,c1);
        Tarifa t2 = new Tarifa(100,c2);
        Tarifa t3 = new Tarifa(320,c3);
        Tarifa t4 = new Tarifa(239,c4);
        Tarifa t5 = new Tarifa(67,c5);
        
        //------------------------------------------PUESTOS------------------------------------------
        Puesto p1 = logica.agregarPuesto(new Puesto("Puesto Montevideo","Ruta9 km28"));
        if (p1 != null) {
            p1.getTarifas().add(t1);
            p1.getTarifas().add(t2);
            p1.getTarifas().add(t3);
            p1.getTarifas().add(t4);
            p1.getTarifas().add(t5);
        }

        Puesto p2 = logica.agregarPuesto(new Puesto("Puesto Maldonado","Ruta 6 km 102"));
        if (p2 != null) {
            p2.getTarifas().add(t1);
            p2.getTarifas().add(t2);
            p2.getTarifas().add(t3);
            p2.getTarifas().add(t4);
            p2.getTarifas().add(t5);
        }
        
        Puesto p3 = logica.agregarPuesto(new Puesto("Puesto Colonia","Ruta 3 km 280"));
        if (p3 != null) {
            p3.getTarifas().add(t1);
            p3.getTarifas().add(t2);
            p3.getTarifas().add(t3);
            p3.getTarifas().add(t4);
            p3.getTarifas().add(t5);
        }

        Puesto p4 = logica.agregarPuesto(new Puesto("Puesto San José","Ruta 4 km 98"));
        if (p4 != null) {
            p4.getTarifas().add(t1);
            p4.getTarifas().add(t2);
            p4.getTarifas().add(t3);
            p4.getTarifas().add(t4);
            p4.getTarifas().add(t5);
        }
        
        Puesto p5 = logica.agregarPuesto(new Puesto("Puesto Canelones","Ruta 1 km 50"));
        if (p5 != null) {
            p5.getTarifas().add(t1);
            p5.getTarifas().add(t2);
            p5.getTarifas().add(t3);
            p5.getTarifas().add(t4);
            p5.getTarifas().add(t5);
        }
        
        Puesto p6 = logica.agregarPuesto(new Puesto("Puesto Lavalleja","Ruta 11 km 22"));
        if (p6 != null) {
            p6.getTarifas().add(t1);
            p6.getTarifas().add(t2);
            p6.getTarifas().add(t3);
            p6.getTarifas().add(t4);
            p6.getTarifas().add(t5);
        }
        
        //---------------------------------------------------------VEHÍCULOS//---------------------------------------------------------
        Vehiculo v1 = logica.agregarVehiculo(new Vehiculo("SBU 9357","Audi TT RS","Blanco",c1,prop1));
        Vehiculo v2 = logica.agregarVehiculo(new Vehiculo("JNK 2540","BMW X6","Negro",c1,prop2));
        Vehiculo v3 = logica.agregarVehiculo(new Vehiculo("SON 2309","Volkswagen Up","Rojo",c1,prop3));
        Vehiculo v4 = logica.agregarVehiculo(new Vehiculo("KJH 8778","Honda Civic","Amarillo",c1,prop4));
        Vehiculo v5 = logica.agregarVehiculo(new Vehiculo("GVD 3432","Chevrolet Spin","Verde",c1,prop5));
        Vehiculo v6 = logica.agregarVehiculo(new Vehiculo("QRW 2455","Yamaha Crypton","Blanco",c2,prop6));
        Vehiculo v7 = logica.agregarVehiculo(new Vehiculo("MYT 5823","Kiden KD 150 Z","Rojo",c2,prop7));
        Vehiculo v8 = logica.agregarVehiculo(new Vehiculo("DFJ 2129","Zanella ZT 150","Negro",c2,prop8));
        Vehiculo v9 = logica.agregarVehiculo(new Vehiculo("VFR 8868","Marcopolo Viaggio 1050","Negro",c3,prop9));
        Vehiculo v10 = logica.agregarVehiculo(new Vehiculo("KIO 3465","Marcopolo Audace","Rojo",c3,prop10));
        
        //--asignar vehículos a propietarios--
        prop1.getVehiculos().add(v1);
        prop2.getVehiculos().add(v2);
        prop3.getVehiculos().add(v3);
        prop4.getVehiculos().add(v4);
        prop5.getVehiculos().add(v5);
        prop6.getVehiculos().add(v6);
        prop7.getVehiculos().add(v7);
        prop8.getVehiculos().add(v8);
        prop9.getVehiculos().add(v9);
        prop10.getVehiculos().add(v10);

        //-------------BONIFICACIONES-------------
        logica.agregarTipoBonif(new Exonerado());
        logica.agregarTipoBonif(new Frecuente());
        logica.agregarTipoBonif(new Trabajador());
    }
}