package guia3java;

import java.util.Scanner;


public class Extra10 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int n1 = (int)Math.floor(Math.random() * 11 ), n2 = (int)Math.floor(Math.random() * 11); /* [0.0 , 1.0) */  
        int rta;
        System.out.println("Rta = " + n1 + " * " + n2 + " = " + (n1*n2));
       do{
        System.out.println("Intente adivinar el resultado de la mult");
        rta = leer.nextInt();
        if(rta == n1*n2){
            System.out.println("Bien ahí master");
        }else{
            System.out.println("Intento incorrecto.");
            if(rta < n1*n2){
                System.out.println("El resultado es mayor");
            } else {
                System.out.println("El resultado es menor");
            }
        }
       }while(rta!=n1*n2);
       
    }

}

/*
Realice un programa para que el usuario adivine el resultado de 
una multiplicación entre dos números generados aleatoriamente 
entre 0 y 9. El programa debe indicar al usuario si su respuesta 
es o no correcta. En caso que la respuesta sea incorrecta se debe 
permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función 
Math.random() de Java
*/