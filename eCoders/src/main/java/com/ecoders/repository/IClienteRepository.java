package com.ecoders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecoders.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
