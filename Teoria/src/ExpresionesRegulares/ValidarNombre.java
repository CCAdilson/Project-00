package ExpresionesRegulares;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ValidarNombre {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        String nombre = "";
        boolean validarNombre;
        Pattern patronNombre = Pattern.compile("^[a-zA-Z\\s]+$");
        
        do{
            
            System.out.print("Nombre: ");
            nombre = id.nextLine();
            
            validarNombre = patronNombre.matcher(nombre).matches();
            
        }while(!validarNombre);
        
        System.out.println("\nFormato Correcto.");
        System.out.println("Nombre: "+nombre);
        
    }
}
