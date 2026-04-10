package videojuego;

public class PruebaVideojuego {
    public static void main(String[] args) {
        System.out.println("=== 🎮 INICIO DEL JUEGO ===\n");

        //Crear armas
        var espada = new Arma("Espada Legendaria", "Espada", 45);
        var arco = new Arma("Arco Elifico", "Artco", 30);
        var baston = new Arma("Baston de Fuego", "Magia", 60);

        //Crear personajes
        var guerrero = new Personaje("Arthas", "Guerrero", 100);
        var arquero = new Personaje("Legolas", "Arquero", 80);
        var mago = new Personaje("Gandalf", "Mago", 60);

        //Equipar armas
        guerrero.equiparArma(espada);
        arquero.equiparArma(arco);
        mago.equiparArma(baston);

        System.out.println();

        //Ver estado de cada personaje 
        System.out.println(guerrero);
        System.out.println(arquero);
        System.out.println(mago);

        System.out.println("\n=== ⚔️ COMBATE ===\n");

        //Combate 
        guerrero.atacar(arquero);
        mago.atacar(guerrero);
        arquero.atacar(mago);

        System.out.println("\n=== 📊 ESTADO FINAL ===\n");

        System.out.println(guerrero);
        System.out.println(arquero);
        System.out.println(mago);

        //Usar el contador estatico
        System.out.println("\nPersonajes creados: " + Personaje.getContadorPersonajes());
        System.out.println("Armas creadas: "       + Arma.getContadorArmas());
    }
}
