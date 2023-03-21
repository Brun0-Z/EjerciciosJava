package guia3java;

import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/

public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int mins = leer.nextInt();
       int hora = mins/60;
       int dia = 0;
       while(hora > 24){
            dia++;
            hora = hora - 24;
       } 
        System.out.println(dia + " dias, " + hora + " horas.");
    }

}
