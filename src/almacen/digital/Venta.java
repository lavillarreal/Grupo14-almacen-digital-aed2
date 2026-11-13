package almacen.digital;

public class Venta {

    // Datos que necesitamos guardar de cada venta
    private int codigoArticulo;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    // Constructor: recibe los datos del producto vendido
    public Venta(int codigoArticulo, int cantidad, double precioUnitario) {
        this.codigoArticulo = codigoArticulo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = calcularSubtotal();
    }

    // Calculamos el importe de la venta
    // Multiplicamos el precio del producto por la cantidad vendida
    public double calcularSubtotal() {
        return precioUnitario * cantidad;
    }

    // Permite consultar el subtotal calculado
    public double getSubtotal() {
        return subtotal;
    }
}
