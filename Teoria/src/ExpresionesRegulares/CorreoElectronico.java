package ExpresionesRegulares;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CorreoElectronico {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        String correoElectronico = "";
        Pattern patronCorreoElectronico = Pattern.compile("^[\\w.%+-]{1,20}@(gmail|hotmail)\\.[a-zA-Z]{2,}$");
        System.out.println("VALIDAR CORREO ELECTRONICO");
        
        System.out.print("Correo Electronico: ");
        correoElectronico = id.nextLine();
        
        Matcher mat = patronCorreoElectronico.matcher(correoElectronico);
        
        if(mat.find()){
            System.out.println("Formato Correcto");
        }else{
            System.out.println("Formato Incorrecto");
        }
        
    }
}
