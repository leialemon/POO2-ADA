package biblioteca.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public abstract class ItemCatalogo {
    private String titulo;
    private String autor;
    private Secao secao;
    private Reserva reservaAtiva;
    private Emprestimo emprestimo;
    List<Operacoes> historico;

    public ItemCatalogo(String titulo, String autor, Secao secao){
        this.titulo = titulo;
        this.autor = autor;
        setSecao(secao);
        historico = new ArrayList<>();
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
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

        assert item != null;
        if ( this.titulo.equalsIgnoreCase(item.getTitulo()) )
            return true;

        return false;
    }
}
