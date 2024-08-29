package biblioteca.service;

import biblioteca.model.ItemCatalogo;

public interface BibliotecaServiceFisica extends BibliotecaService{
    public void emprestar(ItemCatalogo item);
    public void devolver(ItemCatalogo item);
    public void cadastrar(ItemCatalogo item);
}
