package com.ecoders.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "categoria")
public class Categoria {

	public Categoria() {}
	
	@Id
	@Column(name = "categoria_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoriaId;
	
	@Column(name = "categoria_nome")
	private String categoriaNome;
	
	@Column(name = "categoria_descricao")
	private String categoriaDescricao;
	
	@OneToMany(mappedBy = "categoria",cascade = CascadeType.ALL)	
	private List<Comerciante> comerciante;

	public long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getCategoriaNome() {
		return categoriaNome;
	}

	public void setCategoriaNome(String categoriaNome) {
		this.categoriaNome = categoriaNome;
	}

	public String getCategoriaDescricao() {
		return categoriaDescricao;
	}

	public void setCategoriaDescricao(String categoriaDescricao) {
		this.categoriaDescricao = categoriaDescricao;
	}
			
	
}
