
package equipo1;

import java.util.Date;

public class ItemStock {
    Computadora computadora;
    int cantidad;
    Date ultimaFechaModificacion;

    public ItemStock(Computadora computadora, int cantidad) {
        this.computadora = computadora;
        this.cantidad = cantidad;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
