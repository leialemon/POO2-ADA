package tech.ada.poo.base.biblioteca.service;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.biblioteca.persistence.BibliotecaRepositorio;


public class BibliotecaServiceVirtualImpl extends BibliotecaServiceImpl implements BibliotecaServiceVirtual {
    private BibliotecaRepositorio catalogo;

    public BibliotecaServiceVirtualImpl(BibliotecaRepositorio catalogo) {
        super.setCatalogo(catalogo);
    }

    @Override
    public void reservar(ItemCatalogo item) {
        super.reservar(item);
    }

    @Override
    public void consultarItem(ItemCatalogo item) {
        super.consultarItem(item);
    }

    @Override
    public void consultarTitulo(String titulo) {
        super.consultarTitulo(titulo);
    }
}

