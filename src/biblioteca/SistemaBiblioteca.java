package biblioteca;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        // Crear libros
        var libro1 = new Libro("Clean Code", "Robert Martin", 150);
        var libro2 = new Libro("Java POO", "Juan Perez", 100);

        // Crear biblioteca
        var biblioteca = new Biblioteca();

        // Agregar libros
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar libros
        biblioteca.mostrarLibros();

        // Mostrar total
        System.out.println("Total: " + biblioteca.calcularTotal());
    }
}