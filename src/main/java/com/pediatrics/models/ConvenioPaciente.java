package com.pediatrics.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "convenios")
public class ConvenioPaciente{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@JoinColumn(nullable = false)
	private String identificador;
	
	@JoinColumn(nullable = false)
	private String empresa;
	
	@OneToOne(targetEntity = Crianca.class)
	@JoinColumn(name = "crianca_id")
	private Crianca crianca;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEmpresa() {
		return this.empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Crianca getCrianca() {
		return this.crianca;
	}
	public void setCrianca(Crianca crianca) {
		this.crianca = crianca;
	}
	
}
