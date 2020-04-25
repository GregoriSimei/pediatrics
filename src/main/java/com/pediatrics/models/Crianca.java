package com.pediatrics.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "criancas")
public class Crianca extends Pessoa{
	
	@ManyToOne(targetEntity = Responsavel.class)
	private Responsavel responsavel;
	
	@OneToOne(targetEntity = HistoricoDaCrianca.class)
	private HistoricoDaCrianca historico;

	public HistoricoDaCrianca getHistorico() {
		return historico;
	}

	public void setHistorico(HistoricoDaCrianca historico) {
		this.historico = historico;
	}

	public Responsavel getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
}
