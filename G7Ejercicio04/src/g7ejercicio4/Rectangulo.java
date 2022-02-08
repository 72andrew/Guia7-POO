package g7ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class Rectangulo {

    //Atributos
    private int base;
    private int altura;

    //Constructor Vacio
    public Rectangulo() {
    }

    //Contructor por parametros
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Setters
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Getters
    public int getBase() {
        return (base);
    }

    public int getAltura() {
        return (altura);
    }

    //Metodo crear rectantulo por parametro
    public void crearRectangulo() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base");
        this.base = entrada.nextInt();
        System.out.println("Ingrese la altura");
        this.altura = entrada.nextInt();

    }

    //metodo calcular Superficie
    public void calcularSuperficie() {
        System.out.println("La Superficie es " + this.base * this.altura);
    }

    //metodo calcular perimetro
    public void calcularPerimetro() {
        System.out.println("El perimetro es " + ((2 * this.base) + (2 * this.altura)));
    }

    public void mostrarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }

}
