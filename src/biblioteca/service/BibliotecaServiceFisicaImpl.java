package tech.ada.poo.base.biblioteca.service;

import java.util.List;

public class BibliotecaServiceFisicaImpl extends BibliotecaServiceImpl implements BibliotecaServiceFisica{



    @Override
    public void emprestar() {
        System.out.println("Emprestando item.");
    }

    @Override
    public void devolver() {
        System.out.println("Devolvendo item.");
    }

    @Override
    public void reservar() {
        System.out.println("Reservando item.");
    }

    @Override
    public void consultar() {
        System.out.println("Consultando item.");
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        addCatalogo(item);
    }

    public List<ItemCatalogo> showCatalogo(){
        return getItens();
    }
}
