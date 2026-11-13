package almacen.digital;

import java.util.Map;
import java.util.HashMap;

public class GestionVentas {

    // Inventario que compartiremos con Natalia
    private Inventario inventario;

    // Guardamos las ventas utilizando un codigo identificador
    private Map<Integer, Venta> ventas;

    // Acumulamos el dinero obtenido por las ventas
    private double ingresosAcumulados;

    // Constructor de la clase
    public GestionVentas(Inventario inventario) {
        this.inventario = inventario;
        this.ventas = new HashMap<>();
        this.ingresosAcumulados = 0;
    }
}
