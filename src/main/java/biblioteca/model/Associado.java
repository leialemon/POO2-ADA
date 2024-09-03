package biblioteca.model;


import biblioteca.model.operacoes.Emprestimo;
import biblioteca.model.operacoes.Multa;
import biblioteca.model.operacoes.Operacao;
import biblioteca.model.operacoes.Reserva;

import java.time.LocalDateTime;
import java.util.List;

public class Associado extends Pessoa{
    final private LocalDateTime dataDeCadastro;
    private List<Operacao> historico;
    private Emprestimo emprestimoAtivo;
    private Reserva reservaAtiva;
    private Multa multaPendente;
    private String email; //usar regex para validar?


    public Associado(String nome, String dataNascimento){
        super(nome, dataNascimento);
        this.dataDeCadastro = LocalDateTime.now();
    }

    public Multa getMultaPendente(){
        return this.multaPendente;
    }

    public void setMultaPendente(Multa multa){
        this.multaPendente = multa;
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

    // chamar quando uma operação for feita (multa, pagamento ou devolução)?
    public void addOperacao(Operacao operacao){
        this.historico.add(operacao);
    }

//    public String toString(){
//        String associado = "Nome: "+this.getNome()+
//                            "\nData de nascimento: "+this.getDataNascimento()+
//                            "\n";
//        return associado;
//    }

}
