package guia3java;

import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/

public class Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int altMenor = 0, altGeneral = 0, cantMenor = 0, altura;
        for (int i = 0; i < N; i++) {
            altura = leer.nextInt();
            if(altura < 160){
                altMenor += altura;
                cantMenor++;
            }
            altGeneral += altura;
        }
        
        System.out.println("Promedio de estaturas menores a 1.60m : " + (altMenor/cantMenor));
        System.out.println("Promedio de estaturas general : " + (altGeneral/N));
    }

}
