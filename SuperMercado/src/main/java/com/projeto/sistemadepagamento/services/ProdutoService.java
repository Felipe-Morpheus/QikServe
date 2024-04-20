package com.projeto.sistemadepagamento.services;

import java.util.List;

import com.projeto.sistemadepagamento.entities.Produto;

public interface ProdutoService {
    Produto buscarProdutoPorId(String id);
    List<Produto> buscarTodosProdutos();
    void adicionarProduto(Produto produto);
    void excluirProduto(String id);


}
