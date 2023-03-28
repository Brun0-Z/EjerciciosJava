package guia5java;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
public class Ej4 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        System.out.println("Matriz traspuesta: ");
        mostrarTraspuesta(matriz);
    }

    public static void rellenarMatriz(int mat[][]) { //¿Retorna o no retorna?
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length;j++){
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    public static void mostrarMatriz(int mat[][]){
        for(int x[] : mat){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarTraspuesta(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length;j++){
                System.out.print(mat[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
