package biblioteca.persistence;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;

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
}


//
//        Atividade Parte 3:
//        08. Implementar lógica que cadastrar
//09. Implementar logica do consultar - facam consultar(item)
//10. Implementar logica do emprestar
//11. Implementar logica do devolver
//12. Implementar demais (opcional)






