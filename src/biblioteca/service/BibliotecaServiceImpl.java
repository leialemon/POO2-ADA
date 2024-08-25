package tech.ada.poo.base.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

abstract class BibliotecaServiceImpl {
    private List<ItemCatalogo> itens = new ArrayList<ItemCatalogo>();

    public void addCatalogo(ItemCatalogo item){
        itens.add(item);
    }

    public List<ItemCatalogo> getItens(){
        return itens;
    }
}
