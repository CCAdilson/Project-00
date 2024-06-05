package Semana8;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class s16e3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        Pattern patronCeleste = Pattern.compile("celeste", Pattern.CASE_INSENSITIVE);
        Pattern patronMorado = Pattern.compile("morado", Pattern.CASE_INSENSITIVE);
        Pattern patronTurqueza = Pattern.compile("turqueza", Pattern.CASE_INSENSITIVE);
        
        String colores = "";
        String menu = """
                      Celeste
                      Morado
                      Turqueza
                      """;
        int celeste = 0, morado = 0, turqueza = 0;
        String colorElegido = "";
        
        boolean condicion = (patronCeleste.matcher(colores).matches() || patronMorado.matcher(colores).matches() || patronTurqueza.matcher(colores).matches());
        
        System.out.println(menu);
        for(int i=0;i<10; i++){
            boolean votoValido = false;
            
            while (!votoValido) {
                System.out.print("Color: ");
                colores = id.nextLine();

                if (patronCeleste.matcher(colores).matches()) {
                    celeste++;
                    votoValido = true;
                } else if (patronMorado.matcher(colores).matches()) {
                    morado++;
                    votoValido = true;
                } else if(patronTurqueza.matcher(colores).matches()){
                    turqueza++;
                    votoValido = true;
                }else{
                    System.out.println("Color no valido.");
                }
            }
        }   
        
        if(celeste > morado && celeste > turqueza){
            colorElegido = "Celeste";
        }else if(morado > celeste && morado > turqueza){
            colorElegido = "Morado";
        }else if(turqueza > celeste && turqueza > morado){
            colorElegido = "Turqueza";
        }else{
            colorElegido = "Empate";
        }
        
        int totalVotos = celeste + morado + turqueza;
        double porcentajeCeleste = (celeste * 100) / 10;
        double porcentajeMorado = (morado * 100) / 10;
        double porcentajeTurqueza = (turqueza * 100) / 10;
        
        
        String resultado = String.format("""
                                         \nResultados de la votacion: 
                                         Celeste: %d votos.  (%.2f%%) 
                                         Morado: %d votos.   (%.2f%%) 
                                         Turqueza: %d votos. (%.2f%%) 
                                         Color Elegido: %S
                                         """, celeste, porcentajeCeleste, morado, porcentajeMorado, turqueza, porcentajeTurqueza, colorElegido);
        
        System.out.println(resultado);
    }
}
