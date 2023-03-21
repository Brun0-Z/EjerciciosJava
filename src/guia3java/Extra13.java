package guia3java;

import java.util.Scanner;

/*
Crear un programa que dibuje una escalera de números, donde 
cada línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar.
*/
public class Extra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int aux = 1;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < aux; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
            aux++;
        }
    }

}
