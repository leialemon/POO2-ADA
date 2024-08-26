package tech.ada.poo.base.biblioteca.service;

import java.util.List;

public class BibliotecaServiceVirtualImpl extends BibliotecaServiceImpl implements BibliotecaServiceVirtual{
    private BibliotecaRepositorioListImpl catalogo;

    public BibliotecaServiceVirtualImpl(BibliotecaRepositorioListImpl catalogo){
        this.catalogo = catalogo;
    }

    @Override
    public void reservar() {
        System.out.println("Reservando item.");
    }

    @Override
    public void consultar() {
        System.out.println("Consultando item.");
    }
}
