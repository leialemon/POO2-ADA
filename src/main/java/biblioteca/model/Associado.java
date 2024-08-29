package biblioteca.model;


import java.time.LocalDateTime;
import java.util.List;

public class Associado extends Pessoa{
    final private LocalDateTime dataDeCadastro;
    private List<Operacoes> historico;
    private Emprestimo emprestimoAtivo;
    private Reserva reservaAtiva;

    public Associado(String nome){
        super(nome);
        this.dataDeCadastro = LocalDateTime.now();
    }

    public LocalDateTime getDataDeCadastro(){
        return this.dataDeCadastro;
    }

    public List<Operacoes> getHistorico(){
        return this.historico;
    }

    public Emprestimo getEmprestimoAtivo(){
        return this.emprestimoAtivo;
    }

    public void setEmprestimoAtivo(Emprestimo emprestimo){
        this.emprestimoAtivo = emprestimo;
        addOperacao(emprestimo);
    }

    public Reserva getReservaAtiva(){
        return this.reservaAtiva;
    }

    public void setReservaAtiva(Reserva reserva){
        this.reservaAtiva = reserva;
        addOperacao(reserva);
    }

    public void addOperacao(Operacoes operacao){
        this.historico.add(operacao);
    }
}
