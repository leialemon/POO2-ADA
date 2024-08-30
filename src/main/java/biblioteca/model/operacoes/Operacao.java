package biblioteca.model.operacoes;

import biblioteca.model.Associado;
import biblioteca.model.ItemCatalogo;

import java.time.LocalDateTime;

abstract public class Operacao {
    Associado associado;
    boolean virtual;
    ItemCatalogo item;
    LocalDateTime dataRealizada;

    // Serviço que chama o construtor deve em seguida chamar o setVirtual;
    public Operacao(Associado associado, ItemCatalogo item){
        this.associado = associado;
        this.item = item;
        this.dataRealizada = LocalDateTime.now();
    }

    public Operacao(Associado associado){
        this.associado = associado;
        this.dataRealizada = LocalDateTime.now();
    }

    protected void setDataRealizada(LocalDateTime dataRealizada) {
        this.dataRealizada = dataRealizada;
    }

    public LocalDateTime getDataRealizada(){
        return this.dataRealizada;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }
}
