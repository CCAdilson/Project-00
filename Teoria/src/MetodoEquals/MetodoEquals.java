package MetodoEquals;
public class MetodoEquals {
    public static void main(String[] args) {
        
        String saludo1 = "Hola"; // oficial
        
        String saludo2 = "Hola";
        String saludo3 = "HOLA";
        String saludo4 = "HolA";
        
        System.out.println("EQUALS");
        
        System.out.println(saludo1.equals(saludo2));
        System.out.println(saludo1.equals(saludo3));
        System.out.println(saludo1.equals(saludo4));
        
        System.out.println("\n");
        
        String palabra2 = "hola";
        String palabra3 = "HOLA";
        String palabra4 = "HolA";

        System.out.println("EQUALS.IGNORECASE");
        
        System.out.println(saludo1.equalsIgnoreCase(palabra2));
        System.out.println(saludo1.equalsIgnoreCase(palabra3));
        System.out.println(saludo1.equalsIgnoreCase(palabra4));
        
    }
}
