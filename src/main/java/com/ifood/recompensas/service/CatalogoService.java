package com.ifood.recompensas.service;

import com.ifood.recompensas.domain.Produto;
import com.ifood.recompensas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogoService {

    private final List<Produto> produtos = new ArrayList<>();
    private final ProdutoRepository produtoRepository;

    @Autowired
    public CatalogoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    @Transactional
    public Produto add(String nome, String descricao, String pontuacao) {
        Produto p = new Produto(nome, descricao, pontuacao);
        produtos.add(p);
        produtoRepository.save(p);
        return p;
    }

    public Page<Produto> listAll() {
        return produtoRepository.findAll(PageRequest.of(0,20));
    }
}
