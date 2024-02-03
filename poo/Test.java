package poo;

public class Test {
public static void main(String[] args) {
	
	//instancier (new) la classe Produit pour creer un objet 
	Produit produitx=new ProduitElectronique();
	Produit dell=new Produit("dell d8", 8000, 10);
	
	ProduitAlimenantaire yaourth=new ProduitAlimenantaire("yaghourt", 10, 20, "01/01/2024");
	ProduitElectronique pe=new ProduitElectronique("hp dv 7", 4500, 2, "core i5 , 500GO DD");

	Produit produit[]= {pe,yaourth};
	for (int i = 0; i < produit.length; i++) {
	produit[i].afficher();
	
	}
	Personne ali=new Personne("alami", "ali", "01/01/1990");
	ali.afficher();// polymorphisme ad-hoc
//	ProduitElectronique pe2=produitx; // downcasting : n'est pas autorise(par defaut)
//	Produit px=yaourth;// upcasting est TJRS autorise
//	Produit r=new ProduitAlimenantaire();
//	Produit f=new ProduitElectronique();
	if (produitx instanceof ProduitAlimenantaire) {
			ProduitAlimenantaire pa=(ProduitAlimenantaire) produitx;
			pa.afficherDateExpiration();
//			produitx.
			

	}
	
	System.out.println("___________________________");
	
	
	
//	
//	Produit acer =new Produit("acer a6", 6000);
//	dell.afficher();
//	
//	hp.afficher();
//	hp.setLibelle("hp dv 8");
//	try {
//		//modificateurs d'acces = visibility = portee : public,private , protected ou default(package)
//		hp.setPrix(8000);
//		hp.setPrix(-9000);
//	} catch (Exception e) {
//
//		System.out.println(e.getMessage());
//	}
//	System.out.println("le prix est "+hp.getPrix());
//	hp.setQteStock(10);
//	hp.afficher();
//	double ttc=hp.vendre(9);
//	System.out.println("ttc est "+ttc+"DHS");
//	hp.afficher();
//	ProduitAlimenantaire lait=new ProduitAlimenantaire();
//	lait.setLibelle("lait UHT");
//	try {
//		lait.setPrix(10);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
////	lait.
//	lait.setQteStock(10);
}
}
