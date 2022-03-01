package com.anderson.petshop.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.petshop.domain.Servico;
import com.anderson.petshop.service.ServicoService;

@RestController
@RequestMapping(value = "/servicos")
public class ServicoResource {
	
	@Autowired
	ServicoService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Servico obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	/*
	 * Implementado endpoint para localizar todas as Servicos
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Servico> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}

}
