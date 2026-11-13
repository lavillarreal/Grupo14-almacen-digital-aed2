package almacen.digital;

public class Principal {

	public static void main(String[] args) {
		//Creamos el inventario donde guardaremos los Articulos
		Inventario inventario = new Inventario ();
		
		Articulo articulo1 = new Articulo(1,"Harina", 1500, 20);
		Articulo articulo2 = new Articulo(2,"Leche", 2000, 30);
		
		//Agregamos los articulos al inventario
		inventario.agregarArticulo(articulo1);
		inventario.agregarArticulo(articulo2);
	}

}
