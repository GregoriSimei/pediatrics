package com.pediatrics.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "encaminhamentos")
public class Encaminhamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@JoinColumn(nullable = false)
	private String especializacao;
	
	@JoinColumn(nullable = false)
	private String localizacao;
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEspecializacao() {
		return this.especializacao;
	}
	
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public String getLocalizacao() {
		return this.localizacao;
	}
	
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
}
