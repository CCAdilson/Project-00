package ExpresionesRegulares;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatronMayusculasMinusculas {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        String tipoEmpleado = "";
        Pattern patronContratado = Pattern.compile("contratado", Pattern.CASE_INSENSITIVE);
        Pattern patronNombrado = Pattern.compile("nombrado", Pattern.CASE_INSENSITIVE);
        
        boolean validarTipoEmpleado;
        
        do{
            
            System.out.print("Tipo de empleado[contratado-nombrado]: ");
            tipoEmpleado = id.nextLine();
            
            validarTipoEmpleado = (patronContratado.matcher(tipoEmpleado).matches() || patronNombrado.matcher(tipoEmpleado).matches());
            
        }while(!validarTipoEmpleado);
        
        System.out.printf("\nTipo de empleado: %s%n", tipoEmpleado.toLowerCase());
        
    }
}
