package biblioteca.persistence;

import biblioteca.model.Associado;
import biblioteca.model.Autor;
import biblioteca.model.ItemCatalogo;
import java.io.*;

import java.util.ArrayList;
import java.util.List;
// "Banco de dados"
// ordenar catálogo
public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {
    private List<ItemCatalogo> catalogo = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Associado> associados = new ArrayList<>();

    @Override
    public void cadastrarAssociado(Associado associado) {
        try{ FileOutputStream salvamento = new FileOutputStream("associados.txt");
            ObjectOutputStream salvando = new ObjectOutputStream(salvamento);
            salvando.writeObject(associado);
        } catch (IOException e){
            System.err.println("Erro! "+ e);
        }
    }

    @Override
    public List<Associado> getAssociados() {
        try{
            FileInputStream carregamento = new FileInputStream("associados.txt");
            ObjectInputStream carregando = new ObjectInputStream(carregamento);
            this.associados = (List<Associado>) carregando.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.err.println("Erro! "+ e);
        }
        return this.associados;
    }
    @Override
    public void salvar(ItemCatalogo item) {
        try{ FileOutputStream salvamento = new FileOutputStream("catalogo.txt");
            ObjectOutputStream salvando = new ObjectOutputStream(salvamento);
            salvando.writeObject(item);
        } catch (IOException e){
            System.err.println("Erro! "+ e);
        }
    }

    @Override
    public List<ItemCatalogo> getCatalogo() {
        try{
            FileInputStream carregamento = new FileInputStream("catalogo.txt");
            ObjectInputStream carregando = new ObjectInputStream(carregamento);
            this.catalogo = (List<ItemCatalogo>) carregando.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.err.println("Erro! "+ e);
        }
        return this.catalogo;
    }

    @Override
    public void addAutor(Autor autor) {
        try{ FileOutputStream salvamento = new FileOutputStream("autores.txt");
            ObjectOutputStream salvando = new ObjectOutputStream(salvamento);
            salvando.writeObject(autor);
        } catch (IOException e){
            System.err.println("Erro! "+ e);
        }
    }

    @Override
    public List<Autor> getAutores() {
        try{
            FileInputStream carregamento = new FileInputStream("autores.txt");
            ObjectInputStream carregando = new ObjectInputStream(carregamento);
            this.autores = (List<Autor>) carregando.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.err.println("Erro! "+ e);
        }
        return this.autores;
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
}







