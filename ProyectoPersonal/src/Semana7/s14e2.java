package Semana7;
import java.util.Scanner;
public class s14e2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        int decimal, modulo, aux;
        String binario = "";
        
        System.out.print("Ingresar el numero decimal: ");
        decimal = id.nextInt();
        aux = decimal;
        
        while (decimal > 0) {            
            modulo = (decimal % 2);
            binario = binario + modulo;
            decimal /= 2;
        }
        
        System.out.println("El numero decimal "+aux+" en base binaria es "+binario);
        
    }
}