package Matrices1;
import java.util.Scanner;
import java.util.Scanner;
public class Matriz4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        //MATRIZ 4X4
        int [][] matriz = new int[4][4]; 
        
        String menu = """
                      MENU
                      1. Rellenar matriz
                      2. Sumar fila
                      3. Sumar columna
                      4. Sumar diagonal principal
                      5. Sumar diagonal inversa
                      6. Media de todos los valores
                      7. Salir
                      """;
        int opcion = 0;
        
        do{

            while(opcion != 1){
                
                System.out.println(menu);
                System.out.print("Seleccionar opcion: ");
                opcion = id.nextInt();
                
                if(opcion !=1){
                    System.out.println("\nAlerta. Rellenar matriz.\n");
                }
                
            }
            
            switch(opcion){
                
                case 1->{
                    //RELLENAR MATRIZ
                    for(int f=0; f<matriz.length; f++){
                        for(int c=0; c<matriz[0].length; c++){
                            System.out.print("Matriz["+f+"]["+c+"]: ");
                            matriz[f][c] = id.nextInt();
                        }
                    }
                    
                }
                case 2->{
                    
                }
                
                
            }
            
            
            
            
        }while(opcion != 7);
        
    }
}
