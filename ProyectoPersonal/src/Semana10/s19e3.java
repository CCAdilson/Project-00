package Semana10;
import java.util.Scanner;
public class s19e3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        String [] nombre = new String[5];
        int [] edad = new int[5];
        
        for(int i=0; i<nombre.length; i++){
            System.out.println("Persona "+(i+1)+"°");
            System.out.print("Nombre: ");
            nombre[i] = id.nextLine();
            System.out.print("Edad: ");
            edad[i] = id.nextInt();
            id.nextLine();
        }
        
        System.out.println("");
        
        for(int i=0; i<nombre.length; i++){
            System.out.printf("%-15s %2d [%s]%n", nombre[i], edad[i], edad[i] > 18 ? "Mayor de edad" : "Menor de edad");
        }
    }
}
