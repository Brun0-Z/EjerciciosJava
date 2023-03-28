package guia5java;

import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un 
vector de tamaño N, con los valores ingresados por el usuario.

*/

public class Ej1Extra {
    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int vector[] = new int[N];
        llenarVector(vector);
        mostrarVector(vector);
        System.out.println("Suma del vector: " + sumarVector(vector));
    }
    public static void llenarVector(int[] vector){
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {            
            System.out.print("Vector [" + i + "] = ");
            vector[i] = leer.nextInt();
        }
    }
    
    public static void mostrarVector(int[] vector){
        System.out.print("Vector ingresado: ");
        for (int i = 0; i < vector.length; i++) {            
             System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    
    public static int sumarVector(int[] vector){
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }
}
