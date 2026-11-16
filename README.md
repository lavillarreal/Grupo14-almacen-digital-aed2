Grupo: 14 ALMACÉN DIGITAL

Proyecto Integrador – Algoritmos y Estructuras de Datos II (AED II)

Integrantes:
Lourdes Aldana Villarreal – GitHub: lavillarreal
Natalia Elizabeth Villarroel – GitHub: villarroelnatalia08-wq

Tablero Kanban: https://trello.com/b/Lr7saYz0/proyecto-integrador-aed-ii-almacen-digital
Las capturas del seguimiento diario se encuentran en la carpeta kanban.

Tema 7 – Mapas.

Descripción del negocio:
Almacén Digital es un sistema pensado para un pequeño almacén o kiosco que necesita organizar sus productos, controlar las cantidades disponibles y registrar sus ventas.
Está dirigido principalmente a comerciantes que buscan llevar un control sencillo de su negocio mediante una herramienta digital.
El sistema se desarrolla en Java y permite administrar la información de los artículos y las operaciones de venta.

Problema que resuelve y por qué elegimos el tema:
Muchos almacenes pequeños todavía llevan el control de sus productos y ventas de manera manual, lo que puede generar errores en el inventario y los registros. Elegimos esta problemática porque ambas tenemos familiares que poseen almacenes, por lo que estamos familiarizadas con su funcionamiento y las dificultades que pueden presentarse. Nuestro proyecto busca facilitar estas tareas mediante un sistema digital sencillo y organizado.

Elegimos este tema porque las estructuras de tipo mapa permiten almacenar información asociada a una clave.
En nuestro caso, cada artículo se identifica mediante un código único, lo que facilita su búsqueda y administración.

¿Qué permite hacer nuestro programa?
Agregar productos con su código, nombre, precio y cantidad disponible.
Buscar productos por su código.
Modificar los datos de un producto.
Eliminar productos del inventario.
Registrar ventas y calcular el total.
Descontar del stock los productos vendidos.

¿Cómo funciona nuestro programa? 
Almacén Digital es un programa que hicimos en Java para organizar los productos y las ventas de un almacén.
La idea es tener un control de los productos que hay disponibles, saber sus precios, cuánto stock queda y cuánto dinero ingresa por las ventas.


Estructuras utilizadas y por qué las elegimos:
Utilizamos Map porque nos permite relacionar cada producto con un código. De esta manera, cuando queremos buscar un artículo, podemos hacerlo directamente por su código sin tener que revisar todos los productos uno por uno.
Elegimos HashMap para guardar los productos y las ventas porque nos permite agregar, buscar y eliminar datos de manera sencilla.
Utilizamos entrySet(), que sirve para recorrer los elementos guardados en el mapa y mostrar su información.
Por último, usamos TreeMap para ordenar las ventas por número al generar los reportes. Esto es importante porque HashMap no garantiza que los datos aparezcan ordenados.

No utilizamos LinkedHashMap porque esta estructura permite mantener el orden en que se agregan los elementos, pero nuestro programa no necesita conservar ese orden. Elegimos HashMap para administrar los productos y las ventas, y TreeMap para generar reportes ordenados. De esta manera, cumplimos igualmente con los requisitos técnicos mínimos establecidos en la consigna del Tema 7.

Herramientas utilizadas:
Java: para programar el sistema.
Eclipse: para escribir y ejecutar el código.
GitHub: para guardar el proyecto y registrar los cambios que hagamos.
Trello: para organizarnos, dividir las tareas y mostrar nuestros avances mediante un tablero Kanban.

Para que sea más fácil organizarlo, dividimos el código en cuatro clases funcionales y una clase principal:
Articulo.java: guarda los datos de cada producto, como su código, nombre, precio y stock.
Inventario.java: nos permite agregar productos, buscarlos, modificar sus datos, eliminarlos y controlar las cantidades disponibles.
Venta.java: calcula cuánto cuesta una venta según el precio del producto y la cantidad que se vende.
GestionVentas.java: registra las ventas, controla que haya stock suficiente, descuenta las unidades vendidas y suma los ingresos. También muestra comprobantes y reportes.
Principal.java: es donde ponemos en funcionamiento el programa y hacemos las pruebas para ver si todo funciona correctamente.

¿Cómo funciona una venta?
Por ejemplo, si tenemos 25 leches en el inventario y vendemos 2 a $2.000 cada una, el programa primero comprueba que el producto exista y que tengamos suficientes unidades.
Si está todo bien, calcula los $4.000 de la venta, la registra y descuenta las dos leches del inventario. Así, el stock pasa de 25 a 23 unidades.
Al mismo tiempo, esos $4.000 se suman a los ingresos acumulados.
De esta manera, el inventario y las ventas trabajan juntos.

¿Qué pruebas hicimos?
Para comprobar que el programa funcionara, cargamos diez productos de ejemplo y realizamos distintas pruebas.
Probamos agregar, buscar, modificar y eliminar productos. También registramos ventas, verificamos que se descontara correctamente el stock y comprobamos los ingresos acumulados.
Además, hicimos pruebas con errores, como intentar vender un producto que no existe, vender más unidades de las disponibles o ingresar cantidades negativas.
En esos casos, el programa mostró los mensajes correspondientes y no registró las ventas incorrectas.
También comprobamos que los comprobantes mostraran los importes correctos y que el reporte ordenara las ventas por número utilizando TreeMap.

Las capturas y los resultados de las pruebas están disponibles en la carpeta pruebas de nuestro repositorio de GitHub.

Limitaciones actuales y posibles mejoras: 
El programa funciona desde la consola de Eclipse. Actualmente no cuenta con una interfaz gráfica para ingresar productos o registrar ventas.
Los datos se almacenan en memoria mientras el programa está en funcionamiento. Al cerrarlo, la información no se conserva de forma permanente.
Estas características representan posibles mejoras para futuras versiones, ya que en este proyecto nos concentramos en desarrollar e integrar correctamente las funcionalidades del inventario, las ventas, los cálculos y los reportes.

Conclusiones:
Este proyecto nos permitió poner en práctica los conocimientos adquiridos en Algoritmos y Estructuras de Datos II, desarrollando un programa pensado para facilitar la organización de pequeños almacenes.
Durante el desarrollo aprendimos a trabajar con clases y estructuras como Map, HashMap y TreeMap, y a aplicar sus funcionalidades en situaciones concretas. También fortalecimos nuestra capacidad de organización y trabajo en equipo. Natalia se encargó del inventario y Lourdes de las ventas, los cálculos y los reportes.
Una de las principales dificultades fue coordinar e integrar ambas partes para lograr que funcionaran correctamente en conjunto. Finalmente, conseguimos completar la integración y realizar las pruebas correspondientes, verificando el funcionamiento del sistema.
Como posibles mejoras futuras, nos gustaría incorporar una interfaz gráfica y un sistema de almacenamiento permanente de datos.
