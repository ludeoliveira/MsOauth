package com.aulas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.entidades.Pedido;
import com.aulas.interfaces.ProdutoFeignClient;
import com.aulas.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	PedidoRepository repo;
	
	@Autowired
	ProdutoFeignClient produtoFeignClient;
	
	public Pedido salvar(Pedido pedido) {
		Pedido p = repo.save(pedido);
//		atualizar o produto
		produtoFeignClient.atualizarEstoque((long)pedido.getIdproduto(), pedido.getQuantidade());
		return p;
	}
}
