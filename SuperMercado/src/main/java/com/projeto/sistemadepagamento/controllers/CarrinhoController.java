package com.projeto.sistemadepagamento.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.sistemadepagamento.entities.Carrinho;
import com.projeto.sistemadepagamento.services.CarrinhoService;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    private CarrinhoService carrinhoService;

    @GetMapping
    public Carrinho getCarrinho() {
        return carrinhoService.getCarrinho();
    }

    // Outros métodos conforme necessário
}
