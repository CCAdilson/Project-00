package Semana6;
import java.util.Scanner;
public class s12e2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        
        double calificacion;
        double suma = 0;
        int estudiantes = 0;
        int estudiantesAprobados = 0;
        int estudiantesDesaprobados = 0;
        boolean continuar = true;
        
        while(continuar){
            
            System.out.print("Ingresar calificacion: ");
            calificacion = id.nextDouble();
            
            if(calificacion != -1){
                estudiantes++;
                suma+=calificacion;
                if(calificacion >= 12){
                    estudiantesAprobados++;
                }else{
                    estudiantesDesaprobados++;
                }
            }else{
                continuar = false;
            }        
            
        }
        
        if (estudiantes == 0) {
            System.out.println("No se ingresaron calificaciones.");
        } else {
            double promedioGlobal = suma / estudiantes;
            System.out.printf("\nPromedio Global: %.2f%n", promedioGlobal);
            System.out.printf("Estuadiantes aprobados: %d%n", estudiantesAprobados);
            System.out.printf("Estuadiantes desaprobados: %d%n", estudiantesDesaprobados);
        }
        
    }
}