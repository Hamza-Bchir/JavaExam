package configuration;


public class Diffusion {
   private Film film ;
   private Seance seance ;
   private Periode periode;
   private int nbrPlaces;



   public Diffusion(Film film,Seance seance,Periode periode,int nbrPlaces) {
       this.film=film;
       this.seance=seance;
       this.periode=periode;
       this.nbrPlaces=nbrPlaces;
   }



public Film getFilm() {
	return film;
}



public void setFilm(Film film) {
	this.film = film;
}



public Salle getSalle() {
	return salle;
}



public void setSalle(Salle salle) {
	this.salle = salle;
}



public Periode getPeriode() {
	return periode;
}



public void setPeriode(Periode periode) {
	this.periode = periode;
}



public int getNbrPlaces() {
	return nbrPlaces;
}



public void setNbrPlaces(int nbrPlaces) {
	this.nbrPlaces = nbrPlaces;
}



@Override
public String toString() {
	return "Diffusion [film=" + film + ", salle=" + salle + ", periode=" + periode + ", nbrPlaces=" + nbrPlaces + "]";
}



}
