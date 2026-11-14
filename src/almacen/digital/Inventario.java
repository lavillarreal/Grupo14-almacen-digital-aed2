package almacen.digital;

import java.util.Map;
import java.util.HashMap;

public class Inventario {

    private Map<Integer, Articulo> articulos;

    public Inventario() {
        articulos = new HashMap<>();
    }


    public void agregarArticulo(Articulo articulo) {
        if (!articulos.containsKey(articulo.getCodigo())) {
            articulos.put(articulo.getCodigo(), articulo);
            System.out.println("Articulo agregado.");
        } else {
            System.out.println("El codigo ya existe.");
        }
    }

    // Buscar un articulo por codigo
    public Articulo buscarArticulo(int codigo) {
        return articulos.get(codigo);
    }

    // Modificar los datos de un articulo
    public void modificarArticulo(int codigo, String nombre,
                                  double precio, int stock) {
        Articulo articulo = buscarArticulo(codigo);

        if (articulo != null) {
            if (precio >= 0 && stock >= 0) {
                articulo.setNombre(nombre);
                articulo.setPrecio(precio);
                articulo.setStock(stock);
                System.out.println("Articulo modificado.");
            } else {
                System.out.println("Precio o stock incorrecto.");
            }
        } else {
            System.out.println("Articulo no encontrado.");
        }
    }

    // Eliminar un articulo
    public void eliminarArticulo(int codigo) {
        if (articulos.containsKey(codigo)) {
            articulos.remove(codigo);
            System.out.println("Articulo eliminado.");
        } else {
            System.out.println("Articulo no encontrado.");
        }
    }

    // Mostrar los articulos usando entrySet()
    public void mostrarArticulos() {
        for (Map.Entry<Integer, Articulo> entrada : articulos.entrySet()) {
            Articulo articulo = entrada.getValue();

            System.out.println("Codigo: " + entrada.getKey());
            System.out.println("Nombre: " + articulo.getNombre());
            System.out.println("Precio: $" + articulo.getPrecio());
            System.out.println("Stock: " + articulo.getStock());
            System.out.println("--------------------");
        }
    }

    // Comprobar si existe un codigo
    public boolean existeCodigo(int codigo) {
        return articulos.containsKey(codigo);
    }

    // Descontar unidades despues de una venta
    public void descontarStock(int codigo, int cantidad) {
        Articulo articulo = buscarArticulo(codigo);

        if (articulo != null) {
            if (cantidad > 0 && articulo.getStock() >= cantidad) {
                articulo.setStock(articulo.getStock() - cantidad);
                System.out.println("Stock actualizado.");
            } else {
                System.out.println("Cantidad incorrecta o stock insuficiente.");
            }
        } else {
            System.out.println("Articulo no encontrado.");
        }
    }
}

