package tech.ada.poo.base.biblioteca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        // Recomenda-se declarar o tipo da interface e não o da classe que implementa

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
