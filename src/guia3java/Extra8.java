package guia3java;

import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad 
de números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/

public class Extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cantPares = 0, cantImpares = 0;
        
        do{
          num = leer.nextInt();  
          if(num >= 0){
            if(num%2 == 0) cantPares++;
            else cantImpares++;
          }
        }while(num%5 != 0);
        
        System.out.println("Cant pares ingresados: " + cantPares);
        System.out.println("Cant impares ingresados: " + cantImpares);
        System.out.println("Cant lecturas total: " + (cantPares + cantImpares));
    }

}
