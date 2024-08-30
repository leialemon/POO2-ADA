package biblioteca.model.operacoes;

import biblioteca.model.Associado;

public class PagamentoMulta extends Operacao {
    Multa multa;
    public PagamentoMulta(Associado associado, Multa multa){
        super(associado);
        this.multa = multa;
        //Lógica: pegar multas ativas do associado; pegar valorTotal;
        setVirtual(false);
        //multa.setPagamento();
    }
}

