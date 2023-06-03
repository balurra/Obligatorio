package observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {
    final List<Observador> observadores = new ArrayList<>();
    
    public void agregar(Observador observador);
    public void quitar(Observador observador);
    public void avisar(Object evento);
}