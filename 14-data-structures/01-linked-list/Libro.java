public class Libro{

    private String titulo;
    
    private String autor;
    
    private String isbn;


    public Libro (String tiyulo_,String autor_,String isbn_){

        this.titulo = tiyulo_;
        this.autor = autor_;
        this.isbn = isbn_;

    }   

    public String GetAutor() {
        return this.autor;
    }

    public String SetAutor(String autor_) {
        this.autor = autor_;
    }

    public String GetTitulo() {
        return this.autor;
    }

    public String SetTitulo(String titulo_) {
        this.titulo = titulo_;
    }

    public String GetIsbn() {
        return this.autor;
    }

    public String SetIsbn(String isbn_) {
        this.isbn = isbn_;
    }


} 