package biblioteca.model;

import java.time.LocalDateTime;

public class Emprestimo extends Operacoes{
    LocalDateTime devolucao;

    @Override
    public void setVirtual(boolean virtual) {
        super.setVirtual(false);
    }
}
