package Semana8;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class s16e1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        String menu = """
                      ##############################
                      # Opciones                   #
                      # 1. Datos del empleado      #
                      # 2. Salario del empleado    #
                      # 3. Reporte ASCII           #
                      # 4. Salir                   #
                      ##############################
                      """;
        String [] mes = {"ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC"};

        Pattern patronNombre = Pattern.compile("^[a-zA-Z\\s]+$");
        Pattern contratadoPatron = Pattern.compile("contratado", Pattern.CASE_INSENSITIVE);
        Pattern nombradoPatron = Pattern.compile("nombrado", Pattern.CASE_INSENSITIVE);
        
        int opcion = 0, salario = 0, numeroBoletasEmitidas = 0, numeroMesActual = 0;
        String nombreEmpleado = "", tipoEmpleado = "";
        boolean validandoDatosDelEmpleado = false, validandoSalarioDelEmpleado = false;

        do {

            System.out.println(menu);
            System.out.print("Seleccionar opcion: ");
            opcion = id.nextInt();

            switch (opcion) {
                case 1 -> {
                    id.nextLine();
                    do{
                    System.out.print("Ingresar nombre del empleado: ");
                    nombreEmpleado = id.nextLine();
                    }while(!patronNombre.matcher(nombreEmpleado).matches());
                    do {
                        System.out.print("Ingresar tipo de empleado[contratado-nombrado]: ");
                        tipoEmpleado = id.nextLine();
                    } while (!contratadoPatron.matcher(tipoEmpleado).matches() && !nombradoPatron.matcher(tipoEmpleado).matches());
                    validandoDatosDelEmpleado = true;

                }
                case 2 -> {
                    System.out.print("Ingresar salario: ");
                    salario = id.nextInt();
                    System.out.print("Ingresar numero de boletas emitidas: ");
                    numeroBoletasEmitidas = id.nextInt();
                    System.out.print("Ingresar numero del mes en curso: ");
                    numeroMesActual = id.nextInt();
                    validandoSalarioDelEmpleado = true;

                }
                case 3 -> {
                    if (validandoDatosDelEmpleado && validandoSalarioDelEmpleado) {

                        String reporte1 = String.format("""
                        \n##################################################
                        # RESUMEN DE BOLETAS DE PAGO                     #
                        ##################################################
                        # Empleado: %-37S#                                                
                        # Tipo: [%S] contratado  [%S] nombrado              #
                        ##################################################
                        # DATOS DE SALARIO                      BOLETA   #
                           """, nombreEmpleado,
                                tipoEmpleado.toLowerCase().equals("contratado") ? "X" : "",
                                tipoEmpleado.toLowerCase().equals("nombrado") ? "X" : "");

                        System.out.print(reporte1);

                        for (int i = 0; i < numeroMesActual; i++) {
                            String detalle = String.format("# Mes %-4S: $/. %d %23s     #", mes[i], salario,
                                    i < numeroBoletasEmitidas ? "Si" : "No");

                            System.out.println(detalle);
                        }

                        String reporte2 = String.format("""
                                                        ##################################################
                                                        # Boletas emitidas: %2d      Boletas restantes: %d#
                                                        # Monto total pagado: $/. %-21d  #
                                                        ##################################################
                                                        """, numeroBoletasEmitidas, numeroMesActual - numeroBoletasEmitidas, salario * numeroBoletasEmitidas);
                        System.out.println(reporte2);

                    } else {
                        System.out.println("Datos Incompletos");
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del programa");
                }
                default -> {
                    System.out.println("Opcion Incorrecta");
                }
            }
        } while (opcion != 4);

    }
}