package Semana6;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class s12e3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        String email, password; //P@55w0rd
        boolean Login = false;
        int numeroIntentos = 0;

        Pattern pat = Pattern.compile("^[a-zA-Z0-9]{1,20}\\@(gmail|hotmail)\\.[a-zA-Z]{3}$");

        System.out.println("LOGIN");
        while (!Login && numeroIntentos != 5) {

            System.out.print("Email: ");
            email = id.nextLine();
            System.out.print("Password: ");
            password = id.nextLine();

            Matcher mat = pat.matcher(email);

            if (mat.find() && password.equals("P@55w0rd")) {
                System.out.println("Bienvenido al sistema");
                Login = true;
            } else {
                System.out.println("Acceso Denegado");
            }

            numeroIntentos++;
            if (numeroIntentos == 5) {
                System.out.println("Cuenta suspendida.");
            }

        }

    }
}
