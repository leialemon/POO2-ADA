package tech.ada.poo.base.biblioteca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        BibliotecaServiceFisicaImpl bibliotecaFisica = new BibliotecaServiceFisicaImpl();
        Livro livroTeste = new Livro("240345638", 300, "editora", "título", "autor", LocalDate.now());
        Livro livro2 = new Livro("1237489", 358, "Jambô", "A Cidade da raposa", "Lucas Borne", LocalDate.now());
        Livro livro3 = new Livro("8935467", 422, "Alta Books", "Código Limpo", "Robert C. Martin", LocalDate.now());
        Revista revista1 = new Revista("Revista de Teste", "Autor da revista", LocalDate.now(), 50, "Janeiro", "Variedades");
        bibliotecaFisica.addCatalogo(livroTeste);
        bibliotecaFisica.addCatalogo(livro2);
        bibliotecaFisica.addCatalogo(livro3);
        bibliotecaFisica.addCatalogo(revista1);
        List<ItemCatalogo> catalogo = bibliotecaFisica.getItens();
        mostrarCatalogo(catalogo);
    }

    public static void mostrarCatalogo(List<ItemCatalogo> catalogo){
        for (ItemCatalogo item : catalogo) {
            System.out.println("Título: " + item.getTitulo());
            System.out.println("Autor: " + item.getAutor());
            System.out.println("Data de cadastro: " + item.getData());
            switch (item) {
                case Livro livro -> {
                    System.out.println(livro.getNumeroPaginas() + " páginas");
                    System.out.println("Editora: " + livro.getEditora());
                    System.out.println("ISBN: " + livro.getIsbn());
                    break;
                }
                case Revista revista -> {
                    System.out.println("Categoria: "+revista.getCategoria());
                    System.out.println("Mês de publicação: "+ revista.getMesPublicacao());
                    System.out.println("N.: "+ revista.getNumeroEdicao());
                    break;
                }
                case Manuscrito manuscrito -> {
                    System.out.println("Estado de conservação: "+manuscrito.getLocalOrigem());
                    System.out.println("Local de origem: "+manuscrito.getEstadoConservacao());
                    if (manuscrito.getDigitalizado()) {
                        System.out.println("Digitalizado");
                    } else {
                        System.out.println("Não digitalizado");
                    }
                    break;
                }
                default ->  {
                    break;
                }
            }
            System.out.println();
            System.out.println("#######");
            System.out.println();
        }
    }
}
