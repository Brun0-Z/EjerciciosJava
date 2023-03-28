package guia4java;

import java.util.Scanner;

/*
Crea una aplicación que nos pida un número por teclado y con 
una función se lo pasamos por parámetro para que nos indique si 
es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
sin embargo, 17 si es primo.

*/

public class Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        System.out.println("¿Es primo?: " + esPrimo(n));
    }
    
    public static boolean esPrimo(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
