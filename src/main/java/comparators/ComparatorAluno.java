package comparators;

import java.util.Comparator;

public class ComparatorAluno implements Comparator<Aluno> {
    public int compare(Aluno esquerda, Aluno direita){
        // Nome -> nota
        int comparador = esquerda.getNome().compareTo(direita.getNome());
        if (comparador == 0){
            return esquerda.getNota().compareTo(direita.getNota());
        }
        return comparador;
    }
}
