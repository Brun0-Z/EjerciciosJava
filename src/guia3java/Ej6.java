package guia3java;

import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
 */
public class Ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double n1 = leer.nextDouble(), n2 = leer.nextDouble();
        boolean conectado = true;
        do {
            System.out.println("Bienvenido");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            System.out.println("Ingrese una opcion: ");
            int opc = leer.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("Suma = " + (n1 + n2));
                    break;
                }
                case 2: {
                    System.out.println("Resta = " + (n1 - n2));
                    break;
                }
                case 3: {
                    System.out.println("Multiplicación = " + (n1 * n2));
                    break;
                }
                case 4: {
                    System.out.println("Dividir = " + (n1 / n2));
                    break;
                }
                case 5: {
   
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String x =leer.next();
                    switch(x.toUpperCase()){
                        case "S":{
                            System.out.println("Hasta la próxima!");
                            conectado = false;
                            break;
                        }
                        case "N":{
                            System.out.println("Gracias por quedarte!");
                            break;
                        }
                        default:{
                            System.out.println("Opción no válida");
                            break;
                        }
                    }
                    break;
                }
            }

        } while (conectado);

    }

}
