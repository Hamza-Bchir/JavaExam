package configuration;
import java.util.ArrayList;
public class Seance {
	private Diffusion diffusion;
	private ArrayList<Diffusion> listeDiffusions;
   private ArrayList<Billet> listeBillets;
  
   public Seance() {
       this.listeDiffusions = new ArrayList<>();
       this.listeBillets = new ArrayList<>();
       
   }
	public ArrayList<Diffusion> getListeDiffusions() {
		return listeDiffusions;
	}
	public void setListeDiffusions(ArrayList<Diffusion> listeDiffusions) {
		this.listeDiffusions = listeDiffusions;
	}
	public ArrayList<Billet> getListeBillets() {
		return listeBillets;
	}
	public void setListeBillets(ArrayList<Billet> listeBillets) {
		this.listeBillets = listeBillets;
	}
	public Diffusion getDiffusion() {
		return diffusion;
	}
	public void setDiffusion(Diffusion diffusion) {
		this.diffusion = diffusion;
	}
  
}
