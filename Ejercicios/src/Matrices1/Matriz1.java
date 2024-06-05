package Matrices1;
import java.util.Scanner;
import java.util.Arrays;
public class Matriz1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        /*Crear una matriz de 3x3 con los numeros del 1 al 9.
        Mostrar por pantalla, tal como aparece en la matriz*/
        
        int [][] matriz = new int[3][3];
        
        System.out.println("RELLENANDO MATRIZ 3X3");
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz.length; c++){
                System.out.print("Matriz ["+f+"]["+c+"]: ");
                matriz[f][c] = id.nextInt();
            }
        }
        
        System.out.println("\nMATRIZ 3X3");
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz.length; c++){
                System.out.print(matriz[f][c]+"  ");
            }
            System.out.println("");
        }
        
    }
}
