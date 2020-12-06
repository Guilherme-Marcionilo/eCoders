package com.ecoders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoders.model.Comerciante;
import com.ecoders.repository.IComercianteRepository;

@RestController
@RequestMapping("/comerciante")
public class ComercianteController {

	@Autowired
	private IComercianteRepository iComercianteRepository;
	
	@GetMapping("/all")
	public List<Comerciante> findComercianteAll() 
	{		
		List<Comerciante> com = iComercianteRepository.findAll();
		if(com == null)
			return null;
		return com;
	}
	
	@GetMapping("/id/{comercianteId}")
	public Comerciante findComercianteById(@PathVariable long comercianteId) 
	{
		Comerciante com = iComercianteRepository.findComercianteById(comercianteId);
		if(com == null)
			return null;
		return com;
	}
	
	@GetMapping("/cat/{categoriaId}")
	public List<Comerciante> findComerciantesByCategoria(@PathVariable long categoriaId) 
	{
		List<Comerciante> com = iComercianteRepository.findComerciantesByCategoria(categoriaId);
		if(com == null)
			return null;
		return com;
	}
	
	@GetMapping("/regiao/{categoriaRegiao}")
	public List<Comerciante> findComerciantesByRegiao(@PathVariable String categoriaRegiao) 
	{
		List<Comerciante> com = iComercianteRepository.findComerciantesByRegiao(categoriaRegiao);
		if(com == null)
			return null;
		return com;
	}
	
	@PostMapping("")
	public Comerciante saveComerciante(@RequestBody Comerciante comerciante) 
	{
		return iComercianteRepository.save(comerciante);
	}
	
	@DeleteMapping("/{comercianteId}")
	public void delComerciante(@PathVariable long comercianteId)
	{
		iComercianteRepository.deleteById(comercianteId);;
	}

}
