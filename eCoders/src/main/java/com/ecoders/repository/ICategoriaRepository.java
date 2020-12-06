package com.ecoders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecoders.model.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria,Long	>{
	
	@Query(nativeQuery = true,value = "select * from categoria where categoria_id = ?1")
	Categoria findCategoriaById(long categoriaId);

}
