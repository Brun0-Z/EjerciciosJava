package guia2java;

import java.util.Scanner;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas. 
Nota: investigar el método de la clase String toUpperCase() y toLowerCase() en Java.*/

public class Ej3 {
    
    public static void main(String[] args){
        String frase; 
        Scanner leer = new Scanner(System.in); 
        System.out.println("ingrese una frase:");
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    }
}
