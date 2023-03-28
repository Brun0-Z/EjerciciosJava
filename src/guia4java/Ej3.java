package guia4java;

import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

*/
public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros = leer.nextDouble();
        System.out.println("¿A qué moneda desea convertir?");
        leer.nextLine();
        String opc = leer.nextLine();
        
        System.out.println("Moneda convertida a " + opc + ": " + conversor(euros,opc));
        
    }
    
    public static double conversor(double e, String moneda){
        double convertida;
        switch(moneda){
            case "L":
                return e*0.86;
                
            case "D":
                return e*1.28611;
                
            case "Y":
                return e*129.852;
            default:
                System.out.println("Moneda inválida");
                return 0;
        }
        
    }
}
