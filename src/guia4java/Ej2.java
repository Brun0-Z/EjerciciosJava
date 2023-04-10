package guia4java;

import java.util.Scanner;
import Prueba.Entidad.Persona;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima 
los datos de las personas ingresadas por teclado e indique si son mayores 
o menores de edad. Después de cada persona, el programa debe preguntarle 
al usuario si quiere seguir mostrando personas y frenar cuando el usuario
ingrese la palabra “No”.
*/

public class Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String resp = ""; 
        String nom; int edad;
        do{
            System.out.println("Ingrese el nombre");
            nom = leer.nextLine();
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            leer.nextLine();
            System.out.println("¿Desea seguir ingresando datos?");
            resp = leer.nextLine();
            
            if(resp.equals("NO")) System.out.println("Hasta lueguito");
        }while(!resp.equalsIgnoreCase("NO"));
      
        
    }

}
