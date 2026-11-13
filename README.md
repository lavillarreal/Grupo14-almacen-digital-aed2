Grupo: 14 ALMACÉN DIGITAL

Proyecto Integrador – Algoritmos y Estructuras de Datos II (AED II)

Integrantes:
Lourdes Aldana Villarreal – GitHub: lavillarreal
Natalia Elizabeth Villarroel – GitHub: villarroelnatalia08-wq

Tablero Kanban: https://trello.com/b/Lr7saYz0/proyecto-integrador-aed-ii-almacen-digital
Las capturas del seguimiento diario se encuentran en la carpeta kanban.

Tema 7 – Mapas (HashMap, LinkedHashMap y TreeMap). 

Descripción del negocio:
Almacén Digital es un sistema pensado para un pequeño almacén o kiosco que necesita organizar sus productos, controlar las cantidades disponibles y registrar sus ventas.
Está dirigido principalmente a comerciantes que buscan llevar un control sencillo de su negocio mediante una herramienta digital.
El sistema se desarrolla en Java y permite administrar la información de los artículos y las operaciones de venta.

Problema que resuelve y por qué elegimos el tema:
Muchos almacenes pequeños todavía llevan el control de sus productos y ventas de manera manual, lo que puede generar errores en el inventario y los registros. Elegimos esta problemática porque ambas tenemos familiares que poseen almacenes, por lo que estamos familiarizadas con su funcionamiento y las dificultades que pueden presentarse. Nuestro proyecto busca facilitar estas tareas mediante un sistema digital sencillo y organizado.

Elegimos este tema porque las estructuras de tipo mapa permiten almacenar información asociada a una clave.
En nuestro caso, cada artículo se identifica mediante un código único, lo que facilita su búsqueda y administración.

¿Qué va a poder hacer nuestro programa?
Agregar productos con su código, nombre, precio y cantidad disponible.
Buscar productos por su código.
Modificar los datos de un producto.
Eliminar productos del inventario.
Registrar ventas y calcular el total.
Descontar del stock los productos vendidos.
Mostrar reportes con los productos ordenados por código.

Utilizamos las siguientes estructuras y operaciones:
HashMap: para guardar los productos y encontrarlos mediante su código.
LinkedHashMap: para mantener el orden en que se agregan los productos, cuando lo necesitemos.
TreeMap: para mostrar reportes ordenados por código.
entrySet(): para recorrer los productos y consultar su información.

Funcionalidades:
El sistema está organizado en cuatro clases principales:
-Articulo: almacena el código, nombre, precio y stock de cada producto.
-Inventario: permite agregar, buscar, modificar, eliminar y consultar artículos, además de controlar el stock mediante Map y HashMap.
-Venta: registra los datos de cada venta y calcula el subtotal multiplicando el precio por la cantidad vendida.
-GestionVentas: permite registrar ventas, verificar y descontar stock, calcular ingresos, emitir comprobantes y generar reportes ordenados mediante TreeMap.
-Estas funcionalidades se encuentran en distintas etapas de desarrollo e integración.

Herramientas que vamos a usar:
Java: para programar el sistema.
Eclipse: para escribir y ejecutar el código.
GitHub: para guardar el proyecto y registrar los cambios que hagamos.
Trello: para organizarnos, dividir las tareas y mostrar nuestros avances mediante un tablero Kanban.

Conclusiones:
Este proyecto nos permitió poner en práctica lo aprendido en Algoritmos y Estructuras de Datos II, creando un programa pensado para facilitar el trabajo de los pequeños almacenes.
Aprendimos a utilizar clases y estructuras como Map, HashMap y TreeMap, además de organizarnos para trabajar en equipo. Natalia se encargó del inventario y Lourdes de las ventas, los cálculos y los reportes.
Una de las principales dificultades fue coordinar nuestros trabajos para que todas las partes del programa funcionen juntas.
Más adelante, nos gustaría agregar una interfaz gráfica y una forma de guardar la información para no perderla al cerrar el programa.
Esta conclusión es provisoria y la completaremos cuando terminemos de integrar y probar el sistema.
