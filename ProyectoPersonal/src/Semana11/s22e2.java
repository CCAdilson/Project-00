package Semana11;

import java.util.Arrays;

public class s22e2 {
    public static void main(String[] args) {
        
        System.out.println("FALTA REVISAR DETALLADAMENTE");
        
        int [][] matriz = {{5,4,7},{1,3,8},{2,9,6}};
        
        for(int [] i:matriz){
            System.out.println(Arrays.toString(i));
        }
        
        System.out.println("");
        
        
        for(int i=0; i<matriz.length; i++){
            Arrays.sort(matriz[i]);
        }
        
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz.length; c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println("");
        }
    }
}
