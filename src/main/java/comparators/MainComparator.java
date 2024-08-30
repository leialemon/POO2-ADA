package comparators;

import java.util.*;

public class MainComparator {
    public static void main(String[] args){
        Aluno joao = new Aluno("João", 6.5);
        Aluno ana = new Aluno("Ana", 9.5);
        Aluno Pedro = new Aluno("Pedro", 4);
        Aluno Joana = new Aluno("Joana", 10);

        List<Aluno> turma = new ArrayList<>(Arrays.asList(joao, ana, Pedro, Joana));

        Comparator<Aluno> comparaAluno = new ComparatorAluno();

        Collections.sort(turma);
        System.out.println("Comparable:");
        for (Aluno a : turma){
            System.out.println("Aluno: "+a.getNome()+" Nota: "+ a.getNota());
        }
        System.out.println("#######");
        System.out.println("Comparator");
        Collections.sort(turma, comparaAluno);
        for (Aluno a : turma){
            System.out.println("Aluno: "+ a.getNome()+" Nota: "+ a.getNota());
        }
    }
}
