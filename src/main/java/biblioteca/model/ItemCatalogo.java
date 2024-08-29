package biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemCatalogo {
    private String titulo;
    private Autor autor;
    private Secao secao;
    private Reserva reservaAtiva;
    private Emprestimo emprestimo;
    List<Operacoes> historico;

    public ItemCatalogo(String titulo, Autor autor, Secao secao){
        if(titulo == null || autor == null){
            throw new IllegalArgumentException("Os campos 'título' e 'autor' não podem ser nulos!");
        } else {
            this.titulo = titulo;
            this.autor = autor;
            setSecao(secao);
            historico = new ArrayList<>();
        }
    }

    public Autor getAutor(){return this.autor;}

    public String getTitulo(){
        return this.titulo;
    }

    public void setSecao(Secao secao){
        this.secao = secao;
    }

    public Secao getSecao(){return this.secao;}

    public void setReservado(Reserva reserva){
        this.reservaAtiva = reserva;
    }

    public Reserva getReserva(){
        return this.reservaAtiva;
    }

    public void setEmprestado(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }

    public Emprestimo getEmprestimo(){
        return this.emprestimo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && !(obj instanceof ItemCatalogo)) return false;
        ItemCatalogo item = (ItemCatalogo) obj; // Casting para fazer comparação.

        if (this.titulo == null || this.autor.getNome() == null) return false;
        if ( this.titulo.equalsIgnoreCase(item.getTitulo()) && this.autor.getNome().equalsIgnoreCase(item.getAutor().getNome()))
            return true;

        return false;
    }
}
