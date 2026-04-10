package estudiantes;

public class Estudiante {
    //Atributos
    private String nombre;
    private int edad;
    private String carrera;
    private double notaFinal;

    //Constructor 
    public Estudiante (String nombre, int edad, String carrera, double notaFinal){
        this.nombre = nombre;
        this.edad = edad; 
        this.carrera = carrera;
        this.notaFinal = notaFinal;
    }

    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre + 
                            " | Edad: " + this.edad + 
                            " | Carrera: " + this.carrera + 
                            " | Nota: " + this.notaFinal);

    }

    public boolean aprobo(){
        return this.notaFinal >= 61;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    //ToString

    @Override
    public String toString(){
        return "Estudiante: " + this.nombre + 
                " | Edad: " + this.edad + 
                " | Carrera: " + this.carrera +
                " | Nota: " + this.notaFinal;
    }

    
}
