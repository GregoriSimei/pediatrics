package com.pediatrics.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "responsaveis")
public class Responsavel extends Pessoa{
	
	@OneToMany(targetEntity = Crianca.class)
	private List<Crianca> crianca;

	public List<Crianca> getCrianca() {
		return this.crianca;
	}

	public void setCrianca(List<Crianca> crianca) {
		this.crianca = crianca;
	}

}
