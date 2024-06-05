package Semana10;
public class s19e2 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        int [] numeros1 = {1,2,3,4,5};
        int [] numeros2 = {4,5,6,7,8,9};
        
        for(int i=0; i<numeros1.length; i++){
            for(int j=0; j<numeros2.length; j++){
                if(numeros1[i] == numeros2[j]){
                    sb.append(numeros2[j]).append(" ");
                }
            }
        }
        
        System.out.println(sb);
        
    }
}
