package videojuego;

public class Personaje {

    //1. Atributos 
    private String nombre;
    private String clase;
    private int vida;
    private Arma arma; // <- un personaje usa un arma (composicion)
    private static int contadorPersonajes;

    //2. Constructor 
    public Personaje(String nombre, String clase, int vida){
        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
        this.arma = null; //nace sin arma
        contadorPersonajes++;
    }

    //3. Metodos
    
    //Equipar un arma
    public void equiparArma (Arma arma){
        this.arma = arma;
        System.out.println(this.nombre + " equipo: " + arma.getNombre());
    }

    //Atacar a otro personaje 
    public void atacar (Personaje enemigo){
        if (this.arma == null){
            System.out.println(this.nombre + " no tiene arma equipada!");
            return;
        }
        int danio = this.arma.getDanio();
        enemigo.recibirDanio(danio);
        System.out.println(this.nombre + " atacó a " + enemigo.getNombre() + 
                            " con " + this.arma.getNombre() +
                            " causando " + danio + " de daño!");
    }

    //Recibir daño 
    public void recibirDanio(int danio){
        this.vida -= danio;
        if (this.vida <= 0){
            this.vida = 0;
            System.out.println(this.nombre + " ha sido derrotado! 💀");
        }
    }

    public boolean estarVivo(){
        return this.vida > 0;
    }

    //4. Getters
    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }

    public int getVida() {
        return vida;
    }

    public Arma getArma() {
        return arma;
    }

    public static int getContadorPersonajes() {
        return contadorPersonajes;
    }

    //5. ToString
    @Override
    public String toString(){
        var armaEquipada = (this.arma != null) ? this.arma.getNombre() : " Sin arma";
        return "Personaje: " + this.nombre +
               " | Clase: "  + this.clase  +
               " | Vida: "   + this.vida   +
               " | Arma: "   + armaEquipada;
    }

    

    

}
