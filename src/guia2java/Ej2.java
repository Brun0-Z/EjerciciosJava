package guia2java;

import java.util.Scanner;

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
public class Ej2 {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        nombre = leer.nextLine();
        System.out.println("Nombre = " + nombre);
        
        //1- Declarar un objeto de esa clase
        //2- Poner nombreDelObjeto.MetodoALlamar()
    }

}
