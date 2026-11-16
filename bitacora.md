Día 1: 09/11/2026
Tarea que se realizó en el día:
Responsables: ambas.

1) Elegimos el Tema 7: Mapas – Almacén Digital.
2) Creamos el tablero Kanban en Trello con las columnas Por hacer, En curso y Hecho.
3) Organizamos las primeras tareas y asignamos responsables.
4) Creamos el repositorio en GitHub.
5) Redactamos y guardamos el README.md.
6) Dificultades: Estamos familiarizándonos con las herramientas que vamos a utilizar para trabajar en equipo.

Al principio tuvimos que familiarizarnos con las herramientas de trabajo, pero logramos organizarnos y completar las tareas mediante reuniones por Meet, sin mayores inconvenientes.

Captura del tablero: kanban/dia-1.png

Día 2: 10/11/2026
Tarea que se realizó en el día: Analizamos los requerimientos del sistema Almacén Digital.
1) Identificamos las funcionalidades de inventario, ventas y reportes.
2) Definimos las historias de usuario y los principales casos de uso.
3) Establecimos el uso de Map<Integer, Articulo>, HashMap y TreeMap.

Responsable de cada tarea: 
-Natalia Villarroel: análisis de requerimientos del inventario, registro y consulta de artículos.
-Lourdes Villarreal: análisis del módulo de ventas, cálculos y reportes.

Tarea que realizamos juntas: definición de requerimientos compartidos e integración entre los módulos.

No tuvimos dificultades, ambas nos pusimos de acuerdo mediante meet para completar la tarea.

Captura del tablero: kanban/dia-2.png


Día 3 – 11/11/2026
Tarea que se realizó en el día:
1) Diseñamos las clases, atributos y métodos del sistema Almacén Digital.
2) Definimos cómo se conectarán los módulos de inventario y ventas.
3) Elaboramos el diagrama de clases UML.
4) Preparamos el documento de diseño del Día 3.

Responsable de cada tarea: 
Natalia Villarroel: diseño de las clases Articulo e Inventario y sus operaciones.

Lourdes Villarreal: diseño de las clases Venta y GestionVentas, cálculos y reportes.

Tarea que realizamos juntas: integración de los módulos y elaboración del diagrama UML.

Problemas que nos trabó terminar la tarea más rápido:Tuvimos que revisar y ajustar el diagrama UML para que coincidiera con los contenidos estudiados y los requerimientos del proyecto.

Pendiente: Día 4 – Desarrollo I: comenzar la programación de las clases en Java utilizando Eclipse.

Captura del tablero: kanban/dia-3.png
Captura del tablero: kanban/dia-3.png (parte II)

Día 4 (12/11/2026)

Tarea que se realizó en el día:
1) Comenzamos la programación del sistema Almacén Digital en Java utilizando Eclipse.
2) Desarrollamos las clases Articulo, Inventario, Venta y GestionVentas.
3) Implementamos Map<Integer, Articulo> con HashMap para gestionar los productos.
4) Al avance de la programación la subimos a GitHub.

Responsable de cada tarea: 
Natalia Villarroel: programación de las clases Articulo e Inventario, incluyendo el registro y la búsqueda de productos.
Lourdes Villarreal: programación de las clases Venta y GestionVentas, incluyendo el cálculo del subtotal y la estructura inicial para registrar ventas.

Problemas que nos trabó terminar la tarea más rápido: Tuvimos que revisar los nombres de las clases y sus atributos para que coincidieran con el diseño UML y evitar problemas al integrar ambos módulos.

Pendiente: Continuar con el desarrollo del Día 5, completar las funcionalidades de inventario y ventas, implementar entrySet() y TreeMap para los reportes ordenados e integrar ambos módulos.

Captura del tablero: kanban/dia-4.png

Día 5 (13/11/2026)

Tarea que se realizó en el día:
1) Continuamos la programación del sistema Almacén Digital en Java utilizando Eclipse.
2) Completamos las funcionalidades de inventario y ventas, integrando ambos módulos del sistema.
3) Implementamos entrySet() y TreeMap para generar los reportes ordenados y realizamos la versión final de la clase Principal con los 10 productos precargados.
4) Revisamos la clase Articulo manteniendo su código sin cambios y completamos la versión final de la clase Inventario.
5) Al avance de la programación la subimos a GitHub.

Responsable de cada tarea: 
Natalia Villarroel: verificación de la clase Articulo (sin modificaciones) , finalización de la clase Inventario e implementación de entrySet() y TreeMap.
Lourdes Villarreal: desarrollo de la versión de la clase Principal con los 10 productos cargados, finalización del módulo de ventas e integración general de los módulos.

Problemas que nos trabó terminar la tarea más rápido: Tuvimos que asegurarnos de que los datos precargados en la clase Principal y los recorridos con entrySet() y TreeMap funcionaran correctamente al integrar inventario y ventas.

Pendiente: Realizar pruebas y ajustes generales del sistema (crear las tarjetas de pruebas y correcciones, armar la carpeta /pruebas y completar el archivo README.md).

Captura del tablero: kanban/dia-5.png
Se crea carpeta de pruebas, se sube captura de prueba exitosa del día 5.


Día 6 – Pruebas y correcciones (14/11/2026)

Tarea que realizamos:Hoy terminamos de probar el programa para asegurarnos de que el inventario y las ventas funcionaran correctamente juntos.

Natalia descargó los archivos actualizados de GitHub y los importó a Eclipse.
Probamos las ventas y comprobamos que el stock se descontara correctamente.
Verificamos que los ingresos totales fueran de $12.000.
Probamos los comprobantes y los reportes de ventas.
También hicimos pruebas con productos que no existen, cantidades negativas y stock insuficiente.
Revisamos algunos detalles del código y sacamos un método que no estábamos utilizando.
Finalmente, ejecutamos el programa en las dos computadoras y comprobamos que funcionara bien.

Resultado:
Pudimos integrar nuestras partes del trabajo y las pruebas salieron bien. El programa registra las ventas, actualiza el inventario, calcula los ingresos y muestra los reportes. También avisa cuando intentamos hacer una venta incorrecta.

Actualizamos la carpeta de prueba: 3 imágenes que muestran el resultado exitoso del funcionamiento del códigos. 

Captura del tablero: kanban/dia-6.png (Imágenes subidas 2)
Se crea carpeta de pruebas, se sube captura de prueba exitosa del día .

Para el día 7:
Nos queda revisar que esté todo actualizado en GitHub, terminar los últimos detalles de la documentación y prepararnos para explicar el programa en la defensa oral.

Día 7 - Revisión final del programa (15/11/2026)
Tarea que realizamos: se ejecutaron pruebas integrales de funcionamiento sobre la aplicación " Almacén Digital" para garantizar la estabilidad , el correcto manejo de estructura de datos y la ausencia de errores en tiempo de ejecución.
Revisión del repositorio GitHub
Actualización de bitácora.
- Se adjuntó la captura final del tablero Kanban (Trello) evidenciando la totalidad de las tareas en estado "Hecho".
- Se definió la estructura de la presentación , repartimos los temas para la presentación del proyecto. 
