package Semana8;
import java.util.Scanner;
public class s16e2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int numerosGenerar;
        
        System.out.print("Ingresar cuantos numeros a generar: ");
        numerosGenerar = id.nextInt();
        
        String salida = "";
        int a = 1;
        int b = 1;
        int c;
        int suma = 0;
        
        salida += String.format("%d %d ", a, b);
        suma = a + b;
        //1 1 2 3 5 8 13 
        for(int i=2; i<numerosGenerar; i++){
            c = a + b;
            suma += c;
            salida += String.format("%d ", c);
            a = b;
            b = c;
        }
        
        System.out.println("\nSerie Fibonacci: "+salida);
        System.out.println("Suma: "+suma);
    }
}
