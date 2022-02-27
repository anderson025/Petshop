package com.anderson.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.petshop.domain.Categoria;
import com.anderson.petshop.repository.CategoriaRepository;
import com.anderson.petshop.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado. ID:" + id + ", Tipo:" + Categoria.class.getName()));
	}
}
