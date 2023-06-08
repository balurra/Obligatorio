package dominio.peaje;

import dominio.usuario.Propietario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaPeaje {
    private ArrayList<Puesto> puestos = new ArrayList<>();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<TipoBonificacion> tiposBonif = new ArrayList<>();
    private int alertaSaldoMinimo = 100;
    
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

    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        Vehiculo retorno = null;
        if (validarListaVehiculos(vehiculo)) {
            vehiculos.add(vehiculo);
            retorno = vehiculo;
        }
        return retorno;
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
        Tarifa tarifa = buscarTarifaCorrespondiente(puesto, catVehiculo);
        Propietario prop = vehiculo.getProp();
        int costo = tarifa.getMonto();
        Transito transito = null;
        Bonificacion bonif = prop.bonifParaPuesto(puesto);
        int montoBonif = 0;
        
        if (bonif != null) {
            Date fechaActual = new Date();
            montoBonif = calcularDesc(costo, bonif, vehiculo, fechaActual);
            costo = costo - montoBonif;
        }
        
        if (prop.getSaldo() >= costo) {
            transito = agregarTransito(puesto, vehiculo, costo, bonif, montoBonif);
            enviarNotifs(transito.getFecha(), puesto, vehiculo);
            vehiculo.getProp().avisar(EventosProp.CAMBIO_DATOS);
        } else {
            throw new PeajeException("Saldo insuficiente");
        }
        
        return transito;
    }
    
    public void asignarBonificacion(Propietario prop, TipoBonificacion tipoBonif, Puesto puesto) throws PeajeException {
        if (!tieneBonifEnPuesto(prop, puesto)) {
            Bonificacion bonif = new Bonificacion(tipoBonif, puesto);
            prop.getBonificaciones().add(bonif);
            prop.avisar(EventosProp.CAMBIO_DATOS);
        } else {
            throw new PeajeException("El propietario ya tiene una bonificación en ese puesto");
        }
    }
    
    private int calcularDesc(int costo, Bonificacion bon, Vehiculo v, Date fecha) {
        return costo * (bon.calcularPorcentajeDesc(v, fecha)/100);
    }
    
    private Transito agregarTransito(Puesto p, Vehiculo v, int costo, Bonificacion bon, int montoBonif){
        Transito transito = new Transito(p, v, costo, bon, montoBonif);
        Propietario prop = v.getProp();
        v.getTransitos().add(transito);
        int saldoProp = prop.getSaldo();
        prop.setSaldo(saldoProp - costo);
        return transito;
    }
    
    private void enviarNotifs(Date fecha, Puesto p, Vehiculo v) {
        Notificacion notif = new Notificacion(fecha + " Pasaste por el puesto " +
                                              p.getNroPuesto() + " con el vehículo " + 
                                              v.getMatricula());
        Propietario prop = v.getProp();
        prop.getNotificaciones().add(notif);
        if (prop.getSaldo() < alertaSaldoMinimo) {
            Notificacion notifSaldo = new Notificacion("Tu saldo actual es de $" + prop.getSaldo()
                                                       + ". Te recomendamos hacer una recarga");
            prop.getNotificaciones().add(notifSaldo);
        }
    }
    
    private Tarifa buscarTarifaCorrespondiente(Puesto puesto, CatVehiculo cat) {
        Tarifa tarifa = null;
        
        for (Tarifa t : puesto.getTarifas()) {
            if (cat.equals(t.getCategoriaVehiculo())) {
                tarifa = t;
            }
        }
        
        return tarifa;
    }
    
    private boolean tieneBonifEnPuesto(Propietario prop, Puesto puesto) {
        boolean exito = false;
        ArrayList<Bonificacion> bonifsProp = prop.getBonificaciones();
        for (Bonificacion b : bonifsProp) {
            if (puesto.equals(b.getPuesto())) {
                exito = true;
            }
        }
        return exito;
    }

    private boolean validarListaTiposBonif(TipoBonificacion tipo) {
        return !tiposBonif.contains(tipo);
    }

    private boolean validarListaVehiculos(Vehiculo vehiculo) {
        return !vehiculos.contains(vehiculo);
    }
    
    private boolean validarListaPuestos(Puesto puesto) {
        return !puestos.contains(puesto);
    }
}