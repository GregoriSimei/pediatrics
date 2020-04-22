package com.pediatrics.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vacina implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String tipo;
	private String data;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
