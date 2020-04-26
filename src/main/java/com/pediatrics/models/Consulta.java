package com.pediatrics.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@JoinColumn(nullable = false)
	private String data;
	
	@JoinColumn(nullable = false)
	private String hora;
	
	@ManyToOne(targetEntity = Crianca.class)
	@JoinColumn(name = "crianca_id")
	private Crianca crianca;
	
	@ManyToOne(targetEntity = Doutor.class)
	@JoinColumn(name = "doutor_id")
	private Doutor doutor;
	
	@JoinColumn(nullable = false)
	private boolean situacao;
	
	@OneToOne(targetEntity = Pagamento.class)
	@JoinColumn(nullable = false)
	private Pagamento pagamento;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return this.hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Crianca getCrianca() {
		return this.crianca;
	}
	public void setCrianca(Crianca crianca) {
		this.crianca = crianca;
	}
	public Doutor getDoutor() {
		return this.doutor;
	}
	public void setDoutor(Doutor doutor) {
		this.doutor = doutor;
	}
	public boolean isSituacao() {
		return this.situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Pagamento getPagamento() {
		return this.pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	
}
