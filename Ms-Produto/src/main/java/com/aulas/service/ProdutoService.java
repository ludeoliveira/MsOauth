package com.aulas.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.entidade.Produto;
import com.aulas.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository repo;
	
	public List<Produto> consultaProdutos() {
		return repo.findAll(); 
	}
	
	public Produto atualizaEstoque(Long idproduto, float qtde) {
		Optional<Produto> obj = repo.findById(idproduto);
		Produto p = obj.orElseThrow(() -> new EntityNotFoundException("Produto não existe"));
		p.setEstoque(p.getEstoque() - qtde);
		return repo.save(p);
	}
}
