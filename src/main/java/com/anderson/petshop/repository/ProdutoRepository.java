package com.anderson.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.anderson.petshop.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
