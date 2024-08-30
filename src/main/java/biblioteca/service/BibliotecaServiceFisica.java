package biblioteca.service;

import biblioteca.model.*;
import biblioteca.model.operacoes.Multa;

public interface BibliotecaServiceFisica extends BibliotecaService{
    public void emprestar(ItemCatalogo item);
    public void devolver(ItemCatalogo item);
    public void cadastrar(ItemCatalogo item);
    public void pagarMulta(Multa multa);
}
