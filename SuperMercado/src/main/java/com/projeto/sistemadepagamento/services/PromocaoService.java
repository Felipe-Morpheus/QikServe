package com.projeto.sistemadepagamento.services;

import java.util.List;

import com.projeto.sistemadepagamento.entities.Promocao;

public interface PromocaoService {
    Promocao buscarPromocaoPorId(String id);
    List<Promocao> buscarTodasPromocoes();
    void adicionarPromocao(Promocao promocao);
    void excluirPromocao(String id);
}
