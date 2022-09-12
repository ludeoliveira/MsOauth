package com.aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulas.entidade.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
