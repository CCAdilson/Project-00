package Semana11;
import java.util.Arrays;
public class s22e1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String[] nombres = {"Juan Carlos Garcia Rodrig", "Ana Mariela Torres Montez",
            "Rosa Inonan Farro", "Carlos Alberto Rojas Chan", "Gabriela Lucia Alvites Ch"};
        int[] edad = {19, 25, 22, 24, 25};
        int[] grado = {5, 5, 4, 5, 5};

        int[] pc1 = {20, 20, 20, 16, 20};
        int[] pc2 = {19, 17, 18, 18, 20};
        int[] pc3 = {15, 18, 12, 15, 14};
        int[] ef = {17, 16, 13, 12, 15};
        int[][] matriz = {pc1, pc2, pc3, ef};

        double[] promedios = new double[nombres.length];
        double promedioTotal = 0.0;

        for (int i = 0; i < nombres.length; i++) {
            double suma = pc1[i] + pc2[i] + pc3[i] + ef[i];
            promedios[i] = suma / 4.0;
            promedioTotal += promedios[i];
        }

        promedioTotal /= nombres.length;

        String[][] reporte = new String[nombres.length][8];
        for (int i = 0; i < nombres.length; i++) {
            reporte[i][0] = nombres[i];
            reporte[i][1] = String.valueOf(edad[i]);
            reporte[i][2] = String.valueOf(grado[i]);
            reporte[i][3] = String.valueOf(pc1[i]);
            reporte[i][4] = String.valueOf(pc2[i]);
            reporte[i][5] = String.valueOf(pc3[i]);
            reporte[i][6] = String.valueOf(ef[i]);
            reporte[i][7] = String.format("%.2f", promedios[i]);
        }

        Arrays.sort(reporte, (a, b) -> a[0].compareTo(b[0]));
        //Arrays.sort(reporte);
        
        sb.append("##############################  REPORTE DE NOTAS  ##############################\n");
        sb.append("NOMBRE                                EDAD  GRADO   PC1   PC2   PC3   EF   PROM\n");
        sb.append("################################################################################\n");

        for (String[] fila : reporte) {
            sb.append(String.format("%-39s%-7s%-7s%-6s%-6s%-5s%-5s%s%n",
                    fila[0], fila[1], fila[2], fila[3], fila[4], fila[5], fila[6], fila[7]));
        }

        sb.append("################################################################################\n");
        sb.append(String.format("PROMEDIO TOTAL: %63.2f%n", promedioTotal));
        sb.append("################################################################################\n");

        System.out.print(sb.toString());

    }
}
