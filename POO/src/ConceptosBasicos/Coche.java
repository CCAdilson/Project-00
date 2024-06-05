package ConceptosBasicos;
public class Coche {
    
    //ATRIBUTOS
    String marca;
    String modelo;
    String color;
    
    //CONSTRUCTOR
    public Coche(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    //METODOS
    public void acelerar(){
        System.out.println("El coche esta acelerando.");
    }
    
    public void frenar(){
        System.out.println("El coche esta frenando.");
    }
    
    //METODO PARA MOSTRAR INFORMACION DEL COCHE
    public void mostrarInformacion(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
    }
    
    //METODO MAIN PARA EJECUTAR EL CODIGO
    public static void main(String [] args){
        
        //CREAMOS UN OBJETO DE LA CLASE COCHE
        Coche miCoche = new Coche("Toyota", "Corolla", "Rojo");
        
        //USAMOS LOS METODOS DEL OBJETO
        miCoche.mostrarInformacion();
        miCoche.acelerar();
        miCoche.frenar();
        
    }
    
}
