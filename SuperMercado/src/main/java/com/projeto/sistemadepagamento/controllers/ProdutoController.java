package com.projeto.sistemadepagamento.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.sistemadepagamento.entities.Produto;
import com.projeto.sistemadepagamento.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	private ProdutoService produtoService;

	@GetMapping("/{id}")
	public Produto buscarProdutoPorId(@PathVariable String id) {
		return produtoService.buscarProdutoPorId(id);
	}

	// Outros métodos conforme necessário
}