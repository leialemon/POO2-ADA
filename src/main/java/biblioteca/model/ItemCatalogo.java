package biblioteca.model;

import biblioteca.model.operacoes.Emprestimo;
import biblioteca.model.operacoes.Operacao;
import biblioteca.model.operacoes.Reserva;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


// Implementar Comparable
public abstract class ItemCatalogo implements Serializable, Comparable<ItemCatalogo> {
    private String titulo;
    private Autor autor;
    private Secao secao;
    private Reserva reservaAtiva;
    private Emprestimo emprestimo;
    List<Operacao> historico;

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

    @Override
    public int compareTo(ItemCatalogo itemCatalogo) {
        int comparador = this.secao.compareTo(itemCatalogo.getSecao());
        if (comparador == 0){
            comparador = this.titulo.compareTo(itemCatalogo.getTitulo());
            if (comparador == 0){
                comparador = this.autor.compareTo(itemCatalogo.getAutor());
            }
        }
        return comparador;
    }
}
