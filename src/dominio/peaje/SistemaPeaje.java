package dominio.peaje;

import java.util.ArrayList;

public class SistemaPeaje {
    private ArrayList<Puesto> puestos = new ArrayList<>();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<CatVehiculo> categorias = new ArrayList<>();
    private ArrayList<Bonificacion> bonificaciones = new ArrayList<>();
    
    public void agregarPuesto(Puesto puesto) {
        if (validarListaPuestos(puesto) &&
            validarListaCategoriaTarifas(puesto.getTarifas())) {
            puestos.add(puesto);
        }
    }

    private boolean validarListaPuestos(Puesto puesto) {
        return puestos.contains(puesto);
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (validarListaVehiculos(vehiculo)) {
            vehiculos.add(vehiculo);
        }
    }

    private boolean validarListaVehiculos(Vehiculo vehiculo) {
        return vehiculos.contains(vehiculo);
    }
   
    public CatVehiculo agregarCategoria(CatVehiculo categoria) {
        if (validarListaCategorias(categoria)) {
            categorias.add(categoria);
        }
        return categoria;
    }

    private boolean validarListaCategorias(CatVehiculo categoria) {
        return categorias.contains(categoria);
    }
    
    public void agregarBonificacion(Bonificacion bonificacion) {
        if (validarListaBonificaciones(bonificacion)) {
            bonificaciones.add(bonificacion);
        }
    }

    private boolean validarListaBonificaciones(Bonificacion bonificacion) {
        return bonificaciones.contains(bonificacion);
    }

    private boolean validarListaCategoriaTarifas(ArrayList<Tarifa> tarifas) {
        if(tarifas == null || tarifas.isEmpty()){
            return true;
        }
        for(Tarifa t:tarifas){
            if(!validarListaCategorias(t.getCategoriaVehiculo())){
                return false;
            }
        }
        return true;
    }
}