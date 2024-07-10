package com.generation.gamerz.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
