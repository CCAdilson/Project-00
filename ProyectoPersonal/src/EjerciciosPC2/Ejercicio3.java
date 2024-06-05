package EjerciciosPC2;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        String menu = """
                      1. Saludar
                      2. Despedirse
                      3. Conversar
                      4. Salir
                      """;
        int opcion;
        
        do{
            System.out.print("Ingresar opcion: ");
            opcion = id.nextInt();
            
            switch(opcion){
            case 1->{
                System.out.println("Hola");
            }
            case 2->{
                System.out.println("Adios");
            }
            case 3->{
                System.out.println("Conversemos");
            }
            case 4->{
                System.out.println("Adios");
            }
        }
            
        }while(opcion !=4);
        
    }
}
