package EjercicioUnoExamen;

public class Concecionario {
    public int IdConcec;
    public String NombreConsec;
    public String marca;
    public int modelo;
    public int stockAutos;



    public void mostrar() {
        System.out.println(" \nNumero de sucursal " + IdConcec);
        System.out.println(" \nNombre de concesionario " + NombreConsec);
        System.out.println("\nMarca " + marca);
        System.out.println("\nModelo " + modelo);
        System.out.println("\nStock " + stockAutos);
    }


}