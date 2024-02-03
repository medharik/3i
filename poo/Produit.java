package poo;

public class Produit {
//attributs/fields / properties
private  	String libelle;
private 	double prix;
private 	int qteStock;
//constructeur : Methode speciale de role principal : initialiser les attributs
//en java , un constructeur est une methode qui porte le meme nom de la classe et ne retourne pas de valeur
public Produit() {
super();
}
public Produit(String libelle,double prix,int qteStock) {
	this.libelle=libelle;
	this.prix=prix;
	this.qteStock=qteStock;
}

public Produit(String libelle,double prix) {
	this.libelle=libelle;
	this.prix=prix;

}



	public String getLibelle() {
	return libelle.toUpperCase();
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public int getQteStock() {
	return qteStock;
}
public void setQteStock(int qteStock) {
	if(qteStock>0)
	this.qteStock = qteStock;
	else System.out.println("ERreur de qte en stock <0");
}
	//ENCAPSULATION : (protection)
	// 1 des principes de la poo
// 2  comment : en declarant private (protected ) les attributs et n'autoriser leurs ,acces que par des
//getters et des setters (public , protected)
	//setPrix(9000)
	public void setPrix(double prix) throws Exception {
		if(prix>=0) {
		this.prix = prix;	
		}else {
			throw new Exception("Erreur prix<0");
		}
		
	}
	public double getPrix() {
		return prix;
	}
	
// methodes 
protected	 void afficher() {
System.out.println(this.libelle+" "+prix+" , qte en stock "+this.qteStock);
	}
// surchage de afficher (overload)
protected	 void afficher(boolean maj) {
	if (maj) {
		System.out.println(this.libelle.toUpperCase()+" "+prix+" , qte en stock "+this.qteStock);

	}else {
		System.out.println(this.libelle+" "+prix+" , qte en stock "+this.qteStock);
		
	}
	}
//ajouter(2.0,4,8);
	 private int ajouter(int a , int b) {
		return a+b;

	}
	 private int ajouter(int a , int b, int c) {
		return a+b+c;

	}
	 private double ajouter(double  a , int b, int c) {
		return a+b+c;

	}
	void entreeEnStock(int qteEntree){
		if (qteEntree>=0) {
		qteStock+=qteEntree;	
		}
		 
		
	 }
	void sortieEnStock(int qteSortie){
		if ( qteSortie>0 && qteSortie<=qteStock ) {
		qteStock-=qteSortie;	
		}
		 
		
	 }
	boolean verifierDipoStock(int qte){
		return qte>0 && qte<=qteStock;
	 }
	
	double  vendre(int qte) {
		double ttc=0;
	if (verifierDipoStock(qte)) {
		 ttc=prix*qte;
		sortieEnStock(qte);
		
	} else {
		
System.out.println("STock insuffisant");

	}	
return ttc;
	}
}
