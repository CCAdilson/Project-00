package Semana11;
import java.util.Scanner;
public class s21e1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] sumaFilas = new int[3];
        double[] promedioFilas = new double[3];

        //Rellenando la matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Matriz[" + f + "][" + c + "]: ");
                matriz[f][c] = id.nextInt();
            }
        }
        
        //suma y promedio de filas
        for(int f=0; f<3; f++){
            sumaFilas[f] = 0;
            for(int c=0 ; c<3; c++){
                sumaFilas[f] += matriz[f][c];
            }
            promedioFilas[f] = (double)sumaFilas[f] / 3;
        }
        
        System.out.println("");
        
        //Salida con formato de la matriz
        System.out.printf("%19s%12s%n", "suma", "promedio");
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("%3d ", matriz[f][c]);
            }
            System.out.printf("%7d %10.2f", sumaFilas[f], promedioFilas[f]);
            System.out.println("");
        }

        id.close();
    }
}
