package ejercicio8;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int mostrarVocales() {
        int contadorVocales = 0;

        for (int i = 0; i < this.longitud; i++) {
            char ch = this.frase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contadorVocales++;
            }
        }

        return contadorVocales;
    }

    public String invertirFrase() {
//        StringBuilder strb = new StringBuilder(this.frase);
//        return strb.reverse().toString();
          

            String fraseInvertida = "";
          for (int i = longitud; i > 0; i--){
            fraseInvertida = fraseInvertida.concat(frase.substring(i-1, i));
        }
          return fraseInvertida;
    }

    public int vecesRepetido(String letra) {
        int contadorLetra = 0;

        for (int i = 0; i < this.longitud; i++) {
            Character ch = this.frase.charAt(i);

            if (letra.equals(ch.toString())) {
                contadorLetra++;

            }
        }
        return contadorLetra;
    }
    
    public void compararLongitud(String otraFrase){
        int otraLongitud = otraFrase.length();
        
        if(otraLongitud<longitud){
            System.out.println("La frase ingresada es mas corta");
            
        }else if(otraLongitud>longitud){
            System.out.println("La frase ingresada es mas larga");
        }else{
            System.out.println("Las frases tienen el mismo largo");
        }
            
        
        
    }
    
    
    public void unirFrases(String otraFrase){
        System.out.println(frase + " " + otraFrase);
    }

    public void reemplazar(String letra){
        String fraseReemplazada;
        
        fraseReemplazada = frase.replaceAll("a", letra);
        System.out.println(fraseReemplazada);
    }
    
    public boolean contiene(String letra){
        for(char letraFrase:frase.toCharArray()){
            if(letra.equals(Character.toString(letraFrase))){
                System.out.println("Encontramos letra");
                return true;
                
            }
        }
        System.out.println("no la encontramos");
        return false;
    }
    
}
