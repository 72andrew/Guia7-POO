package extra2;

public class PrincipalExtra2 {

    public static void main(String[] args) {
        Puntos puntos;
        puntos = new Puntos();
        puntos.crearPuntos();
        System.out.printf("%.2f\n",puntos.calcularDistancia());

}
}