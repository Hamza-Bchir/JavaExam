package configuration;

import java.util.ArrayList;

public class Gestionnaire {
	private ArrayList<Billet> listeBillets=new ArrayList<Billet>();
	private ArrayList<Seance> listeSeances= new ArrayList<Seance>();
	private ArrayList<Paiement> listePaiements= new ArrayList<Paiement>();
	
	
	
	
	
	   public void ajouterDiffusion(Diffusion diffusion) {
		   Seance seance = new Seance();
	       listeSeances.add(seance);
	       System.out.println("Diffusion ajoutée avec succès.");
	   }
	 
	   public void supprimerDiffusion(Diffusion diffusion) {
	       for (Seance seance : listeSeances) {
	           if (seance.getDiffusion().equals(diffusion)) {
	               listeSeances.remove(seance);
	               System.out.println("Diffusion supprimée avec succès.");
	               return;
	           }
	       }
	       System.out.println("Diffusion non trouvée dans la liste.");
	   }
	    public boolean diffusionExiste(Diffusion diffusion) {
	       for (Seance seance : listeSeances) {
	           if (seance.getDiffusion().equals(diffusion)) {
	               return true;
	           }
	       }
	       return false;
	   }
	}

	public void ajouterBillet(Billet billet) {
	       listeBillets.add(billet);
	       System.out.println("Billet ajouté :\n" + billet);
	   }
	public void supprimerBillet(Billet billet) {
	       if (listeBillets.contains(billet)) {
	           listeBillets.remove(billet);
	           System.out.println("Billet supprimé :\n" + billet);
	       } else {
	           System.out.println("Le billet n'existe pas dans la liste.");
	       }
	   }
	}
