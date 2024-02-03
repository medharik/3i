package com.tech.examen;

public class TechnicienReseaux extends Technicien {
private double nombreHeureTravail,tarifHoraire;
public final double PCT_HEURE_SUP=40;

	@Override
	public  double calculerCharge() {
		double salaire=0;
		if (nombreHeureTravail<=35) {
			salaire=nombreHeureTravail*tarifHoraire;
		} else {
			salaire=35*tarifHoraire+(nombreHeureTravail-35)*tarifHoraire*(1+PCT_HEURE_SUP/100);

		}
		return salaire;
	}

	public TechnicienReseaux() {
		// TODO Auto-generated constructor stub
	}
	public TechnicienReseaux(int numero, String specialite, double nombreHeureTravail, double tarifHoraire) {
		super(numero, specialite);
		this.nombreHeureTravail = nombreHeureTravail;
		this.tarifHoraire = tarifHoraire;
	}

}
