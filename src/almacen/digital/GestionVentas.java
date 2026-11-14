
package almacen.digital;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

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
    
    // Registrar una venta y actualizar el inventario
    public void registrarVenta(int codigo, int cantidad) {
        Articulo articulo = inventario.buscarArticulo(codigo);

        if (articulo == null) {
            System.out.println("Articulo no encontrado.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a cero.");
        } else if (articulo.getStock() < cantidad) {
            System.out.println("Stock insuficiente.");
        } else {
            Venta venta = new Venta(codigo, cantidad, articulo.getPrecio());

            ventas.put(ventas.size() + 1, venta);
            ingresosAcumulados += venta.getSubtotal();

            inventario.descontarStock(codigo, cantidad);

            System.out.println("Venta registrada correctamente.");
            System.out.println("Total: $" + venta.getSubtotal());
        }
    }

    // Mostrar los ingresos de las ventas realizadas
    public void mostrarIngresos() {
        System.out.println("Ingresos acumulados: $" + ingresosAcumulados);
    }
    
 // Mostrar el comprobante de una venta
    public void mostrarComprobante(int numeroVenta) {
        Venta venta = ventas.get(numeroVenta);

        if (venta != null) {
            System.out.println("----- COMPROBANTE DE VENTA -----");
            System.out.println("Numero de venta: " + numeroVenta);
            System.out.println("Total: $" + venta.getSubtotal());
            System.out.println("--------------------------------");
        } else {
            System.out.println("Venta no encontrada.");
        }
    }
    
 // Generar un reporte de las ventas ordenadas
    public void generarReporte() {
        TreeMap<Integer, Venta> ventasOrdenadas = new TreeMap<>(ventas);

        System.out.println("----- REPORTE DE VENTAS -----");

        for (Map.Entry<Integer, Venta> entrada : ventasOrdenadas.entrySet()) {
            System.out.println("Venta N°: " + entrada.getKey());
            System.out.println("Total: $" + entrada.getValue().getSubtotal());
            System.out.println("----------------------------");
        }

        System.out.println("Ingresos totales: $" + ingresosAcumulados);
    }
}
