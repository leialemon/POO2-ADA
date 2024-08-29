package biblioteca.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Associado extends Pessoa{
    private LocalDate dataDeCadastro;
    List<Operacoes> historico;
    Emprestimo emprestimoAtivo;
    Reserva reservaAtiva;
}
