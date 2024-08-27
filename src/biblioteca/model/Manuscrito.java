package tech.ada.poo.base.biblioteca.model;

import java.time.LocalDate;

public class Manuscrito extends ItemCatalogo{
    private String localOrigem;
    private String estadoConservacao;
    private boolean digitalizado;

    public Manuscrito(String titulo, String autor, LocalDate data, String localOrigem, String estadoConservacao, boolean digitalizado){
        super(titulo, autor, data);
        this.localOrigem = localOrigem;
        this.estadoConservacao = estadoConservacao;
        this.digitalizado = digitalizado;
    }

    public String getLocalOrigem(){
        return localOrigem;
    }

    public String getEstadoConservacao(){
        return estadoConservacao;
    }

    public boolean getDigitalizado(){
        return digitalizado;
    }
}
