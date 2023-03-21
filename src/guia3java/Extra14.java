package guia3java;

import java.util.Scanner;

/*
Se dispone de un conjunto de N familias, cada una de las cuales 
tiene una M cantidad de hijos. Escriba un programa que pida la cantidad 
de familias y para cada familia la cantidad de hijos para averiguar 
la media de edad de los hijos de todas las familias.
*/
public class Extra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantFam = leer.nextInt(), cantH, edadTotal = 0, edad;
        for (int i = 0; i < cantFam; i++) {
            cantH = leer.nextInt();
            for (int j = 0; j < cantH; j++) {
                edad = leer.nextInt();
                edadTotal += edad;
            }
            System.out.println("Promedio familia " + i + ": " + (edadTotal/cantH));
            edadTotal = 0;
        }
    }

}
