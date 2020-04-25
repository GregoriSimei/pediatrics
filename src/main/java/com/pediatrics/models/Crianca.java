package com.pediatrics.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "criancas")
public class Crianca extends Pessoa{
	
	@ManyToOne(targetEntity = Responsavel.class)
	private Responsavel responsavel;

	public Responsavel getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
}
