package extra2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class Puntos {
    //Atributos
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    //constructor vacio
    public Puntos(){
        
    }
    
    //Constructor parametrizado
    public Puntos(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        
    }
    
    //SETTERS y GETTERS

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    //Metodos
    public void crearPuntos(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la coordenada X del primer punto");
        x1 = entrada.nextInt();
        System.out.println("Ingrese la coordenada Y del primer punto");
        y1 = entrada.nextInt();
        System.out.println("Ingrese la coordenada X del segundo punto");
        x2 = entrada.nextInt();
        System.out.println("Ingrese la coordenada Y del segundo punto");
        y2 = entrada.nextInt();
    }
    
    public double calcularDistancia(){
        int distanciaX;
        int distanciaY;
        double distanciaTotal;
        
        distanciaX = x2 - x1;
        distanciaY = y2 - y1;
        distanciaTotal = (Math.sqrt((double)(Math.pow(distanciaX,2)+Math.pow(distanciaY,2))));
        
        return distanciaTotal;
       
    }

}
