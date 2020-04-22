package com.pediatrics.models;

import java.util.ArrayList;

public class Prontuario {
	
	private long id;
	private Crianca crianca;
	private ArrayList<Encaminhamento> encaminhamentos;
	private ArrayList<Medicamento> medicamentos;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Crianca getCrianca() {
		return this.crianca;
	}
	public void setCrianca(Crianca crianca) {
		this.crianca = crianca;
	}
	public ArrayList<Encaminhamento> getEncaminhamentos() {
		return this.encaminhamentos;
	}
	public void setEncaminhamentos(ArrayList<Encaminhamento> encaminhamentos) {
		this.encaminhamentos = encaminhamentos;
	}
	public ArrayList<Medicamento> getMedicamentos() {
		return this.medicamentos;
	}
	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
}
