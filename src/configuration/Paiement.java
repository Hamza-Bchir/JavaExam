package configuration;
public class Paiement {
	private static int idpaiement;
	private double montant;
	private String datePaiement;
	private Billet billet;
	public static int getIdpaiement() {
		return idpaiement;
	}
	public static void setIdpaiement(int idpaiement) {
		Paiement.idpaiement = idpaiement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(String datePaiement) {
		this.datePaiement = datePaiement;
	}
	public Billet getBillet() {
		return billet;
	}
	public void setBillet(Billet billet) {
		this.billet = billet;
	}
	public Paiement(double montant, String datePaiement, Billet billet) {
		Paiement.idpaiement++;
		this.montant = montant;
		this.datePaiement = datePaiement;
		this.billet = billet;
	}
	@Override
	public String toString() {
		return "Paiement [montant=" + montant + ", datePaiement=" + datePaiement + "]";
	}
	
	
	
}
