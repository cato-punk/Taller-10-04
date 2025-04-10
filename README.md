# Taller-10-04
Administrador de Matriz en Java
Main 
Usar un menu (reciclar)
  menu(): Presenta el menú de opciones al usuario y gestiona la interacción para utilizar las diferentes funcionalidades.
  leerOpcionMenu()`: Lee la opción ingresada por el usuario desde la consola y asegura que sea un entero.

La aplicación permite al usuario: (opciones del menu)

1.  Definir las dimensiones de la matriz: El usuario ingresa el número de filas (m) y columnas (n). Se valida que estas dimensiones sean válidas (mayores que cero).
2.  Crear la matriz: Una vez validadas las dimensiones, se crea una matriz de enteros con esas dimensiones.
3.  Llenar la matriz con datos aleatorios La matriz se llena automáticamente con números enteros aleatorios entre 0 y 9.
4.  Mostrar una fila específica:el usuario puede ingresar el número de una fila para visualizar su contenido.
5.  Verificar si la matriz es de tipo cero: La aplicación determina si más del 50% de los elementos de la matriz son cero.
6.  Interactuar a través de un menú: se proporciona un menú en la consola para acceder a todas las funcionalidades mencionadas.

Aparte:
1 main(String[] args): El punto de entrada de la aplicación, que invoca al método `menu()` para iniciar la interacción con el usuario.
2 validarDimensiones(int numFilas, int numCols): Valida si el número de filas y columnas ingresados son dimensiones válidas (mayores que cero).
3 crearMatriz(int numFilas, int numCols): crea y devuelve una matriz de enteros con las dimensiones especificadas.
4 llenarMatriz(int[][] matrizParaLlenar): Llena la matriz proporcionada con números enteros aleatorios entre 0 y 9.
5 mostrarFila(int[][] matrizParaMostrar, int indiceFila): muestra por consola los elementos de la fila especificada de la matriz.
6 esIndiceFilaValido(int[][] matriz, int indice): Verifica si el índice de la fila proporcionado es válido dentro de los límites de la matriz. 
7 esMatrizCero(int[][] matrizParaVerificar): s(int[][] matriz): Devuelve el número total de elementos en la matriz.
8 contarCerosVerifica si más del 50% de los elementos de la matriz son cero.
9 obtenerTotalElementos(int[][] matriz): Cuenta la cantidad de elementos con valor cero en la matriz.
10 ejecutarCrearMatriz(): Contiene la lógica para que el usuario defina y se cree la matriz.`ejecutarLlenarMatriz()`: Contiene la lógica para llenar la matriz con valores aleatorios.
11 MostrarFila(): Contiene la lógica para que el usuario seleccione y se muestre una fila.


