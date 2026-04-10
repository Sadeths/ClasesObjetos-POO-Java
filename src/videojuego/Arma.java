package videojuego;

public class Arma {
    //1. Atributos 
    private String nombre;
    private String tipo;
    private int danio;
    private static int contadorArmas; //cuenta cunatas armas se crean

    //2. Constructor 
    public Arma(String nombre, String tipo, int danio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.danio = danio;
        contadorArmas++;
    }

    //3. Metodos 
    public void describir(){
        System.out.println("Arma: " + this.nombre + 
                            " | Tipo: " + this.tipo +
                            " | Daño: " + this.danio);
    }

    //4. GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getDanio() {
        return this.danio;
    }

    public static int getContadorArmas() {
        return contadorArmas;
    }

    //5. TOSTRING
    @Override
    public String toString(){
        return "[" + this.tipo + "]" + this.nombre + "(daño: " + this.danio + ")";
    }

    
    
}
