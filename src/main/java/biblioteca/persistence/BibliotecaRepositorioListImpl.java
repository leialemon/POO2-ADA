package biblioteca.persistence;

import biblioteca.model.Associado;
import biblioteca.model.Autor;
import biblioteca.model.ItemCatalogo;


import java.util.ArrayList;
import java.util.List;
// "Banco de dados"
public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {
    private List<ItemCatalogo> catalogo = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Associado> associados = new ArrayList<>();

    @Override
    public void salvar(ItemCatalogo item) {
        this.catalogo.add(item);
    }

    @Override
    public void cadastrarAssociado(Associado associado) {
        this.associados.add(associado);
    }

    @Override
    public List<Associado> getAssociados() {
        return this.associados;
    }

    @Override
    public boolean consultar(String titulo) {
        if (this.catalogo == null || catalogo.isEmpty()) return false;
        for (ItemCatalogo item: this.catalogo) {
            if (item.getTitulo().equalsIgnoreCase(titulo))
                return true;
        }
        return false;
    }

    @Override
    public boolean consultar(ItemCatalogo item) {
        if (this.catalogo == null || catalogo.isEmpty()) return false;
        for (ItemCatalogo i: this.catalogo) {
            if (i.equals(item))
                return true;
        }
        return false;
    }

    @Override
    public List<ItemCatalogo> getCatalogo() {
        return catalogo;
    }

    @Override
    public List<Autor> getAutores() {
        return autores;
    }

    @Override
    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }
}







