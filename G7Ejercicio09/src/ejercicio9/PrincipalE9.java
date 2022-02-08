package ejercicio9;

public class PrincipalE9 {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        matematica.setNumero1((double) (Math.random()) * 10);
        matematica.setNumero2((double) (Math.random()) * 10);

        System.out.println(matematica.getNumero1());
        System.out.println(matematica.getNumero2());
        
        double papita = matematica.calcularPotencia();
        System.out.println("papita = " + papita);
    }

}
