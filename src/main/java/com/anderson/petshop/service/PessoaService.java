package com.anderson.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.petshop.domain.Pessoa;
import com.anderson.petshop.repository.PessoaRepository;
import com.anderson.petshop.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repo;
	
	public Pessoa find(Integer id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado. ID:" + id + ", Tipo:" + Pessoa.class.getName()));
	}
}
