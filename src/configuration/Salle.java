package configuration;


import java.util.ArrayList;
import java.util.List;


public class Salle {
    private int capacite;
    private static int numSalle;
    private boolean etat;
    private List<Diffusion> listeDiffusion = new ArrayList<>();


    public int getCapacite() {
        return capacite;
    }


    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }


    public static int getNumSalle() {
        return numSalle;
    }


    public static void setNumSalle(int numSalle) {
        Salle.numSalle = numSalle;
    }


    public boolean isEtat() {
        return etat;
    }


    public void setEtat(boolean etat) {
        this.etat = etat;
    }


    public List<Diffusion> getListeDiffusion() {
        return listeDiffusion;
    }


    public void setListeDiffusion(List<Diffusion> listeDiffusion) {
        this.listeDiffusion = listeDiffusion;
    }


    public Salle(int capacite, boolean etat, List<Diffusion> listeDiffusion) {
        this.capacite = capacite;
        this.etat = etat;
        this.listeDiffusion = new ArrayList<>(listeDiffusion);
        Salle.numSalle++;
    }

    public void ouvrirSalle() {
        if (!etat) {
            etat = true;
            System.out.println("La salle " + numSalle + " est maintenant ouverte.");
        } else {
            System.out.println("La salle " + numSalle + " est déjà ouverte.");
        }
       
    }
    public void fermerSalle() {
        if (!etat) {
            etat = true;
            System.out.println("La salle " + numSalle + " est maintenant ouverte.");
        } else {
            System.out.println("La salle " + numSalle + " est déjà ouverte.");
        }
    }
}
