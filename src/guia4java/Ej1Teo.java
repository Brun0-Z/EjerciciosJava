package guia4java;

import java.util.Scanner;


public class Ej1Teo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = "";
        System.out.println("Ingrese una frase terminada con punto");
        do{
            frase = leer.nextLine();
            if(!frase.substring(frase.length()-1, frase.length()).equals(".")){
                System.out.println("La frase no tiene el formato incorrecto. Ingresar nuevamente");
            }
          
        }while(!frase.substring(frase.length()-1, frase.length()).equals("."));
        
        codificar(frase);
    }
    
    public static void codificar(String frase){
        for (int i = 0; i < frase.length(); i++) {
            switch(frase.substring(i,i+1)){
                case "a":
                    System.out.print("@");
                    break;
                case "e":
                    System.out.print("#");
                    break;
                case "i":
                    System.out.print("$");
                    break;
                case "o":
                    System.out.print("%");
                    break;
                case "u":
                    System.out.print("*");
                    break;
                default:
                    System.out.print(frase.substring(i,i+1));
            }
            
        }
        System.out.println("");
        
    }
}
