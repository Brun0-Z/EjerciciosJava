package guia5java;

import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia 
entre los elementos).
*/
public class Ej2Extra {

    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int vector1[] = new int[N], vector2[] = new int[N];
        llenarVector(vector1);
        llenarVector(vector2);

        mostrarVector(vector1);
        mostrarVector(vector2);
        
        System.out.println("¿Son iguales los vectores: " + compararVectores(vector1,vector2));
    }
    public static void llenarVector(int[] vector){
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {            
            //System.out.print("Vector [" + i + "] = ");
            vector[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void mostrarVector(int[] vector){
        System.out.println("");
        System.out.print("Vector ingresado: ");
        for (int i = 0; i < vector.length; i++) {            
             System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    
    public static boolean compararVectores(int[] vectorA, int[] vectorB){
        
        for (int i = 0; i < vectorA.length; i++) {
           if(vectorA[i] != vectorB[i]){
               return false;
           } 
        }
        return true;
    }
}
