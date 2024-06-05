package Semana12;
public class Cancion {
    
    //CLASE CANCION
    private String nombre;
    private String cantante;
    private String genero;
    private double duracion;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCantante(){
        return cantante;
    }
    
    public void setCantante(String cantante){
        this.cantante = cantante;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public double getDuracion(){
        return duracion;
    }
    
    public void setDuracion(double duracion){
        this.duracion = duracion;
    }
    
    
    //MAIN
    public static void main(String[]args){
        
        //OBJETO MI CANCION DE LA CLASE CANCION
        Cancion miCancion = new Cancion();
        
        //ESTABLECIENDO VALORES UTIILZANDO LOS SETTERS
        miCancion.setNombre("Eduardo");
        miCancion.setCantante("Drake");
        miCancion.setGenero("Masculino");
        miCancion.setDuracion(3.30);
        
        //MOSTRANDO VALORES UTILIZANDO LOS GETTERS
        System.out.println("Nombre: "+miCancion.getNombre());
        System.out.println("Cantante: "+miCancion.getCantante());
        System.out.println("Genero: "+miCancion.getGenero());
        System.out.println("Duracion: "+miCancion.getDuracion());
        
    }
    
}
