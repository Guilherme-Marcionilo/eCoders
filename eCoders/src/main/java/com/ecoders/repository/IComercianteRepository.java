package com.ecoders.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecoders.model.Comerciante;

public interface IComercianteRepository extends JpaRepository<Comerciante, Long>{

	@Query(nativeQuery = true,value = "select * from comerciante where comerciante_id = ?1")
	Comerciante findComercianteById(long comercianteId);
	
	@Query(nativeQuery = true,value = "select * from comerciante where categoria_categoria_id = ?1")
	List<Comerciante> findComerciantesByCategoria(long categoriaId);
	
	@Query(nativeQuery = true,value = "select * from comerciante where comerciante_end_regiao like ?1")
	List<Comerciante> findComerciantesByRegiao(String regiao);
	
}
