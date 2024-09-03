package biblioteca.service;

import biblioteca.model.*;
import biblioteca.model.operacoes.Reserva;
import biblioteca.persistence.BibliotecaRepositorio;

import java.util.List;

public interface BibliotecaService {
    public void setCatalogo(BibliotecaRepositorio catalogo);
    public void reservar(ItemCatalogo item, Associado associado);
    public void cancelarReserva(Reserva reserva);
    public List<ItemCatalogo> pesquisarObra(String titulo);
    public List<Associado> pesquisarAssociado(String nomeAssociado);
    public List<Autor> pesquisarAutor(String nomeAutor);
}
