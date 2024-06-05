package ContadoresYAcumuladores;

public class ContadoresYAcumuladores {
    public static void main(String[] args) {
        
        /*Escribir un programa que muestre los numeros pares menores a 20.
        Contar cuantos numeros se mostraron y calcular la suma de todos ellos.*/
        
        int i=0;
        int contador = 0; 
        int acumulador = 0;
        
        System.out.println("Numeros pares menores a 20");
        while(i<20){
            if(i % 2 == 0){
                contador += 1;
                acumulador += i;
                System.out.print(i+ ", ");
            }
            i++;
        }
        
        System.out.println("\nContador: "+contador);
        System.out.println("Acumulador: "+acumulador);
    }
}
