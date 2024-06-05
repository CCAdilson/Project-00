package Semana8;
import java.util.Scanner;
public class s15e1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        int numeroGen, razon, opcion, numeroInicial;
        String resultado;
        String menu = """
                    Opciones
                    1.-Progresion aritmetica
                    2.-Progresion geometrica
                    """;
        boolean condicion = false;
        String salida = "";
        
        while(!condicion){
            System.out.print("Ingresar numeros a generar: ");
            numeroGen = id.nextInt();
            System.out.print("Ingresar la razon: ");
            razon = id.nextInt();
            System.out.print("Ingresar numero inicial: ");
            numeroInicial = id.nextInt();
            System.out.println(menu);
            System.out.print("Seleccionar opcion: ");
            opcion = id.nextInt();
            
            switch(opcion){
                case 1->{
                    for(int i=0; i<numeroGen; i++){
                        salida += String.format("%d ",numeroInicial);
                        numeroInicial += razon;
                    }
                    System.out.println("\nProgrecion Aritmetica\nSerie : "+salida);
                }
                case 2->{
                    for(int i=0; i<numeroGen; i++){
                        salida += String.format("%d ", numeroInicial);
                        numeroInicial *= razon;
                    }
                    System.out.println("\nProgrecion Geometrica\nSerie : "+salida);
                }
                
                default -> {
                    System.out.println("Error");
                }
            }
            
            condicion = (opcion == 1 || opcion == 2);
            
        }
            
       
        
    }
}
