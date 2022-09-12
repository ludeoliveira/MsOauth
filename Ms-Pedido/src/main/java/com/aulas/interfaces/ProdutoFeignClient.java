package com.aulas.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name= "msproduto", url = "localhost:8001", path="/")
public interface ProdutoFeignClient {
//	esta assinatura é igual a assinatura do metodo put no produto controller
	@PutMapping("/produto")
	public ResponseEntity<String> atualizarEstoque(@RequestParam("idproduto") Long idproduto, @RequestParam("qtde") float qtde);
}
