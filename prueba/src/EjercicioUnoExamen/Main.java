package EjercicioUnoExamen;

import EjercicioUnoExamen.Concecionario;

class Main {
    public static void main(String[] args) {
        Concecionario con = new Concecionario();
        con.IdConcec = 4556987;
        con.NombreConsec = "Maynar";
        con.marca = "Ford";
        con.modelo = 1985;
        con.stockAutos = 55;
        con.mostrar();

        Concecionario con1 = new Concecionario();
        con1.IdConcec = 445895;
        con1.NombreConsec = "Debora sa";
        con1.marca = "Citroen";
        con1.modelo = 1999;
        con1.stockAutos = 20;
        con1.mostrar();

        Concecionario con2 = new Concecionario();
        con2.IdConcec = 445895;
        con2.NombreConsec = "WONKA SA";
        con2.marca = "Citroen";
        con2.modelo = 2013;
        con2.stockAutos = 45;
        con2.mostrar();

        Concecionario con3 = new Concecionario();
        con3.IdConcec = 445895;
        con3.NombreConsec = "PEPITO SA";
        con3.marca = "RENAULT";
        con3.modelo = 2000;
        con3.stockAutos = 30;
        con3.mostrar();

        Concecionario con4 = new Concecionario();
        con4.IdConcec = 445895;
        con4.NombreConsec = "PEPITA SA";
        con4.marca = "FORD";
        con4.modelo = 2001;
        con4.stockAutos = 15;
        con4.mostrar();

        Concecionario con5 = new Concecionario();
        con5.IdConcec = 445895;
        con5.NombreConsec = "PEPITO SA";
        con5.marca = "RENAULT";
        con5.modelo = 2015;
        con5.stockAutos = 30;
        con5.mostrar();

    }
}