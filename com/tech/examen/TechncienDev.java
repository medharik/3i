package com.tech.examen;

public class TechncienDev extends Technicien {
private double montantFixe;
private int nombreIntervention;
public  final int TARIF_PAR_INTERVENTION=25;
public TechncienDev() {
	// TODO Auto-generated constructor stub
}

	public TechncienDev(int numero, String specialite, double montantFixe, int nombreIntervention) {
	super(numero, specialite);
	this.montantFixe = montantFixe;
	this.nombreIntervention = nombreIntervention;
}

	protected double getMontantFixe() {
		return montantFixe;
	}

	protected void setMontantFixe(double montantFixe) {
	this.montantFixe = montantFixe;
	}

	protected int getNombreIntervention() {
		return nombreIntervention;
	}

	protected void setNombreIntervention(int nombreIntervention) {
		this.nombreIntervention = nombreIntervention;
	}

	public  double calculerCharge() {
		
		return this.montantFixe+nombreIntervention*TARIF_PAR_INTERVENTION;
	}
	
	

}
