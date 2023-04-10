/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
-Método constructor que inicialice el radio pasado como parámetro.
-Métodos get y set para el atributo radio de la clase Circunferencia.
-Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
-Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
-Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

*/
package Ej2;

import java.util.Scanner;


public class Circunferencia {
    private double radio;
    
    // =========CONSTRUCTOR=========
    public Circunferencia(double radioA){
        this.radio = radioA;
    }
    public Circunferencia(){
        
    }
    
    // =========GET Y SET==========
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radioA){
        this.radio = radioA;
    }       
    
    // ==========OTROS============
    public void crearCircunferencia(){
        System.out.println("Ingrese radio de la circunferencia: ");
        Scanner leer = new Scanner(System.in);
        this.radio = leer.nextDouble();
    }
    
    public double calcularArea(){
        //(Area=〖π*radio〗^2)
        return (Math.PI * Math.pow(radio, 2));
    }
    
    public double calcularPerimetro(){
        //(Perimetro=2*π*radio)
        return (2*Math.PI*this.radio);
    }
}
