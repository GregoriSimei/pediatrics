package com.pediatrics.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "responsaveis")
public class Responsavel extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(targetEntity = Crianca.class)
	private List<Crianca> crianca;

	public List<Crianca> getCrianca() {
		return this.crianca;
	}

	public void setCrianca(List<Crianca> crianca) {
		this.crianca = crianca;
	}
	
	public void addCrianca(Crianca crianca) {
		this.crianca.add(crianca);
	}

}
