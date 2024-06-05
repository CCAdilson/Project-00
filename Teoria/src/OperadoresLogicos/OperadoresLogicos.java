package OperadoresLogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        //And(&&)
        int numeroAsistencias = 17;
        float promedio = 18.5f;
        boolean estaAprobado = (numeroAsistencias >= 10) && (promedio >= 12);
        System.out.println("Esta aprobado? "+estaAprobado);
        
        //Or(||)
        float peso = 45.8f;
        int edad = 67;
        boolean enRiesgoCovid = (peso > 80) || (edad > 60);
        System.out.println("En riesgo? "+enRiesgoCovid);
        
        //Not(!)
        int numeroIntentos = 2;
        boolean bloqueado = numeroIntentos > 4;
        boolean desbloqueado = !bloqueado;
        System.out.println("Desbloqueado? "+desbloqueado);
        
    }
}
