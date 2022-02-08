package extra03;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalExtra03 {

    public static void main(String[] args) {
        Raices raices;

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el valor de X²");
        int a = entrada.nextInt();
        System.out.println("Ingrese el valor de X");
        int b = entrada.nextInt();
        System.out.println("Ingrese el valor independiente");
        int c = entrada.nextInt();

        raices = new Raices(a, b, c);
        System.out.printf("\nLa función es:\n%dx² + %dx + %d\n", raices.getA(), raices.getB(), raices.getC());
        raices.calcular();
    }

}
