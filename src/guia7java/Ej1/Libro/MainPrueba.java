package Ej1.Libro;

public class MainPrueba {

    public static void main(String[] args) {
       Libro libro1 = new Libro();
       Libro libro2 = new Libro(138273,"Martin Fierro", "José Hernandez",783);
       libro2.mostrarLibro();
        System.out.println("");
       libro2.cargarLibro();
        System.out.println("");
       libro2.mostrarLibro();
       
       
    }

}
