package MetodoContains;
public class MetodoContains {
    public static void main(String[] args) {
        
        String mensaje1 = "Hola Mundo";
        
        System.out.println(mensaje1.contains("Hola"));  // true
        System.out.println(mensaje1.contains("Mundo")); // true
        System.out.println(mensaje1.contains("hola"));  // false, porque es sensible a mayúsculas y minúsculas
        System.out.println(mensaje1.contains("Java"));  // false, no está presente en la cadena
        
        System.out.println("\n");
        
        String str = "La programación en Java es poderosa y versátil";
        String[] palabras = {"Java", "poderosa", "Python", "versátil"};

        for (String palabra : palabras) {
            if (str.contains(palabra)) {
                System.out.println("La cadena contiene: " + palabra);
            } else {
                System.out.println("La cadena no contiene: " + palabra);
            }
        }
        
        System.out.println("\n");
        
        String frase = "Hola Mundo";
        String saludar = "hola";

        // Convertir ambas cadenas a minúsculas antes de comparar
        boolean contiene = frase.toLowerCase().contains(saludar.toLowerCase());

        System.out.println(contiene);  // true
        
    }
}
