package com.projeto.sistemadepagamento.entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itens = new ArrayList<>();

	public Carrinho(List<ItemCarrinho> itens) {
		super();
		this.itens = itens;
	}

	public List<ItemCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItemCarrinho> itens) {
		this.itens = itens;
	}

    
}