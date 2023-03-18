package guia3java;

import java.util.Scanner;


public class Ej7 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String cad; int contT = 0, contF = 0;

        do{
            cad = scanner.nextLine();
            if(cad.length() <= 5 && cad.substring(0,1).equals("X") && cad.substring(4,5).equals("0"))
                 contT++;
                 else contF++;
            
        }while(!cad.equals("&&&&&"));
        System.out.println("Cantidad de cadenas correctas: " + contT);
        System.out.println("Cantidad de cadenas incorrectas: " + contF);
    }

}
