package com.pediatrics.models;

public class Child extends Person{

	private Client responsible;

	public Client getResponsible() {
		return responsible;
	}

	public void setResponsible(Client responsible) {
		this.responsible = responsible;
	}
	
}
