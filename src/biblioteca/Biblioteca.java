package biblioteca;

public class Biblioteca {
    // Atributos
    private Libro[] libros;
    private int contadorLibros;
    private static final int MAX_LIBROS = 5;

    // Constructor
    public Biblioteca() {
        this.libros = new Libro[MAX_LIBROS];
        this.contadorLibros = 0;
    }

    // Método para agregar libro
    public void agregarLibro(Libro libro) {
        if (this.contadorLibros < Biblioteca.MAX_LIBROS) {
            this.libros[this.contadorLibros++] = libro;
        } else {
            System.out.println("Se ha superado el máximo de libros: " + Biblioteca.MAX_LIBROS);
        }
    }

    // Método para mostrar libros
    public void mostrarLibros() {
        System.out.println("=== Libros en la biblioteca ===");
        for (int i = 0; i < this.contadorLibros; i++) {
            System.out.println(this.libros[i]);
        }
    }

    // Método para calcular total
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorLibros; i++) {
            Libro libro = this.libros[i];
            total += libro.getPrecio();
        }
        return total;
    }
}