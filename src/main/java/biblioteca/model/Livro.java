package biblioteca.model;

import java.time.LocalDate;

public class Livro extends ItemCatalogo{
    private String isbn;
    private int numeroPaginas;
    private String editora;

    public Livro(String isbn, int numeroPaginas, String editora, String titulo, String autor, Secao secao){
        super(titulo,autor,secao);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getEditora(){
        return editora;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }
}
