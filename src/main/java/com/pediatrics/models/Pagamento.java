package com.pediatrics.models;

public class Pagamento {

	private long id;
	private double valor;
	private boolean infoConvenio;
	private String data;
	private ConvenioPaciente convenio;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public ConvenioPaciente isConvenio() {
		return this.convenio;
	}
	public void setConvenio(ConvenioPaciente convenio) {
		this.convenio = convenio;
	}
	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public boolean getInfoConvenio() {
		return this.infoConvenio;
	}
	public boolean setInfoConvenio(boolean infoConvenio) {
		boolean retorno = false;
		if(this.infoConvenio) {
			this.infoConvenio = infoConvenio;
			retorno = true;
		}
		return retorno;
	}

}

