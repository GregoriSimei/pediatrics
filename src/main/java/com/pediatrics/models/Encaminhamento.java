package com.pediatrics.models;

public class Encaminhamento {
	
	private long id;
	private String doutor;
	private String especializacao;
	private String localizacao;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDoutor() {
		return this.doutor;
	}
	public void setDoutor(String doutor) {
		this.doutor = doutor;
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
