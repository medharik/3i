package base1;

import java.util.Scanner;

public class Superette {
public static void main(String[] args) {
	Scanner clavier=new Scanner(System.in);
	String [] categorie= {"Produit ELetro","Produit alim","produit pharm"};
	String produit[][]=new String[categorie.length][];
	produit[0]=new String[3];
	produit[1]=new  String[2];
	produit[2]=new String[1];
	double [][]prix= new double[categorie.length][];
	int qte[][]=new int[categorie.length][]; 
	for (int i = 0; i < prix.length; i++) {
		prix[i]=new double[produit[i].length];
		qte[i]=new int[produit[i].length];
	}
//	for (String  cat : categorie) {
//		System.out.println("la categorie "+cat);
//		
//	}
	for (int i = 0; i < categorie.length; i++) {
		System.out.println("la categorie "+categorie[i]);
		
		for (int j = 0; j < produit[i].length; j++) {
				System.out.println("Entrer produit "+(j+1));
				produit[i][j]=clavier.nextLine();
				
		}
		

		
	}
	
	
	for (int i = 0; i < produit.length; i++) {
//		Wrapper classes ou classe enveloppe
//		 double o=12;
//		 Double d=new Double(o);
		
		
		for (int j = 0; j < produit[i].length; j++) {
			
			System.out.println("Entrer le prix du produit "+produit[i][j]);
//			String p=clavier.next();
//			prix[i][j]=Double.parseDouble(p);//"12"=>12 "test"
			prix[i][j]=clavier.nextDouble();
		
		}
		
	
	}
//	{
//		double x=10;
//			{
//			double y=9;
//			x=7;
//			}
//			System.out.println("x est "+x);
//			System.out.println("y est "+y);
//	}
	
	
	//saisie des qte 
	

	int age=0;
	String reponse="";
	do {
		

		for (int i = 0; i < qte.length; i++) {
			for (int j = 0; j < produit[i].length; j++) {
				System.out.println("Entrer la qte du produit "+produit[i][j]);
				qte[i][j]=clavier.nextInt();
			
			}
		}
		
		System.out.println("continuer ? oui/non");
		 reponse=clavier.next();
		
	} while (reponse.equals("oui"));
}
}
