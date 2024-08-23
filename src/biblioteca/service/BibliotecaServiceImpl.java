package tech.ada.poo.base.biblioteca.service;

public class BibliotecaServiceImpl implements BibliotecaService {
    @Override
    public void consultar() {
        System.out.println("Consulta de itens.");
    }

    @Override
    public void reservar() {
        System.out.println("Reserva de itens.");
    }

    @Override
    public void devolver() {
        System.out.println("Devolução de itens.");
    }

    @Override
    public void emprestar() {
        System.out.println("Empréstimo de itens.");
    }
}
