package Encapsulamiento;
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
        System.out.println(nombre+" ha cumplido años. Ahora tiene "+edad+" años.");
    }
    
    public void saludar(){
        System.out.println("Hola, mi nombres es "+nombre+".");
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
    }
    
    
    public static void main(String [] args){
        
        //CREANDO OBJETO DE LA CLASE PERSONA
        Persona persona1 = new Persona("Esthefany", 19, "Femenino");
        Persona persona2 = new Persona("Roberto", 30, "Masculino");
        
        persona1.saludar();
        persona1.mostrarInformacion();
        persona1.cumplirAños();
        
        System.out.println("");
        
        persona2.saludar();
        persona2.mostrarInformacion();
        persona2.cumplirAños();
        
        System.out.println("");
        
        //MODIFICAR ATRIBUTOS USANDO SETTERS
        persona1.setEdad(25);
        persona1.setNombre("Ana de Armas");
        
        //OBTENER ATRIBUTOS USANDO GETTERS
        System.out.println("Persona1");
        System.out.println("Nombre modificado: "+persona1.getNombre());
        System.out.println("Edad modificada: "+persona1.getEdad());
        
    }
}
