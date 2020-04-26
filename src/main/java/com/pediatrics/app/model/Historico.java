package com.pediatrics.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historicos")
public class Historico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne(targetEntity = Crianca.class)
	@JoinColumn(name = "crianca_id")
	private Crianca crianca;
	
	@OneToMany(targetEntity = Medidas.class)
	@JoinColumn(name = "historico_id", nullable = true)
	private List<Medidas> medidas;
	
	@OneToMany(targetEntity = Vacina.class)
	@JoinColumn(name = "historico_id", nullable = true)
	private List<Vacina> vacinas;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Medidas> getMedidas() {
		return this.medidas;
	}
	public void setMedidas(List<Medidas> medidas) {
		this.medidas = medidas;
	}
	public List<Vacina> getVacinas() {
		return this.vacinas;
	}
	public void setVacinas(List<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	
}
