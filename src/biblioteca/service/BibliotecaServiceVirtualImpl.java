package tech.ada.poo.base.biblioteca.service;

public class BibliotecaServiceVirtualImpl extends BibliotecaServiceImpl implements BibliotecaServiceVirtual{
    @Override
    public void reservar() {
        System.out.println("Reservando item.");
    }

    @Override
    public void consultar() {
        System.out.println("Reservando item.");
    }
}
