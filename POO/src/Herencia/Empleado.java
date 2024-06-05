package Herencia;
//LA CLAE EMPLEADO
//HEREDA LOS ATRIBUTOS Y METODOS DE LA CLASE PERSONA
public class Empleado extends Persona{
    
    //ATRIBUTOS ADICIONALES 
    private double salario;
    private String puesto;
    
    //CONSTRUCTOR
    public Empleado(String nombre, int edad, String genero, double salario, String puesto){
        super(nombre, edad, genero);
        this.salario = salario;
        this.puesto = puesto;
    }
    
    //GETTERS Y SETTERS ADICIONALES
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        }
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    
    
    //METODOS ADICIONALES
    public void trabajar(){
        System.out.println(getNombre()+" esta trabajando como "+puesto);
    }
    
    //SOBREESCRIBE EL METODO MOSTRAR INFORMACION DE LA CLASE PERSONA
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion(); //LLAMA AL METODO MOSTRAR INFORMACION DE LA CLASE BASE
        System.out.println("Salario: "+salario);
        System.out.println("Puesto: "+puesto);
    }
    
    //MAIN
    public static void main(String[]args){
        //CREAMOS UN OBJETO DE LA CLASE EMPLEADO LLAMADO EMPLEADO1
        Empleado empleado1 = new Empleado("Ana", 30, "Femenino", 3000.0, "Ingeniera de Softaware");
        
        //USAMOS LOS METODOS DEL OBJETO
        empleado1.saludar();
        empleado1.mostrarInformacion();
        empleado1.trabajar();
        empleado1.cumplirAños();
        
        //MODIFICANDO ATRIBUTOS USANDO SETTERS
        empleado1.setSalario(3500.0);
        empleado1.setPuesto("Gerente de Proyectos");
        
        //OBTIENDO ATRIBUTOS USANDO GETTERS
        System.out.println("Salario modificado: "+empleado1.getSalario());
        System.out.println("Puesto modificado: "+empleado1.getPuesto());
        
    }
    
}
