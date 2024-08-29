package biblioteca.persistence;

import biblioteca.model.Autor;
import biblioteca.model.ItemCatalogo;

import java.util.List;

public interface BibliotecaRepositorio {
    public  void salvar(ItemCatalogo item);
    public void addAutor(Autor autor);
    public boolean consultar(String titulo);
    public boolean consultar(ItemCatalogo item);
    public List<ItemCatalogo> getCatalogo();
    public List<Autor> getAutores();
}
