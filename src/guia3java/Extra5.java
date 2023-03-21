package guia3java;

import java.util.Scanner;

/*
Una obra social tiene tres clases de socios:
-Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.
-Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A.
-Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego 
un valor real que represente el costo del tratamiento (previo al descuento) y 
determine el importe en efectivo a pagar por dicho socio.



*/

public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String tipo = leer.nextLine();
        float costo = leer.nextInt();
        
        switch(tipo){
            case "A":{
                System.out.println("El importe con descuento para socio tipo A es: " + (costo/2));
                break;
            }
            case "B":{
                System.out.println("El importe con descuento para socio tipo B es: " + (costo-(35*costo/100)));
                break;
            }
            case "C":{
                System.out.println("No se aplican descuentos para este tipo de socio");
                break;
            }
            default:{
                System.out.println("Tipo de socio no válido");
            }
        }
    }

}
