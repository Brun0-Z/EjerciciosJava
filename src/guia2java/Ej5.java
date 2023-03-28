package guia2java;

import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
public class Ej5 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        double aux = num;
        System.out.println("Doble: " + (num * 2));
        System.out.println("Triple: " + (num * 3));
        System.out.println("Raíz: " + (Math.sqrt(aux)));

    }

}
