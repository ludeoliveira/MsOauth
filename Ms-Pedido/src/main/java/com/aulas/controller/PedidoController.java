package com.aulas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulas.entidades.Pedido;
import com.aulas.service.PedidoService;

@RestController
@RequestMapping("/")
public class PedidoController {
	
	@Autowired
	PedidoService service;

	@PostMapping("/pedido")
	public ResponseEntity<Pedido> salvar(@RequestBody Pedido pedido) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(pedido));
	}

}