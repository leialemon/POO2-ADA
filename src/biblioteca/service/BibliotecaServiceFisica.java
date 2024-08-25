package tech.ada.poo.base.biblioteca.service;

public interface BibliotecaServiceFisica extends BibliotecaService{
    public void emprestar();
    public void devolver();
    public void cadastrar(ItemCatalogo item);
}
