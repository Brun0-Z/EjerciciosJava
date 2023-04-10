package guia5java;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
 */
import java.util.Random;
import java.util.Scanner;


public class Ej6Extra {
    
    public static Random aleatorio = new Random(System.currentTimeMillis());
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] palabras = {"perro", "gato", "casa", "uva", "oso"};
        //String[] palabras = ingresarPalabras();

        mostrarVector(palabras);
        System.out.println(" ");

        String[][] sopa = new String[20][20];

        // Inicializar sopa de letras
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = String.valueOf((int) (Math.random() * num.length));
            }
        }

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            int f = aleatorio.nextInt(20);
            int c = aleatorio.nextInt(15);

            insertarHorizontal(sopa, palabra, f, c);
            //System.out.println(" "+ palabra + " "+ f+ " "+c);
        }

        imprimirSopa(sopa);
    }

    public static void insertarHorizontal(String[][] sopa, String palabra, int f, int c) {
        for (int i = 0; i < palabra.length(); i++) {
            sopa[f][c] = palabra.substring(i, i + 1);
            c++;
        }
    }

    public static String[] ingresarPalabras() {
        System.out.println("Ingrese 5 palabras de 3 a 5 caracteres: ");
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra nro " + (i + 1) + ": ");
            palabras[i] = sc.nextLine();

            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Palabra inválida. Ingrese una palabra de 3 a 5 caracteres: ");
                palabras[i] = sc.nextLine();
            }
        }
        return palabras;
    }

    public static void mostrarVector(String[] vector) {
        System.out.print("Palabras: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }

    public static void imprimirSopa(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
