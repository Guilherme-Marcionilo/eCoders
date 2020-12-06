package com.ecoders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoders.model.Categoria;
import com.ecoders.repository.ICategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoriaRepository iCategoriaRepository;
	
	@GetMapping("/all")
	public List<Categoria> findCategoriaAll()
	{
		List<Categoria> cat = iCategoriaRepository.findAll();
		if(cat == null)
			return null;
		return cat;
	}
	
	@GetMapping("/id/{categoriaId}")
	public Categoria findCategoriaById(@PathVariable long categoriaId)
	{
		
		Categoria cat = iCategoriaRepository.findCategoriaById(categoriaId);
		if(cat == null)
			return null;
		return cat;
	}

}
