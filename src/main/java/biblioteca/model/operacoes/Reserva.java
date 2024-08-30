package biblioteca.model.operacoes;

import biblioteca.model.Associado;
import biblioteca.model.ItemCatalogo;

public class Reserva extends Operacao {
    private boolean ativa;
    public Reserva(Associado associado, ItemCatalogo item){
        super(associado, item);
        setAtiva(true);
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public boolean getAtiva(){
        return this.ativa;
    }
}
