package biblioteca;

public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private double precio;

    // Constructor
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getPrecio() {
        return this.precio;
    }

    // toString
    @Override
    public String toString() {
        return "Libro: " + this.titulo +
               " | Autor: " + this.autor +
               " | Precio: " + this.precio;
    }
}