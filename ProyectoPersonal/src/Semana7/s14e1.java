package Semana7;
import java.util.Scanner;
public class s14e1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        int opcion;
        String nombre = "", apellido = "";
        double sueldoMensual = 0;
        boolean validandoDatos = false, sueldoInvalido = true;;
        
        String menu = """
                      \n##############################
                      #      MENU DE OPCIONES      #
                      ##############################
                      # 1. Ingresar Empleado       #
                      # 2. Ingresar Salario Mensual#
                      # 3. Emitir Boleta           #
                      # 4. Salir                   #
                      ##############################\n
                      """;
         String boleta = """
                        \n##################################################
                        # RESUMEN DE BOLETAS DE PAGO                     #
                        ##################################################
                        # Nombre del Empleado: %s                        #       
                        # Apellidos del Empleado: %s                     #
                        # Tipo : Contratado                              #
                        # Salario Ene: %5.1f      Salario Feb: %5.1f     #
                        # Salario Mar: %5.1f      Salario Abr: %5.1f     #
                        # Salario May: %5.1f      Salario Jun: %5.1f     #
                        # Salario Jul: %5.1f      Salario Ago: %5.1f     #
                        # Salario Set: %5.1f      Salario Oct: %5.1f     #
                        # Salario Nov: %5.1f      Salario Dic: %5.1f     #
                        ##################################################\n
                        """;
        
        do{
            
            System.out.println(menu);
            System.out.print("Seleccionar opcion: ");
            opcion = id.nextInt();
            id.nextLine();            
            switch(opcion){
            case 1 -> {
                
                System.out.print("Nombre: ");
                nombre = id.nextLine();
                System.out.print("Apellido: ");
                apellido = id.nextLine();
                validandoDatos = true;
                
            }
            case 2 -> {
                
                while(sueldoInvalido){
                    System.out.print("Sueldo Mensual: ");
                    sueldoMensual = id.nextDouble();
                    if(sueldoMensual > 0){
                        sueldoInvalido = false;
                        break;
                    }else{
                        System.out.println("Monto Invalido. Vuelva a Intentarlo...");
                    }
                } 
            }
            case 3 ->{
                if(validandoDatos == true && sueldoInvalido == false){
                    System.out.printf(boleta, nombre, apellido, sueldoMensual, sueldoMensual, sueldoMensual, sueldoMensual,
                            sueldoMensual, sueldoMensual , sueldoMensual, sueldoMensual, sueldoMensual, sueldoMensual,
                            sueldoMensual, sueldoMensual);
                }else{
                    System.out.println("Datos Incompletos...");
                }
            }
            
            default -> {
                System.out.println("Opcion Incorrecta.");
            }
        }
            
        }while(opcion != 4);
        
        System.out.println("\nSALIENDO DEL PROGRAMA");
    }
}
