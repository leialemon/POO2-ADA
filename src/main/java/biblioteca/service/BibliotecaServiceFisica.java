package biblioteca.service;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;

public interface BibliotecaServiceFisica extends BibliotecaService{
    public void emprestar(ItemCatalogo item);
    public void devolver(ItemCatalogo item);
    public void cadastrar(ItemCatalogo item);
}
