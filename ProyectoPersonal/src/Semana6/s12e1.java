package Semana6;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class s12e1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        String respuesta;
        int numero;

        Pattern pattern = Pattern.compile("^(?i) (si|no)$");

        do {

            System.out.print("Ingresar numero: ");
            numero = id.nextInt();

            if (numero >= 1 && numero <= 100) {
                System.out.print("¿Desea continuar? (Si o No): ");
                respuesta = id.nextLine();

                Matcher matcher = pattern.matcher(respuesta);

                if (matcher.matches()) {
                    if (respuesta.equalsIgnoreCase("no")) {
                        System.out.println("Programa terminado.");
                        break;
                    }
                } else {
                    System.out.println("Respuesta Invalida.");
                }
            } else {
                System.out.println("Numero fuera de rango. Ingrese un numero entre  1 y 100.");
            }
        } while (true);

    }
}
