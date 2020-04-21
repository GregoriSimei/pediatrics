package com.pediatrics.models;

import java.util.ArrayList;

public class HistoricoDaCrianca {
	
	private long id;
	private ArrayList<MedidasDaCrianca> medidas;
	private ArrayList<Vacina> vacinas;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ArrayList<MedidasDaCrianca> getMedidas() {
		return this.medidas;
	}
	public void setMedidas(ArrayList<MedidasDaCrianca> medidas) {
		this.medidas = medidas;
	}
	public ArrayList<Vacina> getVacinas() {
		return this.vacinas;
	}
	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	
}
