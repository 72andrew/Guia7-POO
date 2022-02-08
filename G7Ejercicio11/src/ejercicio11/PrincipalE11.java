package ejercicio11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalE11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Date dia1 = new Date(); //fecha actual
        Date dia2;

        System.out.println("Ingrese el dia");
        int dia = entrada.nextInt();
        System.out.println("Ingrese el mes");
        int mes = entrada.nextInt() - 1;
        System.out.println("Ingrese el Año");
        int anio = entrada.nextInt() - 1900;
        dia2 = new Date(anio, mes, dia);

        System.out.println(dia1.toString());
        System.out.println(dia2.toString());
        
        long miliDia1 = dia1.getTime();
        long miliDia2 = dia2.getTime();
        
        long diferenciaDias = (miliDia1 - miliDia2)/1000/60/60/24;
        System.out.println(diferenciaDias);
        int difAnio = (int)diferenciaDias/365;
        int difMeses = (int)(diferenciaDias%365)/30;
        int difDias = (int)((diferenciaDias%365)%30);
        
        System.out.println("hay de dif " + difAnio + " Años, " + difMeses + " Meses y " + difDias + " Dias");
    }

}
