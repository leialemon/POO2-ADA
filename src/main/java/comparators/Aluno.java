package comparators;

public class Aluno implements  Comparable<Aluno>{
    String nome;
    double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public int compareTo(Aluno aluno){
        // Nota -> nome
        int comparador = Double.compare(this.nota, aluno.getNota());
        if (comparador == 0){
            return this.nome.compareTo(aluno.getNome());
        }
        return comparador;
    }

    public Double getNota(){
        return this.nota;
    }

    public String getNome(){
        return this.nome;
    }
}
