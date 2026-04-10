package mascotas;

public class MascotaPrueba {
    public static void main(String[] args) {
        //Crear objetos (instanciar) - aqui nacen las mascotas
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato", 7);

        //Usar metodos 
        mascota1.saludar();
        mascota2.saludar();

        //Usar metodo que devuelve valor 
        if (mascota2.esMayor()){
            System.out.println(mascota2.getNombre() + " es una mascota mayor");
        }

        //Modficar el atributo con setter
        mascota1.setEdad(4);
        System.out.println("Nueva edad de Firulais: " + mascota1.getEdad());

        //Imrpimir el objeto completo
        System.out.println(mascota1);
        System.out.println(mascota2);
    }
}
