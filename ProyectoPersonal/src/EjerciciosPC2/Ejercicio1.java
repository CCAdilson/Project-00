package EjerciciosPC2;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        int cantidadEquipos = 0;
        
        System.out.print("Ingresar la cantidad de equipos: ");
        cantidadEquipos = id.nextInt();
        
        String [] nombreEquipos = new String [cantidadEquipos];
        int [] puntosAcumulados = new int [cantidadEquipos];
        int [] golesFavor = new int [cantidadEquipos];
        int [] golesContra = new int [cantidadEquipos];
        
        for(int i=0; i<cantidadEquipos; i++){
            System.out.println((i+1)+"° EQUIPO");
            id.nextLine();
            System.out.print("Nombre del equipo: ");
            nombreEquipos[i] = id.nextLine();
            System.out.print("Puntos acumulados: ");
            puntosAcumulados[i] = id.nextInt();
            System.out.print("Goles a favor: ");
            golesFavor[i] = id.nextInt();
            System.out.print("Goles en contra: ");
            golesContra[i] = id.nextInt();
        }
        
        int diferenciaDeGoles = 0;
        
        String parte1 = "";
        parte1 += """   
                  
                         Posicion  Nombre del Equipo  Puntos  Goles a Favor  Goles en contra  Diferencia de Goles
                         """;
        
        for(int i=0; i<cantidadEquipos; i++){
            diferenciaDeGoles = golesFavor[i] - golesContra[i];
        parte1 += String.format("""
                      %7d %18S %8d %14d %15d %20d%n 
                      """, i+1, nombreEquipos[i], puntosAcumulados[i], golesFavor[i],golesContra[i], diferenciaDeGoles);
        }
        
        System.out.println(parte1);
        
        
    }
}