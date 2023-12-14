package configuration;

public class Client {
	private String nomUtilisateur;
	private String mdp;
	private double solde=200;
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Client [nomUtilisateur=" + nomUtilisateur + ", mdp=" + mdp + ", solde=" + solde + "]";
	}
	public Client(String nomUtilisateur, String mdp) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.mdp = mdp;
	}
	
	
	
}

