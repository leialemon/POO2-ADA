package biblioteca.model;

import java.io.Serializable;

abstract public class Pessoa implements Serializable, Comparable<Pessoa> {
    private String nome;
    private String dataNascimento = "não informada";
    public Pessoa (String nome){
        if (nome == null){
            throw new IllegalArgumentException("O campo 'nome' não pode ser nulo!");
        }else {this.nome = nome;}
    }

    public Pessoa (String nome, String dataNascimento){
        if (nome == null){
            throw new IllegalArgumentException("O campo 'nome' não pode ser nulo!");
        }else {this.nome = nome;}
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Pessoa)) return false;
        if(this.nome == null) return false;
        Pessoa pessoa = (Pessoa) obj;
        if (this.nome.equalsIgnoreCase(pessoa.getNome())){
            return this.dataNascimento.equals(pessoa.getDataNascimento());
        }
        return false;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        int comparador = this.nome.compareTo(pessoa.getNome());
        if (comparador == 0){
            comparador = this.dataNascimento.compareTo(pessoa.getDataNascimento());
        }
        return comparador;
    }
}
