package configuration;


import java.util.ArrayList;
import java.util.List;


public class Cinema {
    private String name;
    private String adresse;
    private List<Salle> listeSalle = new ArrayList<>();


    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public List<Salle> getListeSalle() {
        return listeSalle;
    }


    public void setListeSalle(List<Salle> listeSalle) {
        this.listeSalle = listeSalle;
    }
}
