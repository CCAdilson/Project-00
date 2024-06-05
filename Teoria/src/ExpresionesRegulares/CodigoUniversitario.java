package ExpresionesRegulares;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CodigoUniversitario {
    public static void main(String[] args) {
        
        Scanner id = new Scanner(System.in);
        
        boolean formatoCorrecto = false;
        String codigoUniversitario = "";

        Pattern patron = Pattern.compile("[Uu]\\d{8}"); //U22313069-u22313069

        while (!formatoCorrecto) {

            System.out.print("Ingresar codigo universitario: ");
            codigoUniversitario = id.nextLine();

            Matcher evaluando = patron.matcher(codigoUniversitario);

            if (!formatoCorrecto == evaluando.matches()) {
                System.out.println("Formato Correcto.");
                formatoCorrecto = true;
            } else {
                System.out.println("Formato Incorrecto. Intentelo de nuevo.");
            }

        }

        System.out.println("\nCodigo Universitario: " + codigoUniversitario);
        
    }
}
