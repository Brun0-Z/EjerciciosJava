package guia5java;

import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que llene una matriz de tamaño NxM con valores 
aleatorios y muestre la suma de sus elementos.
*/
public class Ej5Extra {
    public static Random rn = new Random();
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese cantidad de filas: ");
        int filas = leer.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        int columnas = leer.nextInt();
       int[][] matriz = new int[filas][columnas];
       llenarMatriz(matriz);
       mostrarMatriz(matriz);
        System.out.println("Suma de los elementos de la matriz: " + sumarMatriz(matriz));
    }
    
    public static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rn.nextInt(10);
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static int sumarMatriz(int[][] matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            suma += matriz[i][j];
            }
        }
        return suma;
    }
}
