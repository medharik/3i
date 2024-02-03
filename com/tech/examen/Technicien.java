package com.tech.examen;

public abstract class Technicien  implements Chargeable, Affichable{
private int numero;
private String specialite;
//Lambok
@Override
	public  void afficher() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Technicien de specialite : "+specialite+", de numero "+numero;
	}
public Technicien() {
	// TODO Auto-generated constructor stub
}
 
public Technicien(int numero, String specialite) {
	super();
	this.numero = numero;
	this.specialite = specialite;
}

protected int getNumero() {
	return numero;
}

protected void setNumero(int numero) {
	this.numero = numero;
}

protected String getSpecialite() {
	return specialite;
}

protected void setSpecialite(String specialite) {
	this.specialite = specialite;
}

public  abstract double calculerCharge();


public static void main(String[] args) {
//	Technicien t=new Technicien() ;
}

}
