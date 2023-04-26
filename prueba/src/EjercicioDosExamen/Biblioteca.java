package EjercicioDosExamen;

public class Biblioteca {
    public String titulo;
    public String genero;
    public String autor;
    public int ano;
    public int idLibro;

    public void mostrarAutor() {
        System.out.println(" \nidLibro " + idLibro);
        System.out.println(" \nTitulo " + titulo);
        System.out.println("\nAutor " + autor);
        System.out.println("\nAño " + ano);
    }

    public void mostrarLibirGenero() {
        System.out.println("\nGenero " + genero);
        System.out.println("\nTitulo " + titulo);
        System.out.println("\nAutor " + autor);
        System.out.println("\nAño " + ano);

    }

}