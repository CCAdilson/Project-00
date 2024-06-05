package EjerciciosPC2;
public class Ejercicio2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        String [] equipos = {"Los Condores", "Aguilas Rojas", "Tigres del Norte", "Lobos Marinos"};
        int [] puntos = {32, 30, 28, 27};
        int [] golesFavor = {40, 38, 35, 33};
        int [] golesContra = {20, 25, 30, 29};
        int [] diferenciaGoles = {20, 13, 5, 4};
        
        sb.append("Nombre del Equipo | Puntos | Goles a Favor | Goles en contra | Diferencia de Goles").append("\n");
        for(int i=0; i<equipos.length; i++){
        sb.append(String.format("%-18S| %5d  | %13d | %15d | %12d%n", equipos[i], puntos[i], golesFavor[i],golesContra[i], diferenciaGoles[i]));
        }
        
        System.out.println(sb);
    }
}