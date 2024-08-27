package tech.ada.poo.base.biblioteca.persistence;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;

import java.util.List;

public interface BibliotecaRepositorio {
    public  void salvar(ItemCatalogo item);
    public List<ItemCatalogo> getCatalogo();
}
