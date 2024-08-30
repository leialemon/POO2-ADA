package biblioteca;

import biblioteca.model.*;
import biblioteca.service.*;
import biblioteca.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Primeiro fazer funcionar, depois implementar possibilidade de editar os itens salvos.

public class Main {
    public static void main(String[] args) {
        // Recomenda-se declarar o tipo da interface e não o da classe que implementa
        BibliotecaRepositorio catalogo = new BibliotecaRepositorioListImpl();
        BibliotecaServiceVirtual biblioteca = new BibliotecaServiceVirtualImpl(catalogo);
        List<ItemCatalogo> itens = new ArrayList<>();

    }
//
//    public static void mostrarCatalogo (catalogo){
//        for (ItemCatalogo item : catalogo) {
//            System.out.println("Título: " + item.getTitulo());
//            System.out.println("Autor: " + item.getAutorNome());
//            System.out.println("Data de cadastro: " + item.getData());
//            switch (item) {
//                case Livro livro -> {
//                    System.out.println(livro.getNumeroPaginas() + " páginas");
//                    System.out.println("Editora: " + livro.getEditora());
//                    System.out.println("ISBN: " + livro.getIsbn());
//                    break;
//                }
//                case Revista revista -> {
//                    System.out.println("Categoria: "+revista.getCategoria());
//                    System.out.println("Mês de publicação: "+ revista.getMesPublicacao());
//                    System.out.println("N.: "+ revista.getNumeroEdicao());
//                    break;
//                }
//                case Manuscrito manuscrito -> {
//                    System.out.println("Estado de conservação: "+manuscrito.getLocalOrigem());
//                    System.out.println("Local de origem: "+manuscrito.getEstadoConservacao());
//                    if (manuscrito.getDigitalizado()) {
//                        System.out.println("Digitalizado");
//                    } else {
//                        System.out.println("Não digitalizado");
//                    }
//                    break;
//                }
//                default ->  {
//                    break;
//                }
//            }
//            System.out.println();
//            System.out.println("#######");
//            System.out.println();
//        }
//    }
}
