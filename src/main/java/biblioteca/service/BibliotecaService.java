package biblioteca.service;

import biblioteca.model.ItemCatalogo;
import biblioteca.persistence.BibliotecaRepositorio;

public interface BibliotecaService {
    public void setCatalogo(BibliotecaRepositorio catalogo);
    public void reservar(ItemCatalogo item);
    public void consultarItem(ItemCatalogo item);
    public void consultarTitulo(String titulo);
}
