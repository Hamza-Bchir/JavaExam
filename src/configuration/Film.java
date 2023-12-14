package configuration;
import java.util.ArrayList;
import java.util.List;
public class Film {
	
	private static int idFilm;
	private String titre;
	private int duree;
	private Genre genre;
	private ArrayList<Role> listeRoles ;
	
	
	public Film(String titre, int duree, Genre genre, ArrayList<Role> listeRoles) {
		
		this.titre = titre;
		this.duree = duree;
		this.genre = genre;
		Film.idFilm++;
		this.listeRoles = new ArrayList<>();
	}
	public static int getIdFilm() {
		return idFilm;
	}
	public static void setIdFILM(int idFilm) {
		Film.idFilm = idFilm;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public List<Role> getListeRoles() {
		return listeRoles;
	}
	
	@Override
	public String toString() {
		return "Film [titre=" + titre + ", duree=" + duree + ", listeRoles=" + listeRoles + "]";
	}
	
	
	
	
	
}


