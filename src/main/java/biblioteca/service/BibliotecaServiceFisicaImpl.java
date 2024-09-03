package biblioteca.service;

import biblioteca.model.*;
import biblioteca.model.operacoes.Devolucao;
import biblioteca.model.operacoes.Emprestimo;
import biblioteca.model.operacoes.Multa;
import biblioteca.model.operacoes.PagamentoMulta;
import biblioteca.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class BibliotecaServiceFisicaImpl extends BibliotecaServiceImpl implements BibliotecaServiceFisica{

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio catalogo){
        super.setCatalogo(catalogo);
    }

    @Override
    public void emprestar(ItemCatalogo item, Associado associado) {
        if (associado.getEmprestimoAtivo() != null){
            System.out.println("Já existe um empréstimo ativo para este usuário.");
            System.out.println("Não é possível emprestar mais de um livro por vez.");
        } else if (associado.getMultaPendente() != null) {
            System.out.println("Este usuário possui uma multa pendente.");
        } else {
            Emprestimo emprestimo = new Emprestimo(associado, item);
            associado.setEmprestimoAtivo(emprestimo);
            item.setEmprestado(emprestimo);
        }
    }

    @Override
    public void devolver(ItemCatalogo item) {
        Emprestimo emprestimo = item.getEmprestimo();
        Associado associado = emprestimo.getAssociado();
        Devolucao devolucao = new Devolucao(associado, item);
        LocalDateTime vencimento = emprestimo.getVencimento();
        if (devolucao.getDataRealizada().isAfter(vencimento)){
            Multa multa = new Multa(associado, emprestimo);
            associado.setMultaPendente(multa);
            System.out.println("Item devolvido com atraso!");
            System.out.println("Valor da multa: "+multa.getValorTotal());
        }
        item.setEmprestado(null);
        associado.setEmprestimoAtivo(null);
        associado.addOperacao(devolucao);
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        if (!catalogo.consultar(item.getAutor())){
            catalogo.addAutor(item.getAutor());
            System.out.println("Novo autor cadastrado no banco de dados.");
        }
        if (!catalogo.consultar(item)){
            catalogo.salvar(item);
            System.out.println("Item cadastrado.");
        } else {
            System.out.println("Item já cadastrado!");
        }
    }

    public void cadastrar(Associado associado){
        if (!catalogo.consultar(associado)){
            catalogo.cadastrarAssociado(associado);
            System.out.println("Usuário cadastrado com sucesso.");
        } else {
            System.out.println("Usuário já cadastrado!");
        }
    }

    @Override
    public void pagarMulta(Multa multa) {
        Associado associado = multa.getAssociado();
        PagamentoMulta pagamento = new PagamentoMulta(associado, multa);
        multa.setPagamento(pagamento);
        associado.addOperacao(pagamento);
        associado.setMultaPendente(null);
    }

}
