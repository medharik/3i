package base1;

import java.util.Scanner;

public class ExerciceTableaux {
public static void main(String[] args) {
	
	Scanner clavier = new Scanner(System.in);
	System.out.println("Entrer votre age ");
	int age =clavier.nextInt();
	
	
	System.out.println("Votre taille en m ");
	double taille=clavier.nextDouble();
	clavier.nextLine();
	System.out.println("age est "+age);
	System.out.println("taille est "+taille);
	
	
	System.out.println("Entrer votre prenom ");
	String nomcomplet=clavier.nextLine();
	String prenom=nomcomplet.split(" ")[0];
	
	String nom=nomcomplet.split(" ")[1];
	System.out.println("prenom est "+prenom);
	
	System.out.println("nom est "+nom);
	
	System.out.println("entrer les prix ");
	String lignePrix=clavier.nextLine();
String valeurs []=lignePrix.split(" ");

for (int i = 0; i < valeurs.length; i++) {
	double prix =Double.parseDouble(valeurs[i]) ;
	System.out.println(" prix "+(i+1)+" est "+prix);
}
	
	String categeorie[]= {"Produit eletronique","produit alimentaire","produit pharma"};
	String [][]produit=new String[categeorie.length][];
	 produit[0]=new String [3];
	 produit[1]=new String [2];
	 produit[2]=new String [4];
	 for (int i = 0; i < produit.length; i++) {
		 System.out.println("veuillez saisir "+ produit[i].length+" les produits de la categorie  : "+categeorie[i]);
		for (int j = 0; j < produit[i].length; j++) {
			System.out.println("Saisir le libelle du produit numero "+(j+1));
			produit[i][j]=clavier.next();
		}
	}
	 
}
}
