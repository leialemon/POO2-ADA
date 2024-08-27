package tech.ada.poo.base.biblioteca.service;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.biblioteca.persistence.BibliotecaRepositorio;

abstract class BibliotecaServiceImpl implements BibliotecaService{
    protected BibliotecaRepositorio catalogo;

    public void setCatalogo(BibliotecaRepositorio catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public void reservar(ItemCatalogo item) {
        item.setReservado(true);
        System.out.println("Item reservado.");
    }

    @Override
    public void consultarItem(ItemCatalogo item) {

    }

    @Override
    public void consultarAutor(String autor) {

    }

    @Override
    public void consultarTitulo(String titulo) {

    }
}
