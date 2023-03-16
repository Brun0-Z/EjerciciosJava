
package guia2java;


import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el número: ");
        double num = leer.nextDouble(); //Esto cuenta como declarar y leer el num
        System.out.println("El doble de " + num + " = " + (num*2));
        System.out.println("El triple de " + num + " = " + (num*3));
        System.out.println("La raíz de " + num + " = " + Math.sqrt(num));
        
        
    }
    
}
