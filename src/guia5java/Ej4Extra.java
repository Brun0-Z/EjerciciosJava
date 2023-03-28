package guia5java;

import java.util.Scanner;

/*
Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad 
de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 
4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad 
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.

*/
public class Ej4Extra {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
       double[][] notas = new double[2][5];
       llenarMatriz(notas);
       mostrarMatriz(notas);
       calcularAprobados(notas);
       
    }
    
    public static void llenarMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length-1; j++) {
                System.out.println("Nota " + (j+1) + " de alumno " + (i+1));
                matriz[i][j] = leer.nextDouble();
                
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][matriz[i].length-1] = 0.1*matriz[i][0] + 0.15*matriz[i][1] + 0.25*matriz[i][2] + 0.5*matriz[i][3];
        }
    }
    
    public static void mostrarMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void calcularAprobados(double[][] matriz){
        int contadorAp = 0;
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][matriz.length] >= 7){
                contadorAp++;
            }
        }
        
        System.out.println("Cantidad de aprobados: " + contadorAp);
        System.out.println("Cantidad desaprobados: " + (matriz.length - contadorAp));
        
    }
    
}
