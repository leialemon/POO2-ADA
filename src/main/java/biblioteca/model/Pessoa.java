package biblioteca.model;

abstract public class Pessoa {
    private String nome;
    public Pessoa (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
