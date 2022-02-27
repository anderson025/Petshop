package com.anderson.petshop.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anderson.petshop.domain.Categoria;
import com.anderson.petshop.repository.CategoriaRepository;

@Component
public class PopulaDados {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@PostConstruct
	public void cadastrar() {
		Categoria cat1 = new Categoria(null,"Alimento");
		Categoria cat2 = new Categoria(null,"Cosméticos");
		Categoria cat3 = new Categoria(null,"Remédio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
	}
}
