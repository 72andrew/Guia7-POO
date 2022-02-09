package ahorcado;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class Ahorcado {

    private char[] palabra;
    private boolean[] descubiertos;
    private int intentosMaximos;
    private int letrasEncontradas;
    final private char[] abecedario;
    private boolean[] abecedarioBoolean;

    public Ahorcado() {
        this.abecedario = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    }

    public Ahorcado(char[] palabra, int intentosMaximos, int letrasEncontradas) {
        this.abecedario = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        this.palabra = palabra;
        this.intentosMaximos = intentosMaximos;
        this.letrasEncontradas = letrasEncontradas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getIntentosMaximos() {
        return intentosMaximos;
    }

    public void setIntentosMaximos(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void crearJuego() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la palabra a buscar");
        String palabraString = entrada.next().toUpperCase();
        palabra = new char[palabraString.length()];
        descubiertos = new boolean[palabraString.length()];
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = palabraString.charAt(i);
            descubiertos[i] = false;
        }
        abecedarioBoolean = new boolean[abecedario.length];
        for (int i = 0; i < abecedario.length; i++) {
            abecedarioBoolean[i] = false;
        }
        //System.out.println("Ingrese la Cantidad Maxima de intentos");
        intentosMaximos = 6; //entrada.NextInt();
        letrasEncontradas = 0;
    }

    public int longitud() {
        return palabra.length;
    }

    public void buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < longitud(); i++) {
            if (palabra[i] == letra) {
                System.out.println("Letra encontrada en posicion " + (i + 1));
                descubiertos[i] = true;
                encontrada = true;

            }
        }
        if (!encontrada) {
            System.out.println("No se encontró la letra");
        }
    }

    public boolean encontradas(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < longitud(); i++) {
            if (palabra[i] == letra) {
                letrasEncontradas++;
                encontrada = true;

            }
        }
        return encontrada;
    }

    public void intentos() {
        System.out.printf("Te quedan %d intentos\n", intentosMaximos);
    }

    public void mostrarLetras() {
        System.out.printf(" ");
        for (int i = 0; i < longitud(); i++) {
            if (descubiertos[i]) {
                System.out.printf("%c", palabra[i]);
            } else {
                System.out.printf("_", palabra[i]);
            }
            System.out.printf(" ");
        }
        System.out.println("");
    }

    public void mostrarDibujo(int i) {
        switch (i) {
            case 6:
                System.out.println("      +---+");
                System.out.println("      |   |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("    =========");
                break;
            case 5:
                System.out.println("      +---+");
                System.out.println("      |   |");
                System.out.println("      O   |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("    =========");
                break;
            case 4:
                System.out.println("      +---+");
                System.out.println("      |   |");
                System.out.println("      O   |");
                System.out.println("      |   |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("    =========");
                break;
            case 3:
                System.out.println("      +---+");
                System.out.println("      |   |");
                System.out.println("      O   |");
                System.out.println("     /|   |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("    =========");
                break;
            case 2:
                System.out.println("      +---+");
                System.out.println("      |   |");
                System.out.println("      O   |");
                System.out.println("     /|\\  |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("    =========");
                break;
            case 1:
                System.out.println("      +---+");
                System.out.println("      |   |");
                System.out.println("      O   |");
                System.out.println("     /|\\  |");
                System.out.println("     /    |");
                System.out.println("          |");
                System.out.println("    =========");

                break;
            case 0:
                System.out.println("      +---+");
                System.out.println("      |   |");
                System.out.println("      O   |");
                System.out.println("     /|\\  |");
                System.out.println("     /\\   |");
                System.out.println("          |");
                System.out.println("    =========");
                break;
        }
    }
    
    public void mostrarAbecedario(){
        for(char i:abecedario){
            System.out.printf("%c ",i);
        }
        System.out.println("");
        for(boolean i:abecedarioBoolean){
            if(i){
                System.out.printf("X ");
            }else{
                System.out.printf("  ");
            }
        }
        System.out.println("");
    }

    public void juego() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        char letraIngresada;
        int indiceLetra = 0;
        crearJuego();
        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.printf("la palabra tiene %d caracteres\n", longitud());
        while (intentosMaximos > 0) {

            intentos(); //muestra la cantidad de intentos restantes
            System.out.println("Ingrese una letra");
            letraIngresada = entrada.next().toUpperCase().charAt(0);
            for (int i = 0; i < abecedario.length; i++) {
                if (letraIngresada == abecedario[i]) {
                    indiceLetra = i;
                    
                }

            }
            while (abecedarioBoolean[indiceLetra]) {
                System.out.printf("LETRA REPETIDA: Vuelva a ingresarla\n");
                letraIngresada = entrada.next().toUpperCase().charAt(0);
                for (int i = 0; i < abecedario.length; i++) {
                    if (letraIngresada == abecedario[i]) {
                        indiceLetra = i;

                    }

                }
            }
            abecedarioBoolean[indiceLetra]=true;
            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            //mostrar ABECEDARIO ACA 
            System.out.println("Letras Usadas\n");
            mostrarAbecedario();
            System.out.println("");
            buscar(letraIngresada); //avisa que se encontro la letra y la posicion
            if (!encontradas(letraIngresada)) {
                intentosMaximos--;
            }
            System.out.println("");
            mostrarDibujo(intentosMaximos);
            System.out.println("");
            mostrarLetras();
            System.out.println("");
            
            if (letrasEncontradas == longitud()) {
                break;
            }

        }
        if (intentosMaximos == 0) {
            System.out.println("\nPERDISTE :(");
            System.out.printf("LA PALABRA ERA ");
            for (char i:palabra) {
                System.out.printf("%c",i);     
            }
            System.out.println("");
        } else {
            System.out.println("\nGANASTE!!");
        }
    }
}
