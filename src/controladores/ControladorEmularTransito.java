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
            vista.mostrarError("“No existe el vehículo");
        }
        return vehiculo;
    }
    
    public void emularTransito(Puesto puesto, Vehiculo vehiculo) {
        try {
            Transito t = fachada.emularTransito(puesto, vehiculo);
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
        } catch(PeajeException e) {
            vista.mostrarError(e.getMessage());
        }
    }
}