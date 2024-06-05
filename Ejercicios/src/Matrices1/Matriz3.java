package Matrices1;
import java.util.Scanner;
public class Matriz3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        /*Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
        Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices originales y el resultado*/
        
        int numeroFilas = 0, numeroColumnas = 0;
        
        System.out.print("Ingresar numero de filas: ");
        numeroFilas = id.nextInt();
        System.out.print("Ingresar numero de columnas: ");
        numeroColumnas = id.nextInt();
        
        int [][] matriz1 = new int [numeroFilas][numeroColumnas];
        
        //INGRESAR DATOS DE LA MATRIZ 1
        System.out.println("\nMATRIZ 1");
        for(int f=0; f<matriz1.length; f++){
            for(int c=0; c<matriz1[0].length; c++){
                System.out.print("Matriz ["+f+"]["+c+"]: ");
                matriz1[f][c] = id.nextInt();
            }
        }
     
        
        int [][] matriz2 = new int [numeroFilas][numeroColumnas];
        
        //INGRESAR DATOS DE LA MATRIZ 2
        System.out.println("\nMATRIZ 2");
        for(int f=0; f<matriz2.length; f++){
            for(int c=0; c<matriz2[0].length; c++){
                System.out.print("Matriz ["+f+"]["+c+"]: ");
                matriz2[f][c] = id.nextInt();
            }
        }
        
        //MATRIZ ORIGINAL
        System.out.println("\nMATRIZ 1 SALIDA");
         for(int f=0; f<matriz1.length; f++){
            for(int c=0; c<matriz1[0].length; c++){
                System.out.printf("%3d ", matriz1[f][c]);
            }
             System.out.println("");
        }
        
         System.out.println("\nMATRIZ 2 SALIDA");
         for(int f=0; f<matriz2.length; f++){
            for(int c=0; c<matriz2[0].length; c++){
                System.out.printf("%3d ", matriz2[f][c]);
            }
             System.out.println("");
        }
         
        int [][] sumaMatriz = new int[numeroFilas][numeroColumnas];
        
        //SUMA DE FILAS 
        for(int f=0; f<numeroFilas; f++){
            for(int c=0; c<numeroColumnas; c++){
                sumaMatriz[f][c] = matriz1[f][c] + matriz2[f][c];
            }
        }
        
        //MATRIZ FINAL
        System.out.println("\nMATRIZ FINAL");
         for(int f=0; f<sumaMatriz.length; f++){
            for(int c=0; c<sumaMatriz[0].length; c++){
                System.out.printf("%3d ", sumaMatriz[f][c]);
            }
             System.out.println("");
        }
        
        
    }
}
