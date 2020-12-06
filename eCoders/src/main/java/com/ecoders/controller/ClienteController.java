package com.ecoders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoders.model.Cliente;
import com.ecoders.repository.IClienteRepository;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private IClienteRepository iClienteRepository;
	
	@GetMapping("/all")
	public List<Cliente> findClienteAll() 
	{		
		List<Cliente> cli = iClienteRepository.findAll();
		if(cli == null)
			return null;
		return cli;
	}		

}
