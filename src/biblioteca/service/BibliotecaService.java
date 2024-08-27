package tech.ada.poo.base.biblioteca.service;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.biblioteca.persistence.BibliotecaRepositorio;

public interface BibliotecaService {
    public void setCatalogo(BibliotecaRepositorio catalogo);
    public void reservar(ItemCatalogo item);
    public void consultarItem(ItemCatalogo item);
    public void consultarAutor(String autor);
    public void consultarTitulo(String titulo);
}
