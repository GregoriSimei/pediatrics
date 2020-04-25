package com.pediatrics.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "historicos")
public class HistoricoDaCrianca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToMany
	private Set<MedidasDaCrianca> medidas;
	@OneToMany
	private Set<Vacina> vacinas;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Set<MedidasDaCrianca> getMedidas() {
		return this.medidas;
	}
	public void setMedidas(Set<MedidasDaCrianca> medidas) {
		this.medidas = medidas;
	}
	public Set<Vacina> getVacinas() {
		return this.vacinas;
	}
	public void setVacinas(Set<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	
}
