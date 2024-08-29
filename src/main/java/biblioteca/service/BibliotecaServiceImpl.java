package biblioteca.service;

import biblioteca.model.*;
import biblioteca.persistence.BibliotecaRepositorio;

abstract class BibliotecaServiceImpl implements BibliotecaService{
    protected BibliotecaRepositorio catalogo;

    public void setCatalogo(BibliotecaRepositorio catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public void reservar(ItemCatalogo item) {
    }

    @Override
    public void cancelarReserva(Reserva reserva) {

    }

    @Override
    public void consultar(ItemCatalogo item) {

    }

    @Override
    public void consultar(String titulo) {

    }

    @Override
    public void consultarAutor(Autor autor) {

    }

    @Override
    public void consultarAutor(String nomeAutor) {

    }
}
