package ejercicio10;

import java.util.Arrays;

public class PrincipalE10 {

    public static void main(String[] args) {
        double[] array1 = new double[50];
        double[] array2 = new double[20];
        
        for (int i = 0; i < 50; i++) {
            array1[i] = (double)Math.round(Math.random()*1000)/10;
            
        }
        
//        for(double i : array1){
//
//            System.out.printf("%.1f ",i);
//        }
        System.out.println("");
        System.out.println(Arrays.toString(array1));
        
        array2 = Arrays.copyOfRange(array1, 0, 20);     
        
        Arrays.fill(array2, 10, 20, 1.5);
        
        System.out.println(Arrays.toString(array2));
    }
    
        
}
