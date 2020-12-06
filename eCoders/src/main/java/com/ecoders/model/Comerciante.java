package com.ecoders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "comerciante")
public class Comerciante {

	public Comerciante() {}
	
	@Id
	@Column(name = "comerciante_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long comercianteId;
	
	@Column(name = "comerciante_nome")
	private String comercianteNome;
	
	@Column(name = "comerciante_descricao")
	private String comercianteDescricao;
	
	@Column(name = "comerciante_foto")
	private String comercianteFoto;
	
	@Column(name = "comerciante_link")
	private String comercianteLink;
	
	@Column(name = "comerciante_end_regiao")
	private String comercianteEndRegiao;
	
	@Column(name = "comerciante_end_logradouro")
	private String comercianteEndLogradouro;
	
	@Column(name = "comerciante_end_cidade")
	private String comercianteEndCidade;
	
	@Column(name = "comerciante_end_bairro")
	private String comercianteEndBairro;
	
	@Column(name = "comerciante_end_numero")
	private String comercianteEndNumero;
	
	@Column(name = "comerciante_end_complemento")
	private String comercianteEndComplemento;
	
	@Column(name = "comerciante_end_uf")
	private String comercianteEndUF;
	
	@ManyToOne	
	@JsonIgnore
	private Categoria categoria;

	public long getComercianteId() {
		return comercianteId;
	}

	public void setComercianteId(long comercianteId) {
		this.comercianteId = comercianteId;
	}

	public String getComercianteNome() {
		return comercianteNome;
	}

	public void setComercianteNome(String comercianteNome) {
		this.comercianteNome = comercianteNome;
	}

	public String getComercianteDescricao() {
		return comercianteDescricao;
	}

	public void setComercianteDescricao(String comercianteDescricao) {
		this.comercianteDescricao = comercianteDescricao;
	}

	public String getComercianteFoto() {
		return comercianteFoto;
	}

	public void setComercianteFoto(String comercianteFoto) {
		this.comercianteFoto = comercianteFoto;
	}

	public String getComercianteLink() {
		return comercianteLink;
	}

	public void setComercianteLink(String comercianteLink) {
		this.comercianteLink = comercianteLink;
	}

	public String getComercianteEndRegiao() {
		return comercianteEndRegiao;
	}

	public void setComercianteEndRegiao(String comercianteEndRegiao) {
		this.comercianteEndRegiao = comercianteEndRegiao;
	}

	public String getComercianteEndLogradouro() {
		return comercianteEndLogradouro;
	}

	public void setComercianteEndLogradouro(String comercianteEndLogradouro) {
		this.comercianteEndLogradouro = comercianteEndLogradouro;
	}

	public String getComercianteEndCidade() {
		return comercianteEndCidade;
	}

	public void setComercianteEndCidade(String comercianteEndCidade) {
		this.comercianteEndCidade = comercianteEndCidade;
	}

	public String getComercianteEndBairro() {
		return comercianteEndBairro;
	}

	public void setComercianteEndBairro(String comercianteEndBairro) {
		this.comercianteEndBairro = comercianteEndBairro;
	}

	public String getComercianteEndNumero() {
		return comercianteEndNumero;
	}

	public void setComercianteEndNumero(String comercianteEndNumero) {
		this.comercianteEndNumero = comercianteEndNumero;
	}

	public String getComercianteEndComplemento() {
		return comercianteEndComplemento;
	}

	public void setComercianteEndComplemento(String comercianteEndComplemento) {
		this.comercianteEndComplemento = comercianteEndComplemento;
	}

	public String getComercianteEndUF() {
		return comercianteEndUF;
	}

	public void setComercianteEndUF(String comercianteEndUF) {
		this.comercianteEndUF = comercianteEndUF;
	}
	
}
