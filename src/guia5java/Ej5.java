package guia5java;

/*
Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/

public class Ej5 {

    public static void main(String[] args) {
        int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}}; // ejemplo de matriz

        mostrarMatriz(matriz);
        
        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }

    public static boolean esAntisimetrica(int[][] matriz) {
        // comprobar si A = -AT
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
     public static void mostrarMatriz(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length;j++){
                System.out.print(mat[i][j] + "   ");
            }
            System.out.println("");
        }
    }
}
