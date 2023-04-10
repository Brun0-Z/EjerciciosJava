/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.Scanner;

/**
 *
 * @author xew
 */
public class Operacion {
    private int num1;
    private int num2;

    public Operacion(int num1a, int num2a) {
        this.num1 = num1a;
        this.num2 = num2a;
    }

    public Operacion() {

    }

    public int getnum1() {
        return num1;

    }

    public int getnum2() {
        return num2;
    }

    public void setnum1(int num1) {
        this.num1 = num1;
    }

    public void setnum2(int num2) {
        this.num2 = num2;
    }

    public void CrearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
    }

    public int suma() {
        int suma = num1 + num2;
        return suma;
    }

    public int resta() {
        int resta = num1 - num2;
        return resta;
    }

    public int multi() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR");
            return 0;
        } else {
            return num1 * num2;
        }
    }
    public double div(){
        if (num2 ==0) {
            System.out.println("ERROR");
            return 0;
            
        }else
            return num1/num2;
    }
}

