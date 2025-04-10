import java.util.Scanner;
import java.util.Random;
public class MatrizTaller {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int[][] matriz;
    private static int filas;
    private static int columnas;

    boolean validarDimensiones(int filas, int cols) {
        return numFilas > 0 && numCols > 0;   //todavia no lo defino bien
    }

    static int[][] crearMatriz(int numFilas, int numCols) {
        return new int[numFilas][numCols];
    }

    static void ejecutarDefinirCrearMatriz() {
        System.out.print("Ingrese el número de filas (m): ");
        int m = leerOpcionMenu();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = leerOpcionMenu();
        if (validarDimensiones(m, n)) {
            filas = m;
            columnas = n;
            matriz = crearMatriz(filas, columnas);

            System.out.println("Matriz de " + filas + "x" + columnas + " creada.");
            // Opcional: Preguntar si desea llenar la matriz inmediatamente
            System.out.print("¿Desea llenar la matriz con datos aleatorios ahora? (1: Sí, 0: No): ");
            int opcionLlenar = leerOpcionMenu();
            if (opcionLlenar == 1) {
                LlenarMatriz(); //todavia no la hago
            }
        } else {
            System.out.println("Dimensiones inválidas. Las dimensiones deben ser mayores que cero.");
        }
    }

    static int leerOpcionMenu() {
        System.out.print("Ingrese su opción: ");
        while (!scanner.hasNextInt()) {  //saber si el siguiente token es un número entero
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
            scanner.next(); //  entrada inválida
            System.out.print("Ingrese su opción: ");
        }
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        menu();
    }


    static void menu() {
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Definir y crear matriz");
            System.out.println("2. Llenar matriz con datos aleatorios");
            System.out.println("3. Mostrar una fila");
            System.out.println("4. Verificar si la matriz es TIPO CERO");
            System.out.println("5. Salir");
            opcion = leerOpcionMenu();

            switch (opcion) {
                case 1:
                    DefinirCrearMatriz();
                    break;
                case 2:
                   LlenarMatriz();
                    break;
                case 3:
                    MostrarFila();
                    break;
                case 4:
                    EsMatrizCero();   //podria inicializar con true o false la matriz
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);
    }

    }

    public static void main(String[] args) {
        menu();
        scanner.close();
    }
}