package biblioteca.service;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;
import biblioteca.persistence.BibliotecaRepositorio;


public class BibliotecaServiceVirtualImpl extends BibliotecaServiceImpl implements BibliotecaServiceVirtual {
    private BibliotecaRepositorio catalogo;

    public BibliotecaServiceVirtualImpl(BibliotecaRepositorio catalogo) {
        super.setCatalogo(catalogo);
    }
}

