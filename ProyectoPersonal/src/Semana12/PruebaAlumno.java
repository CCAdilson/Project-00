package Semana12;
public class PruebaAlumno {
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Mi foto", "Eduardo", 19, 10, 20, 12, 15);
        
        alumno1.setNombre("Juan");
        alumno1.setPc1(20);
        alumno1.setPc2(19);
        alumno1.setPc3(15);
        alumno1.setEf(17);
        
        System.out.println("Datos del alumno1");
        System.out.println("Foto: "+alumno1.getFoto());
        System.out.println("Nombre: "+alumno1.getNombre());
        System.out.println("Edad: "+alumno1.getEdad());
        System.out.println("Pc1: "+alumno1.getPc1());
        System.out.println("Pc2: "+alumno1.getPc2());
        System.out.println("Pc3: "+alumno1.getPc3());
        System.out.println("Ef: "+alumno1.getEf());
        
        System.out.println("\n");
        
        String reporte = String.format("""
                                       Foto   Nombre   Edad   Pc1   Pc2   Pc3   Ef   Prom
                                       %4S %6S %6d %6d %5d %5d %5d %7.2f 
                                       """, alumno1.getFoto(), alumno1.getNombre(), alumno1.getEdad(),
                                       alumno1.getPc1(), alumno1.getPc2(), alumno1.getPc3(), alumno1.getEf(),
                                       (double)(alumno1.getPc1()+alumno1.getPc2()+alumno1.getPc3()+alumno1.getEf()) / 4);
        System.out.println(reporte);
    }
}
