package tech.ada.poo.base.biblioteca.service;

import java.util.ArrayList;
import java.util.List;
// "Banco de dados"
public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {
    private List<ItemCatalogo> catalogo = new ArrayList<>();

    @Override
    public void salvar(ItemCatalogo item) {
        catalogo.add(item);
    }

    @Override
    public List<ItemCatalogo> getCatalogo() {
        return catalogo;
    }
}

