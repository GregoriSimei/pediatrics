package com.pediatrics.models;

public class ConvenioPaciente {

	private long id;
	private String identificador;
	private String empresa;
	private Crianca crianca;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Crianca getCrianca() {
		return crianca;
	}
	public void setCrianca(Crianca crianca) {
		this.crianca = crianca;
	}
	
}
