package Ej5Extra;

import java.util.Scanner;


public class Main5Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre:");
        String nom = leer.nextLine();  
        System.out.println("Edad:");
        int edad = leer.nextInt();
        System.out.println("Sueldo:");
        double saldo = leer.nextDouble();
        Empleado emp1 = new Empleado(nom,edad,saldo);
        emp1.calcular_aumento();
    }

}
