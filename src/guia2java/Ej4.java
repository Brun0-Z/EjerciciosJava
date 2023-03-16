
package guia2java;

import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar 
su equivalente en grados Fahrenheit. La fórmula correspondiente 
es: F = 32 + (9 * C / 5).
*/

public class Ej4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double temp;
        System.out.println("Ingrese la temp en °C");
        temp = leer.nextDouble();
        
        
        double result = 32 + ((9*temp)/5);
        System.out.println("En Fahrenheit: " + result);
        
    }
    
}
