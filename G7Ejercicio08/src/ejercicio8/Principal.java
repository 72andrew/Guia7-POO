package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        String frase;

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una Cadena");
        frase = entrada.nextLine();

        cadena.setFrase(frase);
        cadena.setLongitud(frase.length());

        System.out.println("Elija una opcion");
        System.out.println("1 - Mostrar cantidad de vocales");
        System.out.println("2 - Invertir Frase");
        System.out.println("3 - Mostrar cuantas veces se repite un caracter");
        System.out.println("4 - Comparar el largo con otra frase");
        System.out.println("5 - Concatenar con una frase");
        System.out.println("6 - reemplazar una letra");
        System.out.println("7 - Buscar si contiene una letra");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(cadena.mostrarVocales());
                break;

            case 2:
                System.out.println(cadena.invertirFrase());
                break;
            case 3:
                System.out.println("Ingrese un caracter");
                String caracter = entrada.nextLine();
                System.out.println(cadena.vecesRepetido(caracter));

            case 4:
                System.out.println("Ingresa una frase");
                cadena.compararLongitud(entrada.nextLine());
                break;
            case 5:
                cadena.unirFrases("Hola2");
                break;
            case 6:
                cadena.reemplazar("tongo");
                break;
            case 7:
                boolean contiene = cadena.contiene("a");
                break;
            default:
                System.out.println("Ingresaste una opcion no valida");
        }
     
    }

}
