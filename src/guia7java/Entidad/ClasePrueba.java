/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;


public class ClasePrueba {
    
    public static void main (String[] args){
        Persona alguien = new Persona();
        Persona angel = new Persona("Angel");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre para saludar a Angel:");
        alguien.setNombre(leer.nextLine());
        alguien.Saludar(angel);
        String nombre = alguien.getNombre();
        
    }
    
}
