package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Libro libro = new Libro();

        mostrarMenu();
        int opcion = leer.nextInt();

        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese Nombre del libro:");
                    String nombre = leer.next();

                    System.out.println("Ingrese Autor del Libro");
                    String autor = leer.next();

                    System.out.println("Ingrese ISBN");
                    double isbn = leer.nextDouble();

                    System.out.println("Ingrese Cantidad de Hojas");
                    int cantHojas = leer.nextInt();
                    libro.cargarLibro(isbn, nombre, autor, cantHojas);
                    break;
                case 2:
                    libro.mostrarLibro();
                    break;
            }
            
                System.out.println("\n");
                mostrarMenu();
                opcion = leer.nextInt();
            
            
        }
        System.out.println("Programa Finalizado");
    }

    public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("\n1-Ingresar nuevo Libro");
        System.out.println("2-Mostrar Libro");
        System.out.println("3-Salir");
    }

}
