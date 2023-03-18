package guia3java;

import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma 
de los números introducidos supere el límite inicial.
*/

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar límite: ");
        int lim = leer.nextInt();
        int sum = 0;
        do{
           int num = leer.nextInt();
           sum += num;
           System.out.println("Suma actual = " + sum);
        }while(sum <= lim);
        
    }

}
