package dominio;

import java.util.ArrayList;

public class SistemaPeaje {
    private ArrayList<Puesto> puestos = new ArrayList<>();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Categoria> categorias = new ArrayList<>();
    private ArrayList<Bonificacion> bonificaciones = new ArrayList<>();
    
    public void agregarPuesto(Puesto puesto) {
        if (validarListaPuestos(puesto)) {
            puestos.add(puesto);
        }
    }

    private boolean validarListaPuestos(Puesto puesto) {
        if (puestos.contains(puesto)) {
            return false;
        }
        return true;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (validarListaVehiculos(vehiculo)) {
            vehiculos.add(vehiculo);
        }
    }

    private boolean validarListaVehiculos(Vehiculo vehiculo) {
        return !vehiculos.contains(vehiculo);
    }
   
    public void agregarCategoria(Categoria categoria) {
        if (validarListaCategorias(categoria)) {
            categorias.add(categoria);
        }
    }

    private boolean validarListaCategorias(Categoria categoria) {
        return !categorias.contains(categoria);
    }
    
    public void agregarTarifa(Tarifa tarifa){
            if (!validarListaCategorias(tarifa.getCategoriaVehiculo())) {
            return; //falta implementar
        }
    }
    
    public void agregarBonificacion(Bonificacion bonificacion) {
        if (validarListaBonificaciones(bonificacion)) {
            bonificaciones.add(bonificacion);
        }
    }

    private boolean validarListaBonificaciones(Bonificacion bonificacion) {
        return !bonificaciones.contains(bonificacion);
    }
    
    

    
}
