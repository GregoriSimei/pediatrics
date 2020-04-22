package com.pediatrics.models;

import javax.persistence.Entity;

@Entity
public class Crianca extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	private Responsavel responsavel;

	public Responsavel getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
}
