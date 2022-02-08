package g6ejercicio3;

public class G6Ejercicio3 {

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        
        operacion.crearOperacion();
        System.out.print("La Suma es: ");
        System.out.println(operacion.sumar());
        System.out.print("La Resta es: ");
        System.out.println(operacion.restar());
        System.out.print("La Multiplicacion es: ");
        System.out.println(operacion.multiplicar());
        System.out.print("La Division es: ");
        System.out.println(operacion.dividir());
    }

}
