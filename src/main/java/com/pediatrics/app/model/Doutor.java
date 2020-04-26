package com.pediatrics.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "doutores")
public class Doutor extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JoinColumn(nullable = false)
	private String especializacao;
	
	@JoinColumn(nullable = false)
	private String crm;
	
	public String getEspecializacao() {
		return this.especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public String getCrm() {
		return this.crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}

}
