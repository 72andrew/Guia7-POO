package g6ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class Circunferencia {

    private double radio;
    
    //Constructor que inicialice el radio pasado por parametro
    
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    //Constructor Vacio
    public Circunferencia(){}

    //Getter
    
    public double getRadio() {
        return radio;
    }

    //Setter
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Metodo que pide el radio y guarda en atributo
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        setRadio(entrada.nextDouble());
        
    }
    
    //Metodo Area.
    
    public double area(){
        return(Math.PI * Math.pow(this.radio,2));
    }

    
}
