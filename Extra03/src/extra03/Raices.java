package extra03;

/**
 *
 * @author andrew
 */
public class Raices {
    
    //Atributos
    private int a; //coeficiente de X al cuadrado
    private int b; //coeficiente de X
    private int c; //variable independiente

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double getDiscriminante(){
        double discriminante;
        discriminante = (double)(Math.pow(b,2)-(4*a*c));
        return discriminante;
    }
   
    public boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    
    public void obtenerRaices(){
        double raiz1;
        double raiz2;
        
        if(tieneRaices()){
            raiz1 = ((-b+getDiscriminante())/(2*a));
            raiz2 = ((-b-getDiscriminante())/(2*a));
            System.out.printf("La primer raiz es %.2f y la segunda es %.2f\n", raiz1, raiz2);
            
        }else{
            System.out.println("No tiene raices");
        }
    }
    
        public void obtenerRaiz(){
        double raiz;
        
        if(tieneRaiz()){
            raiz = (-b/(2*a));

            System.out.printf("La raiz es %.2f\n", raiz);
            
        }else{
            System.out.println("No tiene raiz");
        }
    }
        
        
        public void calcular(){
            if(tieneRaices()){
                obtenerRaices();
            }else if(tieneRaiz()){
                obtenerRaiz();
            }else{
                System.out.println("No existe solucion");
            }
        }
}
