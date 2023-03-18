package guia3java;

import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
*/
public class Ej8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if(i==1 || i == N-1 || j == 1 || j == N-1)
                    System.out.print("*");
                 else 
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
