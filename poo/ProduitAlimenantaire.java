package poo;

public class ProduitAlimenantaire  extends Produit{
private String dateExpiration;
	public ProduitAlimenantaire() {
	super();
	}
	
	public ProduitAlimenantaire(String libelle, double prix, int qteStock, String dateExpiration) {
		super(libelle, prix, qteStock);
		this.dateExpiration = dateExpiration;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	protected void afficherDateExpiration() {
		System.out.println(getLibelle()+"expire le "+dateExpiration);
	}
	
	@Override
		protected void afficher() {
			
			super.afficher();
			afficherDateExpiration();
		}

	
}
