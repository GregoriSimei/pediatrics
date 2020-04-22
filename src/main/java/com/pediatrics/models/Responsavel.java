package com.pediatrics.models;

import java.util.ArrayList;

public class Responsavel extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Crianca> crianca;

	public ArrayList<Crianca> getCrianca() {
		return this.crianca;
	}

	public void setCrianca(ArrayList<Crianca> crianca) {
		this.crianca = crianca;
	}

}
