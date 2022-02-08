package extra1;

/**
 *
 * @author andrew
 */
public class Cancion {
    
    //ATRIBUTOS
    private String titulo;
    private String autor;
    
    
    //CONSTRUCTORES
    public Cancion(){}
    
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //SETTERS
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    
}
