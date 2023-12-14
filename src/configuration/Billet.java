package configuration;


public class Billet {
   private int idBillet;
   private int numeroSiege;
   private double prix;
   private String dateAchat;
   private Seance seance;
   private Client client ;


   public int getIdBillet() {
       return idBillet;
   }


   public void setIdBillet(int idBillet) {
       this.idBillet = idBillet;
   }


   public int getNumeroSiege() {
       return numeroSiege;
   }


   public void setNumeroSiege(int numeroSiege) {
       this.numeroSiege = numeroSiege;
   }


   public double getPrix() {
       return prix;
   }


   public void setPrix(double prix) {
       this.prix = prix;
   }


   public String getDateAchat() {
       return dateAchat;
   }


   public void setDateAchat(String dateAchat) {
       this.dateAchat = dateAchat;
   }


   public Seance getSeance() {
       return seance;
   }


   public void setSeance(Seance seance) {
       this.seance = seance;
   }


   public Client getClient() {
       return client;
   }


   public void setClient(Client client) {
       this.client = client;
   }


   public Billet(int idBillet, int numeroSiege, double prix, String dateAchat, Seance seance, Client client) {
       this.idBillet = idBillet;
       this.numeroSiege = numeroSiege;
       this.prix = prix;
       this.dateAchat = dateAchat;
       this.seance = seance;
       this.client = client;
   }


   @Override
   public String toString() {
       return "Billet{" +
               "idBillet=" + idBillet +
               ", numeroSiege=" + numeroSiege +
               ", prix=" + prix +
               ", dateAchat='" + dateAchat + '\'' +
               ", seance=" + seance +
               ", client=" + client +
               '}';
   }
}
