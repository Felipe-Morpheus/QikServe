package com.projeto.sistemadepagamento.repositories;

import java.util.List;

import com.projeto.sistemadepagamento.entities.Produto;

public interface ProdutoRepository {
    Produto buscarPorId(String id);
    List<Produto> buscarTodos();
    void salvar(Produto produto);
    void excluir(String id);
}