/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método 
para cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor del libro y el número de páginas.
*/
package Ej1.Libro;

import java.util.Scanner;


public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;
    public Scanner leer = new Scanner(System.in);
    
    public Libro(){
        
    }
    
    public Libro(int isbnA,String tituloA,String autorA, int numPagA){
        this.ISBN = isbnA;
        this.titulo = tituloA;
        this.autor = autorA;
        this.numPag = numPagA;
    }
    
    public void cargarLibro(){
        System.out.println("Ingrese ISBN: ");
        this.ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese titulo: ");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese autor: ");
        this.autor = leer.nextLine();
        System.out.println("Ingrese cantidad de paginas: ");
        this.numPag = leer.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("El ISBN del libro es: " + this.ISBN);
        System.out.println("El titulo del libro es: " + this.titulo);
        System.out.println("El autor del libro es: " + this.autor);
        System.out.println("La cantidad de paginas del libro es: " + this.numPag);
    }
    
}
