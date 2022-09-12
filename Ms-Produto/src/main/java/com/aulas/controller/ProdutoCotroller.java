package com.aulas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aulas.entidade.Produto;
import com.aulas.service.ProdutoService;

@RestController
@RequestMapping("/")
public class ProdutoCotroller {
	@Autowired 
	ProdutoService service;
	
	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> consultar() { 
		return ResponseEntity.status(HttpStatus.OK).body(service.consultaProdutos());
	}
	
	@PutMapping("/produto")
	public ResponseEntity<String> atualizarEstoque(@RequestParam("idproduto") Long idproduto, @RequestParam("qtde") float qtde){
		service.atualizaEstoque(idproduto, qtde);
		return ResponseEntity.status(HttpStatus.OK).body("Estoque atualizado com sucesso");
	}
	
  }
