package biblioteca.service;

import biblioteca.model.*;
import biblioteca.persistence.*;

import java.time.LocalDate;

public class BibliotecaServiceFisicaImpl extends BibliotecaServiceImpl implements BibliotecaServiceFisica{

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio catalogo){
        super.setCatalogo(catalogo);
    }

    @Override
    public void emprestar(ItemCatalogo item) {

    }

    @Override
    public void devolver(ItemCatalogo item) {

    }

    @Override
    public void cadastrar(ItemCatalogo item) {

    }

    @Override
    public void pagarMulta(Multa multa) {

    }
}
