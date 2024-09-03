package biblioteca.service;

import biblioteca.model.*;
import biblioteca.model.operacoes.Reserva;
import biblioteca.persistence.BibliotecaRepositorio;

import java.util.ArrayList;
import java.util.List;

abstract class BibliotecaServiceImpl implements BibliotecaService{
    protected BibliotecaRepositorio catalogo;

    public void setCatalogo(BibliotecaRepositorio catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public void reservar(ItemCatalogo item, Associado associado) {
        Reserva reserva = new Reserva(associado, item);
        associado.setReservaAtiva(reserva);
        item.setReservado(reserva);
    }

    @Override
    public void cancelarReserva(Reserva reserva) {
        reserva.setAtiva(false);
        Associado associado = reserva.getAssociado();
        associado.setReservaAtiva(null);
        ItemCatalogo item = reserva.getItem();
        item.setReservado(null);
    }

    @Override
    public List<Associado> pesquisarAssociado(String nomeAssociado) {
        List <Associado> associados = catalogo.getAssociados();
        List<Associado> resultados = new ArrayList<>();
        for (Associado a : associados){
            if(a.getNome().toLowerCase().contains(nomeAssociado.toLowerCase())){
                resultados.add(a);
            }
        }
        return resultados;
    }

    @Override
    public List<Autor> pesquisarAutor(String nomeAutor) {
        List<Autor> autores = catalogo.getAutores();
        List<Autor> resultados = new ArrayList<>();
        for (Autor a : autores){
            if(a.getNome().toLowerCase().contains(nomeAutor.toLowerCase())){
                resultados.add(a);
            }
        }
        return resultados;
    }

    @Override
    public List<ItemCatalogo> pesquisarObra(String titulo) {
        List<ItemCatalogo> itens = catalogo.getCatalogo();
        List<ItemCatalogo> resultados = new ArrayList<>();
        for (ItemCatalogo a : itens){
            if(a.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                resultados.add(a);
            }
        }
        return resultados;
    }
}
