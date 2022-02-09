package extra04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class NIF {
    //Atributos
    private long dni;
    private char letra;

    public NIF() {
    }

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public void crearNIF(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el DNI");
        dni = entrada.nextLong();
        letra = AsignarNIF(dni);
    }
    
    public void mostrar(){
        System.out.printf("NIF: %d-%c\n",dni,letra);
    }
    
    private char AsignarNIF(long dni){
        char[] nif = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        int i = (int)dni%23;
        
        return nif[i];
       
    }
    
}
