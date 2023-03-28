package guia5java;

import java.util.Random;
import java.util.Scanner;

/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/

public class Ej3Extra {
    public static Random rnd = new Random();
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int vector[] = new int[N];
        llenarVector(vector);
        mostrarVector(vector);
    }
    public static void llenarVector(int[] vector){
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {           
            vector[i] = rnd.nextInt(10);
        }
    }
    
    public static void mostrarVector(int[] vector){
        System.out.print("Vector ingresado: ");
        for (int i = 0; i < vector.length; i++) {            
             System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
