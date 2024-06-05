package Semana9;

import java.util.Arrays;

public class s17e1{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
         int cantidadNumeros = 10;
        int [] numerosAleatorios = new int[cantidadNumeros];
        int suma = 0;
        
        /* USANDO WHILE
        sb.append("Numeros: ");
        int i=0;
        while(i<cantidadNumeros){
            numerosAleatorios[i] = (int)(Math.random() * 10) + 1;
            suma += numerosAleatorios[i];
            sb.append(numerosAleatorios[i]);
            if(i < cantidadNumeros-1){
                sb.append(", ");
            }
            i++;
        }
        
        sb.append("\nSuma: "+suma);
        System.out.println(sb);
        */
        
        /* USANDO DO-WHILE
        sb.append("Numeros: ");
        int i=0;
        do{
            numerosAleatorios[i] = (int)(Math.random() * 10) + 1;
            suma += numerosAleatorios[i];
            sb.append(numerosAleatorios[i]);
            if(i < cantidadNumeros-1){
                sb.append(", ");
            }
            i++;
        }while(i<cantidadNumeros);
        
        sb.append("\nSuma: "+suma);
        System.out.println(sb);
        */
        
        
        sb.append("Numeros: ");
        for(int i=0; i<cantidadNumeros; i++){
            numerosAleatorios[i] = (int)(Math.random() * 10) + 1;
            suma += numerosAleatorios[i];
            sb.append(numerosAleatorios[i]);
            if(i < cantidadNumeros-1){
                sb.append(", ");
            }
        }
        
        sb.append("\nSuma: ").append(suma);
        System.out.println(sb);
        
        
    }
}
