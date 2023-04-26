package EjercicioDosExamen;

public class Main {
    public static void main(final String[] args) {

        Biblioteca bi = new Biblioteca();
        bi.idLibro = 98798;
        bi.titulo = "La divina Comedia";
        bi.genero = "comedia";
        bi.autor = "Dante Alighieri";
        bi.ano = 1909;
        bi.mostrarAutor();
        bi.mostrarLibirGenero();

        Biblioteca bi1 = new Biblioteca();
        bi1.idLibro = 123456;
        bi1.titulo = "lOS ARBOLES MUEREN DE PIE";
        bi1.genero = "Drama";
        bi1.autor = "Alejandro Casona";
        bi1.ano = 1949;
        bi1.mostrarAutor();
        bi1.mostrarLibirGenero();

        Biblioteca bi2 = new Biblioteca();
        bi2.idLibro = 789456;
        bi2.titulo = "la barca sin pescador";
        bi2.genero = "Drama";
        bi2.autor = "Alejandro Casona";
        bi2.ano = 1945;
        bi2.mostrarAutor();
        bi2.mostrarLibirGenero();

        Biblioteca bi3 = new Biblioteca();
        bi3.idLibro = 456987;
        bi3.titulo = "Juan salvador Gaviota";
        bi3.genero = "Drama";
        bi3.autor = "Richard Bach";
        bi3.ano = 1970;
        bi3.mostrarAutor();
        bi3.mostrarLibirGenero();

        Biblioteca bi4 = new Biblioteca();
        bi4.idLibro = 4512366;
        bi4.titulo = "Abzurdah";
        bi4.genero = "Drama";
        bi4.autor = "Cielo Latini";
        bi4.ano = 2006;
        bi4.mostrarAutor();
        bi4.mostrarLibirGenero();

        Biblioteca bi5 = new Biblioteca();
        bi5.idLibro = 4512366;
        bi5.titulo = "NUNCA MAS";
        bi5.genero = "Didáctico";
        bi5.autor = "Comisión Nacional sobre la Desaparición de Personas";
        bi5.ano = 1984;
        bi5.mostrarAutor();
        bi5.mostrarLibirGenero();
    }
}