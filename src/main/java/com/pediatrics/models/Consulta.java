package com.pediatrics.models;


public class Consulta {
 
	private long id;
	private String data;
	private String hora;
	private Crianca crianca;
	private Doutor doutor;
	private boolean situacao;
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
