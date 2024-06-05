package Centinelas;
import java.util.Scanner;
public class Centinelas {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        boolean diaValido = false;
        int dia = 0;
        
        while(!diaValido){
            System.out.print("Dia de la semana[1-7]: ");
            dia = id.nextInt();
            
            diaValido = (dia > 0 && dia < 8);
        }
        
        System.out.println("Dia ingresado: " + dia);
    }
}
