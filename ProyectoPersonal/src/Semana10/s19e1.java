package Semana10;
import java.util.Arrays;
public class s19e1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        int [] datos = {16, 25, 34, 11, 78, 6, 31, 55};
        
        Arrays.sort(datos);
        
        for(int i:datos){
            sb.append(i).append(" ");
        }
        
        System.out.println(sb);
        
    }
}
