package biblioteca.model.operacoes;

import biblioteca.model.Associado;
import biblioteca.model.ItemCatalogo;

public class Devolucao extends Operacao {
    public Devolucao(Associado associado, ItemCatalogo itemCatalogo){
        super(associado, itemCatalogo);
    }
}
