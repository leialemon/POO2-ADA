package biblioteca.model.operacoes;

import biblioteca.model.Associado;
import biblioteca.model.ItemCatalogo;

import java.time.LocalDate;

public class Multa extends Operacao {
    private double valorTotal;
    boolean ativa;
    PagamentoMulta pagamento;
// Criar lógica que instancie uma multa automaticamente quando o empréstimo passar da data de vencimento
    public Multa(Associado associado, Emprestimo emprestimo){
        super(associado);
        setAtiva(true);
        this.dataRealizada = emprestimo.getVencimento().plusDays(1);
    }

    protected void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public boolean getAtiva(){
        return this.ativa;
    }

    protected void setPagamento(PagamentoMulta pagamento){
        this.pagamento = pagamento;
        setAtiva(false);
    }

    private double calcularTotal(){
        if (!ativa){
            System.out.println("Multa paga.");
            return 0.0;
        }
        LocalDate hoje = LocalDate.now();
        int atraso = hoje.getDayOfYear() - dataRealizada.getDayOfYear();
        double jurosDia = 0.5;
        if (this.item.getReserva() != null){
            jurosDia = 1;
        }
        this.valorTotal = atraso * jurosDia;
        return this.valorTotal;
    }

    public double getValorTotal(){
        return calcularTotal();
    }
}
