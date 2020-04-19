package com.pediatrics.models;

import java.util.ArrayList;

public class ChildHistory {
	
	private ArrayList<Measure> measeres;
	private ArrayList<Vaccine> vacines;
	
	public ArrayList<Measure> getMeaseres() {
		return measeres;
	}
	public void setMeaseres(ArrayList<Measure> measeres) {
		this.measeres = measeres;
	}
	public ArrayList<Vaccine> getVacines() {
		return vacines;
	}
	public void setVacines(ArrayList<Vaccine> vacines) {
		this.vacines = vacines;
	}
	
}
