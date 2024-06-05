package Matrices1;
import java.util.Scanner;
public class Matriz2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        /*Crear una matriz de 5 filas y n columnas (se pide al usuario).
        Rellenarlo con numeros aleatorios entre 0 y 10.*/
        
        int numeroColumnas = 0;
        
        System.out.print("Ingresar numero de columnas: ");
        numeroColumnas = id.nextInt();
        
        int [][] matriz = new int[5][numeroColumnas];
        
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz[0].length; c++){
                matriz[f][c] = (int)(Math.random() * 11);
            }
        }
        
        for(int f=0; f<5; f++){
            for(int c=0; c<numeroColumnas; c++){
                System.out.printf("%3d ", matriz[f][c]);
            }
            System.out.println("");
        }
        
    }
}
