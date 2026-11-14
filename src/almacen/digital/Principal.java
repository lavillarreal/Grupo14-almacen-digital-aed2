package almacen.digital;

public class Principal {

    public static void main(String[] args) {

        // Creamos el inventario
        Inventario inventario = new Inventario();

        // Cargamos los productos del almacen
        inventario.agregarArticulo(new Articulo(1, "Leche", 1800, 20));
        inventario.agregarArticulo(new Articulo(2, "Arroz", 1500, 30));
        inventario.agregarArticulo(new Articulo(3, "Azucar", 1200, 25));
        inventario.agregarArticulo(new Articulo(4, "Fideos", 1400, 40));
        inventario.agregarArticulo(new Articulo(5, "Aceite", 3500, 15));
        inventario.agregarArticulo(new Articulo(6, "Harina", 1100, 35));
        inventario.agregarArticulo(new Articulo(7, "Yerba", 4200, 20));
        inventario.agregarArticulo(new Articulo(8, "Galletitas", 1600, 50));
        inventario.agregarArticulo(new Articulo(9, "Cafe", 5500, 10));
        inventario.agregarArticulo(new Articulo(10, "Sal", 900, 30));

        // Mostramos todos los productos cargados
        System.out.println("INVENTARIO INICIAL:");
        inventario.mostrarArticulos();

        // Buscamos un producto por su codigo
        Articulo encontrado = inventario.buscarArticulo(3);

        if (encontrado != null) {
            System.out.println("Producto encontrado: "
                    + encontrado.getNombre());
        }

        // Modificamos el precio y stock de la leche
        inventario.modificarArticulo(1, "Leche", 2000, 25);

        // Simulamos la salida de 3 unidades de arroz
        inventario.descontarStock(2, 3);

        // Comprobamos si existe un producto
        System.out.println("Existe el codigo 5: "
                + inventario.existeCodigo(5));

        // Eliminamos un producto
        inventario.eliminarArticulo(10);

        // Mostramos el inventario actualizado
        System.out.println("INVENTARIO FINAL:");
        inventario.mostrarArticulos();
    
     // Creamos la gestion de ventas usando el inventario
        GestionVentas gestion = new GestionVentas(inventario);
        
 // Registramos tres ventas de prueba
    System.out.println("----- REGISTRO DE VENTAS -----");
    gestion.registrarVenta(1, 2); // 2 leches
    gestion.registrarVenta(2, 3); // 3 arroces
    gestion.registrarVenta(5, 1); // 1 aceite

    // Mostramos los comprobantes
    System.out.println("----- COMPROBANTES -----");
    gestion.mostrarComprobante(1);
    gestion.mostrarComprobante(2);
    gestion.mostrarComprobante(3);

    // Consultamos los ingresos
    gestion.mostrarIngresos();

    // Generamos el reporte ordenado con TreeMap
    gestion.generarReporte();

    // Verificamos el inventario despues de las ventas
    System.out.println("----- STOCK DESPUES DE LAS VENTAS -----");
    inventario.mostrarArticulos();
    
 // DIA 6 - PRUEBAS DE VENTAS

    System.out.println("----- PRUEBAS DIA 6 -----");

    // Intentamos vender un producto que no existe
    gestion.registrarVenta(99, 2);

    // Intentamos vender mas unidades de las disponibles
    gestion.registrarVenta(1, 100);

    // Intentamos vender una cantidad negativa
    gestion.registrarVenta(2, -3);

    // Comprobamos los ingresos despues de las pruebas
    gestion.mostrarIngresos();

    // Comprobamos que el stock no haya cambiado
    inventario.mostrarArticulos();
    
 // DIA 6 - PRUEBA DE COMPROBANTES Y REPORTES

    System.out.println("----- PRUEBA DE COMPROBANTES -----");

    // Comprobante de una venta que existe
    gestion.mostrarComprobante(1);

    // Comprobante de una venta que no existe
    gestion.mostrarComprobante(99);

    // Reporte de ventas
    System.out.println("----- REPORTE FINAL -----");
    gestion.generarReporte();
    
    }
    
}
