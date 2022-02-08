package ejercicio7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
           
    
    //Constructores Vacio
    public Persona(){}
    
    //Constructor por parametro
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearPersona(){
        char letraSexo;
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre:");
        this.nombre = entrada.nextLine();
        System.out.println("Ingrese la edad");
        this.edad = entrada.nextInt();
        System.out.println("Ingrese el sexo");
        System.out.println("('H' hombre, 'M' mujer, 'O' otro)");
        letraSexo = entrada.next().charAt(0);
        letraSexo = Character.toUpperCase(letraSexo);
        
        while(letraSexo != 'H' && letraSexo != 'M' && letraSexo != 'O'){
            System.out.println("Ingresó una letra incorrecta");
            System.out.println("Vuelva a ingresarla");
            System.out.println("('H' hombre, 'M' mujer, 'O' otro)");
                    letraSexo = entrada.next().charAt(0);
        letraSexo = Character.toUpperCase(letraSexo);
        }
        this.sexo = letraSexo;
        System.out.println("Ingrese el peso");
        this.peso = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        this.altura = entrada.nextDouble();
        System.out.println("Carga completa");
    }
    
    public int calcularIMC(){
        double imc = (peso/Math.pow(altura, 2));
        if(imc<20){
           return -1; 
        }else if(imc<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        return (this.edad>=18);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }




}



