package tech.ada.poo.base.biblioteca.service;

import java.time.LocalDate;

public abstract class ItemCatalogo {
    private String titulo;
    private String autor;
    private LocalDate data;

    public ItemCatalogo(String titulo, String autor, LocalDate data){
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public LocalDate getData(){
        return data;
    }
}
