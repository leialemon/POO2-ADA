package biblioteca.persistence;

import biblioteca.model.Associado;
import biblioteca.model.Autor;
import biblioteca.model.ItemCatalogo;

import java.util.List;

public interface BibliotecaRepositorio {
    // TODO ordenar catálogo
    public  void salvar(ItemCatalogo item);
    public void addAutor(Autor autor);
    public void cadastrarAssociado(Associado associado);
    public boolean pesquisar(String titulo);
    public List<ItemCatalogo> getCatalogo();
    public List<Autor> getAutores();
    public List<Associado> getAssociados();

    boolean consultar(ItemCatalogo item);

    boolean consultar(Autor autor);

    boolean consultar(Associado associado);
}
