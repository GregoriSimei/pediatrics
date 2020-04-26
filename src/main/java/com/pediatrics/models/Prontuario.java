package com.pediatrics.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prontuarios")
public class Prontuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(targetEntity = Crianca.class)
	private Crianca crianca;
	
	@ManyToMany(targetEntity = Encaminhamento.class)
	private List<Encaminhamento> encaminhamentos;
	
	@ManyToMany(targetEntity = Medicamento.class)
	private List<Medicamento> medicamentos;
	
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
	public Set<Encaminhamento> getEncaminhamentos() {
		return this.encaminhamentos;
	}
	public void setEncaminhamentos(Set<Encaminhamento> encaminhamentos) {
		this.encaminhamentos = encaminhamentos;
	}
	public Set<Medicamento> getMedicamentos() {
		return this.medicamentos;
	}
	public void setMedicamentos(Set<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
}
