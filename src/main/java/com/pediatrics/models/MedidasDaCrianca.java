package com.pediatrics.models;

public class MedidasDaCrianca {

	private long id;
	private double cranio;
	private double altura;
	private double peso;
	private String data;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getCranio() {
		return this.cranio;
	}
	public void setCranio(double cranio) {
		this.cranio = cranio;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}