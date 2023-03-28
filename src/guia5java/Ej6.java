/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.

[2][7][6]
[9][5][1]
[4][3][8]
 */
package guia5java;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        int[][] matrizMagica = new int[3][3];
        //int sumaCol[] = new int[matrizMagica.length];
        //int sumaFil[] = new int[matrizMagica.length];
        int orden = 3;

        System.out.println("Llene una matriz 3 x 3 con números del 1 al 9.");

        llenarMatriz(matrizMagica);

        System.out.println("");
        System.out.println("MATRIZ INGRESADA:");
        System.out.println("");
        mostrarMatriz(matrizMagica);

        esMagica(matrizMagica);
    }

    public static void esMagica(int[][] matrizMagica) {
        int sumaFila = 0, sumaCol = 0, cont = 0, sumaDiagP = 0, sumaDiagS = 0;
        sumaDiagP = matrizMagica[0][0] + matrizMagica[1][1] + matrizMagica[2][2];
        sumaDiagS = matrizMagica[0][2] + matrizMagica[1][1] + matrizMagica[2][0];
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica.length; j++) {
                sumaFila += matrizMagica[i][j];
                sumaCol += matrizMagica[j][i];
              /* if(i == j){
                    sumaDiagP += matrizMagica[i][j];
                }
                if( (i+j) == matrizMagica.length-1){
                    sumaDiagS += matrizMagica[i][j];
                }*/
            }
            if (sumaFila == sumaCol && sumaFila == sumaDiagP && sumaFila == sumaDiagS) {
                cont++;
                if (cont == matrizMagica.length) {
                    System.out.println("");
                    System.out.println("La matriz ingresada ES MÁGICA.");
                } else {
                    sumaFila = 0;
                    sumaCol = 0;
                }
            } else {
                System.out.println("");
                System.out.println("La matriz ingresada NO es mágica.");
                return;
            }
        }

    }

    public static boolean esIgual(int sumaFila, int sumaCol) {
        return sumaFila == sumaCol;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un valor para cada posición: ");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Matriz" + "[" + i + "]" + "[" + j + "] = ");
                do{
                num = sc.nextInt();
                if(num>9 || num<1){
                    System.out.println("Incorrecto. Ingresar nuevamente: ");
                }
                }while(num>9 || num<1);
                matriz[i][j] = num;
            }
        }
    }
}
