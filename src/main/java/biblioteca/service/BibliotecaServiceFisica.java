package biblioteca.service;

import biblioteca.model.*;

public interface BibliotecaServiceFisica extends BibliotecaService{
    public void emprestar(ItemCatalogo item);
    public void devolver(ItemCatalogo item);
    public void cadastrar(ItemCatalogo item);
    public void pagarMulta(Multa multa);
}
