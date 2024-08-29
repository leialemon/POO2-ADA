package biblioteca.service;

import biblioteca.model.*;
import biblioteca.persistence.BibliotecaRepositorio;

public interface BibliotecaService {
    public void setCatalogo(BibliotecaRepositorio catalogo);
    public void reservar(ItemCatalogo item);
    public void cancelarReserva(Reserva reserva);
    public void consultar(ItemCatalogo item);
    public void consultar(String titulo);
    public void consultarAutor(String nomeAutor);
    public void consultarAutor(Autor autor);
}
