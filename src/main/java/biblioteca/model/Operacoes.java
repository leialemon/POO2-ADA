package biblioteca.model;

import java.time.LocalDateTime;

abstract public class Operacoes {
    Associado associado;
    boolean virtual;
    ItemCatalogo item;
    LocalDateTime dataRealizada;

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }
}
