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

    public Articulo buscarArticulo(int codigo) {
        return articulos.get(codigo);
    }
}
