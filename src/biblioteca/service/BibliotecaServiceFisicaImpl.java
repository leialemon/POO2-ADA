package tech.ada.poo.base.biblioteca.service;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.biblioteca.persistence.BibliotecaRepositorio;
import tech.ada.poo.base.biblioteca.persistence.BibliotecaRepositorioListImpl;

import java.time.LocalDate;

public class BibliotecaServiceFisicaImpl extends BibliotecaServiceImpl implements BibliotecaServiceFisica{

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio catalogo){
        super.setCatalogo(catalogo);
    }

    @Override
    public void reservar(ItemCatalogo item) {
        super.reservar(item);
    }

    @Override
    public void emprestar(ItemCatalogo item) {
        item.setEmprestado(true);
        if (item.isReservado()){item.setReservado(false);}
        System.out.println("Empréstimo registrado.");
        LocalDate emprestimo = LocalDate.now();
        LocalDate devolucao = emprestimo.plusDays(15);
        System.out.println("Data do Empréstimo: "+ emprestimo);
        System.out.println("Data de Devolução: "+ devolucao);
    }

    @Override
    public void devolver(ItemCatalogo item) {
        item.setEmprestado(false);
        System.out.println("Item devolvido.");
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        catalogo.salvar(item);
        System.out.println("Item cadastrado.");
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
