package com.pediatrics.models;

import java.util.ArrayList;

public class MedicalRecord {
	
	private Child child;
	private ArrayList<MedicalReferral> medicalReferrals;
	private ArrayList<Medicine> medicines;
	
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	public ArrayList<MedicalReferral> getMedicalReferrals() {
		return medicalReferrals;
	}
	public void setMedicalReferrals(ArrayList<MedicalReferral> medicalReferrals) {
		this.medicalReferrals = medicalReferrals;
	}
	public ArrayList<Medicine> getMedicines() {
		return medicines;
	}
	public void setMedicines(ArrayList<Medicine> medicines) {
		this.medicines = medicines;
	}
	
}
