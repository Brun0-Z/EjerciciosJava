package guia5java;


import java.util.Random;
import java.util.Scanner;

public class Ej6Stefi {
    public static Random rn = new Random();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vector de letras del alfabeto
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        // Leer 5 palabras
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabras[i] = sc.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Palabra inválida. Ingrese una palabra de 3 a 5 caracteres: ");
                palabras[i] = sc.nextLine();
            }
        }

        // Crear sopa de letras
        String[][] sopa = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = String.valueOf((int)(Math.random() * num.length));
                        //alfabeto[(int) (Math.random() * alfabeto.length)];
            }
        }

        // Seleccionar fila aleatoria para ubicar las palabras
        int fila = (int) (Math.random() * 20);

        // Ubicar las palabras en la fila seleccionada
        int posInicial = (int) (Math.random() * 16);
        for (int i = 0; i < palabras.length; i++) {
            sopa[fila][posInicial + i] = palabras[i].substring(0,1);
            for (int j = 1; j < palabras[i].length(); j++) {
                sopa[fila][posInicial + j] = palabras[i].substring(j);
            }
        }

        // Imprimir sopa de letras
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
