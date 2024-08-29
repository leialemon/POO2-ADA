package biblioteca.persistence;

import biblioteca.model.ItemCatalogo;

import java.util.List;

public interface BibliotecaRepositorio {
    public  void salvar(ItemCatalogo item);
    public boolean consultar(String titulo);
    public boolean consultar(ItemCatalogo item);
    public List<ItemCatalogo> getCatalogo();
}
