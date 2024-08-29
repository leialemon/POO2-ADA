package biblioteca.model;

import java.time.LocalDate;

public class Revista extends ItemCatalogo{
    private int numeroEdicao;
    private String mesPublicacao;
    private String categoria;

    public Revista(String titulo, String autor, int numeroEdicao, String mesPublicacao, String categoria) {
        super(titulo, autor, Secao.REVISTAS);
        this.numeroEdicao = numeroEdicao;
        this.mesPublicacao = mesPublicacao;
        this.categoria = categoria;
    }

    public int getNumeroEdicao(){
        return numeroEdicao;
    }

    public String getMesPublicacao(){
        return mesPublicacao;
    }

    public String getCategoria(){
        return categoria;
    }

}
