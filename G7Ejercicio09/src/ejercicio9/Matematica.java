package ejercicio9;

/**
 *
 * @author andrew
 */
public class Matematica {
    
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double devolverMayor(){
        return Math.max(numero1, numero2);
    }
    
    public double calcularPotencia(){
        double mayor = Math.round(devolverMayor());
        double menor = Math.round(Math.min(numero1, numero2));
        
        return Math.pow(mayor,menor);
        
    }
    
    public double calcularRaiz(){
        double raiz = Math.min(numero1, numero2);
        raiz = Math.abs(raiz);
        
        return Math.sqrt(raiz);
    }
    
}
