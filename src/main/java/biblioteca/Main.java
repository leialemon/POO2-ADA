package biblioteca;

import biblioteca.model.*;
import biblioteca.service.*;
import biblioteca.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Criar classe de pessoas para gerir associados da biblioteca
// Criar métodos para prorrogar o empréstimo?
// Criar uma classe empréstimo para registrar datas e aplicar multas?
// (Impedir que empreste outro livro se não tiver devolvido o anterior)
// Criar uma classe reserva para implementar um limite de reservas simultâneas que cada associado pode ter.
// Classe Reserva para acompanhar o andamento das reservas e saber quando o item ficar disponível.
// Controlar fila de reservas de um item.
// Criar classe autor e mudar o atributo de ItemCatalogo (String autor → Autor autor)?

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
