package com.projeto.sistemadepagamento.repositories;

import java.util.List;

import com.projeto.sistemadepagamento.entities.Promocao;

public interface PromocaoRepository {
    Promocao buscarPorId(String id);
    List<Promocao> buscarTodas();
    void salvar(Promocao promocao);
    void excluir(String id);
}
