package ConceptosBasicos;
public class Persona {
        
        //ATRIBUTOS
        String nombre;
        int edad;
        String genero;
        
        public Persona(String nombre, int edad, String genero){
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
        }
        
        public void cumplirAños(){
            this.edad += 1;
            System.out.println(nombre+" ha cumplido años. Ahora tiene "+edad+" años.");
        }
        
        public void saludar(){
            System.out.println("Hola mi nombre es "+nombre+". ");
        }
        
        public void mostrarInformacion(){
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Genero: "+genero);
        }
        
        
        public static void main(String [] args){
            
            //CREAMOS EL OBJETO DE LA CLASE PERSONA
            Persona persona1 = new Persona("Ana", 30, "Femenino");
            Persona persona2 = new Persona("Carlos", 25, "Masculino");
            
            //USAR LOS METODOS DE LOS OBJETOS
            persona1.saludar();
            persona1.mostrarInformacion();
            persona1.cumplirAños();
            
            System.out.println("");
            
            persona2.saludar();
            persona2.mostrarInformacion();
            persona2.cumplirAños();
        }
}
