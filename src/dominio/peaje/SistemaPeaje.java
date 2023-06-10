package dominio.peaje;

import dominio.usuario.Propietario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaPeaje {
    private final ArrayList<Puesto> puestos = new ArrayList<>();
    private final ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private final ArrayList<TipoBonificacion> tiposBonif = new ArrayList<>();
    private final int alertaSaldoMinimo = 500;
    
    public List<TipoBonificacion> getTiposBonif() {
        return tiposBonif;
    }

    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public Puesto agregarPuesto(Puesto puesto) {
        Puesto retorno = null;
        if (validarListaPuestos(puesto)) {
            puestos.add(puesto);
            retorno = puesto;
        }
        return retorno;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (validarListaVehiculos(vehiculo)) {
            vehiculos.add(vehiculo);
            vehiculo.getProp().asignarVehiculo(vehiculo);
        }
    }
    
    public Vehiculo buscarVehiculo(String matricula) {
        Vehiculo retorno = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (matricula.equals(vehiculo.getMatricula())) {
                retorno = vehiculo;
            }
        }
        return retorno;
    }
    
    public void agregarTipoBonif (TipoBonificacion tipo) {
        if (validarListaTiposBonif(tipo)) {
            tiposBonif.add(tipo);
        }
    }
    
    public Puesto buscarPuestoPorPos(int pos) {
        return puestos.get(pos);
    }
    
    public TipoBonificacion buscarTipoBonifPorPos(int pos) {
        return tiposBonif.get(pos);
    }
    
    public Transito emularTransito(Puesto puesto, Vehiculo vehiculo) throws PeajeException {
        CatVehiculo catVehiculo = vehiculo.getCategoria();
        Tarifa tarifa = puesto.buscarTarifaCorrespondiente(catVehiculo);
        int costo = tarifa.getMonto();
        Propietario prop = vehiculo.getProp();
        Bonificacion bonif = prop.bonifParaPuesto(puesto);
        int montoBonif = 0;

        if (prop.getSaldo() < costo) {
            throw new PeajeException("El propietario no tiene saldo suficiente. Saldo actual: $" + prop.getSaldo());
        }

        Transito transito = agregarTransito(puesto, vehiculo, costo, bonif, montoBonif);

        if (bonif != null) {
            montoBonif = calcularDesc(costo, bonif, transito);
            transito.setMontoBonif(montoBonif);
            transito.setCosto(costo - montoBonif);
        }

        enviarNotifs(transito.getFecha(), puesto, vehiculo);
        vehiculo.getProp().avisar(EventosProp.CAMBIO_DATOS);

        return transito;
    }
    
    public void asignarBonificacion(Propietario prop, TipoBonificacion tipoBonif, Puesto puesto) throws PeajeException {
        if (!prop.tieneBonifEnPuesto(puesto)) {
            Bonificacion bonif = new Bonificacion(tipoBonif, puesto);
            prop.agregarBonif(bonif);
            prop.avisar(EventosProp.CAMBIO_DATOS);
        } else {
            throw new PeajeException("El propietario ya tiene una bonificación en ese puesto");
        }
    }
    
    private int calcularDesc(int costo, Bonificacion bon, Transito t) {
        int porcentaje = bon.calcularPorcentajeDesc(t);
        double decimal = porcentaje/100.0;
        return (int)(costo * decimal);
    }
    
    private Transito agregarTransito(Puesto p, Vehiculo v, int costo, Bonificacion bon, int montoBonif){
        Transito transito = new Transito(p, v, costo, bon, montoBonif);
        Propietario prop = v.getProp();
        v.agregarTransito(transito);
        prop.restarSaldo(costo);
        return transito;
    }
    
    private void enviarNotifs(Date fecha, Puesto p, Vehiculo v) {
        Notificacion notif = new Notificacion(fecha + " Pasaste por el puesto " +
                                              p.getNroPuesto() + " con el vehículo " + 
                                              v.getMatricula());
        Propietario prop = v.getProp();
        prop.enviarNotifs(notif);
        if (prop.getSaldo() < alertaSaldoMinimo) {
            Notificacion notifSaldo = new Notificacion("Tu saldo actual es de $" + prop.getSaldo()
                                                       + ". Te recomendamos hacer una recarga.");
            prop.enviarNotifs(notifSaldo);
        }
    }
    
    private boolean validarListaTiposBonif(TipoBonificacion tipo) {
        return !tiposBonif.contains(tipo);
    }

    private boolean validarListaVehiculos(Vehiculo vehiculo) {
        boolean exito = true;
        for (Vehiculo v : vehiculos) {
            if (v.equals(vehiculo)) {
                exito = false;
            }
        }
        return exito;
    }
    
    private boolean validarListaPuestos(Puesto puesto) {
        return !puestos.contains(puesto);
    }
}