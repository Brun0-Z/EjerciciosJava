package guia3java;

import java.util.Scanner;

/*
Crear un programa que dado un número determine si es par o impar.
*/

public class Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = leer.nextInt();
        
        if(num%2==0){
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }

}
