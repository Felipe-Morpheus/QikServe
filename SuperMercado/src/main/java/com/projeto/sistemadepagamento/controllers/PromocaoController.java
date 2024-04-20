package com.projeto.sistemadepagamento.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.sistemadepagamento.entities.Promocao;
import com.projeto.sistemadepagamento.services.PromocaoService;

@RestController
@RequestMapping("/promocoes")
public class PromocaoController {

    private PromocaoService promocaoService;

    @GetMapping("/{id}")
    public Promocao buscarPromocaoPorId(@PathVariable String id) {
        return promocaoService.buscarPromocaoPorId(id);
    }

    // Outros métodos conforme necessário
}
