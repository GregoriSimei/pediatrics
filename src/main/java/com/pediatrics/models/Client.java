package com.pediatrics.models;

import java.util.ArrayList;

public class Client extends Person{

	private ArrayList<Child> child;

	public ArrayList<Child> getChild() {
		return child;
	}

	public void setChild(ArrayList<Child> child) {
		this.child = child;
	}
}
