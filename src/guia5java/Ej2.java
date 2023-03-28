package guia5java;

import java.util.Scanner;

/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        rellenarVector(vector);
        mostrarVector(vector);
        System.out.println("");
        System.out.println("Ingrese el número a buscar");
        int num = leer.nextInt();
        buscarNum(vector,num);

    }

    public static void rellenarVector(int vec[]) { //¿Retorna o no retorna?
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void mostrarVector(int vec[]){
        for(int x : vec){
            System.out.print(x + " ");
        }
    }

    public static void buscarNum(int vec[], int num) {
        int cont = 0;

        for (int i = 0; i < vec.length; i++) {
            if (num == vec[i]) {
                System.out.println("Encontrado en posición " + i);
                cont++;
            }
        }
        
        if(cont == 0){
            System.out.println("No se encontró el número");
        }
        if (cont > 1) {
            System.out.println("El número está repetido " + cont + " veces.");
        }
        if (cont == 1){
            System.out.println("Se encontró el número una única vez");
        }
            
        }

    }
