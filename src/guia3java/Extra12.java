package guia3java;

/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre 
los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que 
aparezca un 3 lo sustituya por una E.
*/
public class Extra12 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { 
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10 ; k++) {
                    String iS = String.valueOf(i),jS = String.valueOf(j),kS = String.valueOf(k);
                    if(iS.equals("3")) iS = "E";
                    if(jS.equals("3")) jS = "E";
                    if(kS.equals("3")) kS = "E";
                    System.out.println(iS + " - " + jS + " - " + kS);
                }
            }
        }
    }

}
