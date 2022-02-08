package ejercicio01;

/**
 *
 * @author andrew
 */
public class Libro {
    
    private double _ISBN;
    private String titulo;
    private String autor;
    private int cantPaginas;
    
    public Libro(double _ISBN, String titulo, String autor, int cantPaginas){
        this._ISBN = _ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }
    
    public Libro(){}
    
    public void setISBN(double _ISBN){
        this._ISBN = _ISBN;
}
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setCantPaginas(int cantPaginas){
        this.cantPaginas = cantPaginas;
    }
    
    public double getISBN(){
        return _ISBN;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getCantPaginas(){
        return cantPaginas;
    }
    
    public void cargarLibro(double _ISBN, String titulo, String autor, int cantPaginas){
        this.setISBN(_ISBN);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setCantPaginas(cantPaginas);
    }
        
    public void mostrarLibro(){
        System.out.printf("\n\n**** LIBRO ***\n\n");
        System.out.printf("Titulo: %s\nAutor: %s\nISBN: %.0f\nPaginas: %d",titulo,autor,_ISBN,cantPaginas);
    }
        
    
}
