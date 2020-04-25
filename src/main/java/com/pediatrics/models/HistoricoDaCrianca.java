package com.pediatrics.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "historicos")
public class HistoricoDaCrianca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(targetEntity = MedidasDaCrianca.class)
	@JoinColumn(name = "historico_id", nullable = true)
	private List<MedidasDaCrianca> medidas;
	
	@OneToMany(targetEntity = Vacina.class)
	@JoinColumn(name = "historico_id", nullable = true)
	private List<Vacina> vacinas;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<MedidasDaCrianca> getMedidas() {
		return this.medidas;
	}
	public void setMedidas(List<MedidasDaCrianca> medidas) {
		this.medidas = medidas;
	}
	public List<Vacina> getVacinas() {
		return this.vacinas;
	}
	public void setVacinas(List<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	
}
