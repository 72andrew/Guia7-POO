package g6ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class Operacion {
    
    //Atributos
    private int numero1;
    private int numero2;
    
    //Constructor por parametros
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        
    }
    
    //Constructor Vacio
    public Operacion(){}

    //setters
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
    
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    //getters
    public int getNumero1(){
        return(this.numero1);
    }
    
    public int getNumero2(){
        return(this.numero2);
    }
    
    //metodo que pida al user dos numeros.
    public void crearOperacion(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese N°1");
        this.numero1 = entrada.nextInt();
        System.out.println("Ingrese N°2");
        this.numero2 = entrada.nextInt();
    }
    
    public int sumar(){
        return(numero1+numero2);
    }
    
    public int restar(){
        return(numero1-numero2);
    }
    
    public int multiplicar(){
        if(numero1 == 0 || numero2 == 0){
            System.out.println("No se puede multiplicar por 0");
            return(0);
        }else{
        
        return(numero1*numero2);
        }
    }
    
    
    public double dividir(){
                if(numero1 == 0 || numero2 == 0){
            System.out.println("No se puede dividir por 0");
            return(0);
        }else{
        
        return((double)numero1/(double)numero2);
        }
    }
}
