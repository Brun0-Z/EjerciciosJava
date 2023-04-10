package guia7java.Ej1;

import java.util.Scanner;

/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
los datos al usuario y luego informar mediante otro método el número de ISBN, 
el título, el autor del libro y el número de páginas.
*/
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;
    public Libro(int ISBN, String titulo, String autor, int numPag){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    public Libro(){};
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN:");
        this.ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese titulo:");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese autor:");
        this.autor = leer.nextLine();
        System.out.println("Ingrese numero de pags:");
        this.numPag = leer.nextInt();
    }
    
    public void verDatosLibro(){
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Num de pags: " + this.numPag);
    }
}
