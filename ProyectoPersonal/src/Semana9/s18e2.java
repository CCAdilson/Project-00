package Semana9;
public class s18e2 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        String nombreTienda = "TIENDA ABC", ruc = "RUC 21521458563",
                nombreCajero = "Rosa", nombreCliente = "Carlos", direccion = "Chiclayo-Peru";

        String parte1 = """ 
                        %28S%n                                         
                        %30S
                        %30s%n
                        CAJERO: %S
                        """;

        String[] numeroRuc = {"7754125852147", "7752563210489", "7796525415"};
        String[] nombreProducto = {"DETERGENTE ULTRA", "JAM. PIZZA", "LECHE EN CAJA"};
        int[] cantidad = {6, 2, 12};
        double[] precioProducto = {3.25, 12.90, 30.50};
        double sumaTotal = 0, IGV = 0.18;

        sb.append(String.format(parte1, nombreTienda, ruc, direccion, nombreCajero));

        String parte2 = """
                        %-17s%-10S
                        %19d   X      %-9.2f     %6.2f
                        """;

        for (int i = 0; i < numeroRuc.length; i++) {
            double precio = cantidad[i] * precioProducto[i];
            sumaTotal += precio;
            sb.append(String.format(parte2, numeroRuc[i], nombreProducto[i], cantidad[i],
                    precioProducto[i], precio));
        }
        sb.append("\n\n");

        String parte3 = """
                        OP. GRAVADA: %6.1f
                        I.G.V: %.6f
                        IMPORTE TOTAL: %.3f
                        """;

        sb.append(String.format(parte3, sumaTotal, sumaTotal * IGV, sumaTotal + (sumaTotal * IGV)));

        String parte4 = """
                        
                        --------------------------------------------------
                        CLIENTE: %S
                        --------------------------------------------------
                        """;
        sb.append(String.format(parte4, nombreCliente));

        System.out.println(sb);
        
    }
}
