package com.pediatrics.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pagamentos")
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@JoinColumn(nullable = false)
	private double valor;
	
	@JoinColumn(name = "convenio")
	@JoinColumn(nullable = false)
	private boolean infoConvenio;
	
	@JoinColumn(nullable = false)
	private String data;
	
	@ManyToOne(targetEntity = ConvenioPaciente.class)
	@JoinColumn(name = "convenio_id", nullable = true)
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

