package biblioteca.model;


import biblioteca.model.operacoes.Emprestimo;
import biblioteca.model.operacoes.Operacao;
import biblioteca.model.operacoes.Reserva;

import java.time.LocalDateTime;
import java.util.List;

public class Associado extends Pessoa{
    final private LocalDateTime dataDeCadastro;
    private List<Operacao> historico;
    private Emprestimo emprestimoAtivo;
    private Reserva reservaAtiva;
    // Data de nascimento?
    // Contato? (email/telefone)

    public Associado(String nome){
        super(nome);
        this.dataDeCadastro = LocalDateTime.now();
    }

    public LocalDateTime getDataDeCadastro(){
        return this.dataDeCadastro;
    }

    public List<Operacao> getHistorico(){
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

    // chamar quando uma operação for feita (multa,pagamento ou devolução)?
    public void addOperacao(Operacao operacao){
        this.historico.add(operacao);
    }
}
