package com.projeto.sistemadepagamento.entities;

public class Promocao {
    private String id;
    private String descricao;
    private int descontoEmCentavos;
    
	public Promocao(String id, String descricao, int descontoEmCentavos) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.descontoEmCentavos = descontoEmCentavos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDescontoEmCentavos() {
		return descontoEmCentavos;
	}

	public void setDescontoEmCentavos(int descontoEmCentavos) {
		this.descontoEmCentavos = descontoEmCentavos;
	}


}
