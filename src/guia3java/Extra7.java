package guia3java;

import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, 
el valor mínimo y el promedio de n números (n>0). El valor de n 
se solicitará al principio del programa y los números serán 
introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.
*/

public class Extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int min = 0, max = 0, prom = 0, cont = 0, num;
        while(cont<N){
            cont++;
            num = leer.nextInt();
            if(num<min) min = num;
            if(num>max) max = num;
            prom += num;
        }
        
        do{
            num = leer.nextInt();
            if(num<min) min = num;
            if(num>max) max = num;
            prom += num;
            cont++;
        }while(cont<N);
        
        System.out.println("Valor mínimo: " + min);
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor promedio: " + (prom/N));
        
    }

}
