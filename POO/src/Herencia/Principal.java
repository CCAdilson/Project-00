package Herencia;
public class Principal {
    public static void main(String[] args) {
        
        //METODO MAIN DE LA CLASE ANIMAL Y PERRO
        
        Animal animal = new Animal("Beto", 4);
        
        animal.hacerSonido();
        animal.mostrarInformacion();
        
        //USANDO SETTERS
        System.out.println("\nDatos Actualizados.");
        animal.setNombre("Firulais");
        animal.setEdad(10);
        
        animal.mostrarInformacion();
        
        System.out.println("");
        
        Perro perro = new Perro("Lucas", 10, "Salchicha");

        perro.hacerSonido();
        perro.mostrarInformacion();
        
        //USANDO SETTERS
        System.out.println("\nDatos Actualizdos");
        perro.setRaza("Pastor Aleman");
        //USANDO GETTER
        System.out.println("Raza actualizada: "+perro.getRaza());
    }
}
