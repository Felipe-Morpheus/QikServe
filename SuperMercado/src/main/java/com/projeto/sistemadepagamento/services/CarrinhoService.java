package com.projeto.sistemadepagamento.services;

import com.projeto.sistemadepagamento.entities.Carrinho;
import com.projeto.sistemadepagamento.entities.ItemCarrinho;

public interface CarrinhoService {
    Carrinho getCarrinho();
    void adicionarItemAoCarrinho(ItemCarrinho item);
    void removerItemDoCarrinho(String idProduto);
    void limparCarrinho();
    int calcularTotal();
}
