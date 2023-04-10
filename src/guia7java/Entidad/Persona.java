package Entidad;


public class Persona {
    private String nombre;
    private int edad;
    private String colorDePelo;
    private int DNI;
    private double altura;
    /*
    ======CONSTRUCTORES=====
    */
    public Persona(String nom){
        this.nombre = nom;
    }
    
    public Persona(){
        
    }
    /*
    =======GET & SET=======
    */
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public String getNombre(){
        return this.nombre;
    }
            
    /*
    =======OTRAS=======
    */
    public void Saludar(Persona a){
        setNombre("alonso");
        System.out.println("Hola " + a.nombre + ", me llamo " + this.nombre);
    }
}
