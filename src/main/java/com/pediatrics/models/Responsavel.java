package com.pediatrics.models;

import java.util.ArrayList;

public class Responsavel extends Pessoa{

	private long id;
	private ArrayList<Crianca> crianca;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<Crianca> getCrianca() {
		return this.crianca;
	}

	public void setCrianca(ArrayList<Crianca> crianca) {
		this.crianca = crianca;
	}

}
