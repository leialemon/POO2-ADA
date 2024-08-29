package biblioteca.model;

abstract public class Pessoa {
    private String nome;
    public Pessoa (String nome){
        if (nome == null){
            throw new IllegalArgumentException("O campo 'nome' não pode ser nulo!");
        }else {this.nome = nome;}
    }
    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Pessoa)) return false;
        if(this.nome == null) return false;
        Pessoa pessoa = (Pessoa) obj;
        return (this.nome.equalsIgnoreCase(pessoa.getNome()));
    }
}
