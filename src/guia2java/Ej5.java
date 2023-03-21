
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
               

      
    }
     
    public static String nombreyedad(String nombre,String edad){
    String ingreso;
    String respuesta="si";
    String nombres ,edades;
    
    
        do {            
            System.out.println("Ingrese Nombre de la persona");
            nombres=leer.next();
         
            
            
        } while (respuesta.equalsIgnoreCase("no"));
    
    
    
    return nombres;
    }   
}