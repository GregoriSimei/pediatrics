package com.pediatrics.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pagamentos")
public class Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
	
	@ManyToOne(targetEntity = Convenio.class)
	@JoinColumn(name = "convenio_id", nullable = true)
	private Convenio convenio;
	
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
	public Convenio isConvenio() {
		return this.convenio;
	}
	public void setConvenio(Convenio convenio) {
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

