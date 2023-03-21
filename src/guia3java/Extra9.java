package guia3java;

import java.util.Scanner;

/*
Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que 
el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.

*/

public class Extra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1 = leer.nextInt(), n2 = leer.nextInt();
        if(n1 <=1 || n2 <= 1){
            System.out.println("El método no es aplicable");
        } else {
            int residuo, cantRestas = 0;
            
            do{
                
            residuo = n1 - n2;
            if(residuo >= n2){
                n1 = residuo;
            }
            cantRestas++;
            }while(residuo >= n2);
            
            System.out.println("Cociente: " + cantRestas);
            System.out.println("Residuo: " + residuo);
        }
        
        
    }

}
