package tech.ada.poo.base.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

public interface BibliotecaRepositorio {
    public  void salvar(ItemCatalogo item);
    public List<ItemCatalogo> getCatalogo();
}
