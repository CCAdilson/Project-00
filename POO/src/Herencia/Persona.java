package Herencia;
public class Persona {
    
    //ATRIBUTOS PRIVADOS
    private String nombre;
    private int edad;
    private String genero;
    
    //CONSTRUCTOR
    public Persona(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    //GETTERS Y SETTERS
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
        }
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    //METODOS
    public void cumplirAños(){
        this.edad += 1;
        System.out.println(nombre+" ha cumpido años. Ahora tiene "+edad+" años.");
    }
    
    public void saludar(){
        System.out.println("Hola, mi nombre es "+nombre);
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
    }
    
    
}
