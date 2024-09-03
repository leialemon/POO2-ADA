package biblioteca.model.operacoes;

import biblioteca.model.Associado;
import biblioteca.model.ItemCatalogo;

import java.time.LocalDateTime;

public class Emprestimo extends Operacao {

    private boolean ativo;
    private Devolucao devolucao;
    private LocalDateTime vencimento;

    public Emprestimo (Associado associado, ItemCatalogo item){
        super(associado, item);
        this.vencimento = this.dataRealizada.plusDays(15);
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    private void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    protected void setDevolucao(Devolucao devolucao){
        this.devolucao = devolucao;
        setAtivo(false);
    }

    // Para prorrogar o empréstimo
    public void setVencimento(LocalDateTime vencimento) {
        this.vencimento = vencimento;
    }

    public LocalDateTime getVencimento(){
        return this.vencimento;
    }
}
