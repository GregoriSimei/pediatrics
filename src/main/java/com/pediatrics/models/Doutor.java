package com.pediatrics.models;

public class Doutor extends Pessoa{
	
	private String especializacao;
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
