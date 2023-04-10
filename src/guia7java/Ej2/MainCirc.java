package Ej2;

import java.util.Scanner;


public class MainCirc {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese circunferencia: ");
        double cir = leer.nextDouble();
        Circunferencia circle = new Circunferencia(cir);
        Circunferencia circulito = new Circunferencia();
        circulito.crearCircunferencia();
        System.out.println("Radio circulito: " + circulito.getRadio());
        System.out.println("Area circulito: " + circulito.calcularArea());
        System.out.println("Perimetro circulito: " + circulito.calcularPerimetro());
        System.out.println("Radio circulito: " + circle.getRadio());
        System.out.println("Area circulito: " + circle.calcularArea());
        System.out.println("Perimetro circulito: " + circle.calcularPerimetro());
    }

}
