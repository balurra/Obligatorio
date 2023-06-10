package controladores;

import dominio.Fachada;
import dominio.peaje.PeajeException;
import dominio.peaje.Puesto;
import dominio.peaje.Transito;
import dominio.peaje.Vehiculo;
import vistas.VistaEmularTransito;

public class ControladorEmularTransito  {
    private Fachada fachada = Fachada.getInstancia();
    private VistaEmularTransito vista;

    public ControladorEmularTransito(VistaEmularTransito vista) {
        this.vista = vista;
        vista.cargarPuestos(fachada.getPuestos());
    }
    
    public Puesto buscarPuestoPorPos(int pos) {
        return fachada.buscarPuestoPorPos(pos);
    }
    
    public Vehiculo buscarVehiculo(String matricula) {
        Vehiculo vehiculo = fachada.buscarVehiculo(matricula);
        if (vehiculo == null) {
            vista.mostrarError("No existe el vehículo");
        }
        return vehiculo;
    }
    
    public void emularTransito(int puestoPos, String matricula) {
        if (puestoPos == -1) {
            vista.mostrarError("Seleccionar puesto");
        } else if (matricula.isEmpty()) {
            vista.mostrarError("Ingresar matrícula");
        } else  {
            Puesto puesto = buscarPuestoPorPos(puestoPos);
            Vehiculo vehiculo = buscarVehiculo(matricula);
            if (vehiculo != null) {
                try {
                    Transito t = fachada.emularTransito(puesto, vehiculo);
                    mostrarMensaje(t);
                } catch(PeajeException e) {
                    vista.mostrarError(e.getMessage());
                }
            }
        }
    }
    
    private void mostrarMensaje(Transito t) {
        String bonif = "Sin bonificación";
        String nombreProp = t.getVehiculo().getProp().getNombreCompleto();
        String catVehiculo = t.getVehiculo().getCategoria().getNombre();
        int costo = t.getCosto();
        int saldoPropRestante = t.getVehiculo().getProp().getSaldo();
        if (t.getBonif() != null) {
            bonif = t.getBonif().getTipoBonificacion().getNombre();
        }

        String mensaje = nombreProp + " - " + catVehiculo +
                         " - " + bonif + " - Total: " + costo +
                         " - Saldo disponible: " + saldoPropRestante;
        
        vista.mostrarExito(mensaje);
    }
}