package poo;

public class Personne {

	  String nom,prenom,dateNaissance,age;
	
//si on definit pas un constructeur, java en creer	 un par defaut
//un constrcuteur doit toujours appeler le constructeur superieur
public Personne() {
	super();
}
	 void afficher() {
		System.out.println(nom+" "+prenom+", date de naissance "+dateNaissance);

	}

	public Personne(String nom, String prenom, String dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
}
