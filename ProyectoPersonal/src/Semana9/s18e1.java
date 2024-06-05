package Semana9;
public class s18e1 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        String [] nombres = {"Juan Carlos Garcia Rodrig", "Ana Mariela Torres Montez", 
        "Rosa Inonan Farro", "Carlos Alberto Rojas Chan", "Gabriela Lucia Alvites Ch"};
        int [] edad = {19, 25, 22, 24, 25};
        int [] grado = {5, 5, 4, 5, 5};
        int [] pc1 = {20, 20, 20, 16, 20};
        int [] pc2 = {19, 17, 18, 18 , 20};
        int [] pc3 = {15, 18, 12, 15, 14};
        int [] ef = {17, 16, 13, 12, 15};
        double [] promedios = new double[nombres.length];
        double promedioFinal = 0;
        //double promedio = (pc1 + pc2 + pc3 + ef) / 4;
        
        
        String formatoSalida1 = """
                               ##############################  REPORTE DE NOTAS  ##############################
                               NOMBRE                                EDAD  GRADO   PC1   PC2   PC3   EF   PROM                
                               ################################################################################
                               """;
        
        String formatoSalida2 = """
                                %-39S%-7d%-7d%-6d%-6d%-5d%-5d%-5.2f
                                """;
        
        String formatoSalida3 = """
                                ################################################################################
                                PROMEDIO TOTAL: %63.2f
                                ################################################################################
                                """;
        sb.append(formatoSalida1);
        
        for(int i=0; i< nombres.length; i++){
            promedios[i]  = (pc1[i] + pc2[i] + pc3[i] + ef[i]) / 4.0;
            promedioFinal += promedios[i];
            sb.append(String.format(formatoSalida2, nombres[i], edad[i], grado[i], pc1[i], pc2[i], pc3[i], ef[i], promedios[i]));
        }
        
        sb.append(String.format(formatoSalida3, promedioFinal / nombres.length));
        
        System.out.println(sb);
        
    }
}
