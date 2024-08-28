package tech.ada.poo.base.biblioteca.model;

import java.time.LocalDate;

public abstract class ItemCatalogo {
    private String titulo;
    private String autor;
    private LocalDate data;
    private boolean reservado;
    private boolean emprestado;

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

    public boolean isReservado(){ return reservado;}

    public void setReservado(boolean reservado){
        this.reservado = reservado;
    }

    public boolean isEmprestado(){ return emprestado;}

    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && !(obj instanceof ItemCatalogo)) return false;
        ItemCatalogo item = (ItemCatalogo) obj;

        if ( this.titulo.equalsIgnoreCase(item.getTitulo()) )
            return true;

        return false;
    }
}
