package biblioteca.service;

import biblioteca.model.ItemCatalogo;
import biblioteca.persistence.BibliotecaRepositorio;

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
        catalogo.consultar(item);
    }

    @Override
    public void consultarTitulo(String titulo) {
        catalogo.consultar(titulo);
    }
}
