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
    }
}
