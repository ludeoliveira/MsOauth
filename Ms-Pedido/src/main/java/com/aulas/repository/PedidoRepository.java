package com.aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulas.entidades.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
