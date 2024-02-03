package poo;

public class ProduitElectronique  extends Produit{
	String config;

	public ProduitElectronique() {
		// TODO Auto-generated constructor stub
	}
	public ProduitElectronique(String libelle, double prix, int qteStock, String config) {
		super(libelle, prix, qteStock);
		this.config = config;
	}
	
	@Override
	protected void afficher() {
	
		super.afficher();
		System.out.println("la config est "+config);
	}
	
}
