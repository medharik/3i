package com.tech.examen;

public class Produit implements ChargeAffichable{
private double prix,qte;
private String libelle;

public Produit() {
	// TODO Auto-generated constructor stub
//	this.
}
public Produit(double prix, double qte, String libelle) {
	super();
	this.prix = prix;
	this.qte = qte;
	this.libelle = libelle;
}
@Override
public double calculerCharge() {
	
	return prix*qte;
}
@Override
	public String toString() {
		
		return "libelle ="+libelle+",prix ="+prix+" ,qte = "+qte;
	}

@Override
public void afficher() {
	System.out.println(this);
}
@Override
public void tester() {
	// TODO Auto-generated method stub
	
}


	
	
}
