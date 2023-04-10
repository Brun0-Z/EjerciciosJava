/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {

    }

    public Rectangulo(double baseA, double alturaA) {
        this.base = baseA;
        this.altura = alturaA;

    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE LA BASE");
        this.base = leer.nextDouble();
        System.out.println("INGRESE LA ALTURA");
        this.altura = leer.nextDouble();
    }

    public double calcularSuperficie() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

    public double getbase() {
        return base;
    }

    public double getaltura() {
        return altura;
    }

    public void setbase(double baseA) {
        this.base = baseA;
    }

    public void setaltura(double alturaA) {
        this.base = alturaA;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || j == 0 || i == (base - 1) || j == (altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

