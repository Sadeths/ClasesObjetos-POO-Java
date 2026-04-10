package mascotas;

public class Mascota {
    // 1. ATRIBUTOS (Caracteristicas de cada mascota)
    private String nombre; //cada mascota tiene su nombre
    private String especie; //perro,gato,etc
    private int edad; //edad en años

    // 2.CONSTRUCTOR (como se crea una mascota)
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre; // this.nombre = el atributo de la clase
        this.especie = especie; // nombre = el valor que llega afuera 
        this.edad = edad;
    }

    // 3. METODOS (Que puede hacer una mascota)
    public void saludar (){
        System.out.println("Hola, soy: " + this.nombre + "y soy un@ " + this.especie);
    }
    public boolean esMayor(){
        return this.edad > 5; //devuelve true si tiene mas de 5 años 
    }
    //4. GETTERS Y SETTERS 
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //5. TOSTRING
    @Override
    public String toString(){
        return "Mascota: " + this.nombre + "| Especie: " + this.especie + "| Edad: " + this.edad + " años";
    }

    
    
}
