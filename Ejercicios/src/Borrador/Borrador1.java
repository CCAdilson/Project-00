package Borrador;
public class Borrador1 {
    
    public int sumar(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }
    
    public String esPar(int n){
        if(n % 2 == 0){
            return "Es par";
        }else{
            return "Es impar";
        }
    }
    
    public void mostrarInformacion(){
        
    }
    public static void main(String[]args){
        
        Borrador1 ob = new Borrador1();
        
        System.out.println(ob.sumar(10, 20));
        System.out.println(ob.esPar(21));
        
    }
    
}
