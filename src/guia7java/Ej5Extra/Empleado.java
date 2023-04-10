
package Ej5Extra;

/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser del 
10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

*/
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public Empleado(){
        
    }
    
    public Empleado(String nombreA, int edadA, double salarioA){
        this.nombre = nombreA;
        this.edad = edadA;
        this.salario = salarioA;
    }
    
    public void setNombre(String nombreA){
        this.nombre = nombreA;
    }
    public void setEdad(int edadA){
        this.edad = edadA;
    }
    public void setSalario(double salarioA){
        this.salario = salarioA;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public double getSalario(){
        return this.salario;
    }
    
    public void calcular_aumento(){
       if(this.edad > 30){
           this.salario *= 1.1; //salario = salario + (salario*0,1)
       }else{
           this.salario *= 1.05;
       }
        System.out.println("Su nuevo salario es de: " + this.salario);        
    }
    
}
