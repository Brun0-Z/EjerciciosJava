/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2java;

import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = leer.nextInt();
        System.out.println("Suma = " + num1 + " + " + num2 + " = " + (num1 + num2));

    }

}
