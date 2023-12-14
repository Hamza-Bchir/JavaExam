package configuration;


public class Periode {
   private  String datedebut  ;
   private String datefin;


   public String getDatedebut() {
       return datedebut;
   }


   public void setDatedebut(String datedebut) {
       this.datedebut = datedebut;
   }


   public String getDatefin() {
       return datefin;
   }


   public void setDatefin(String datefin) {
       this.datefin = datefin;
   }


   public Periode(String datedebut, String datefin) {
       this.datedebut = datedebut;
       this.datefin = datefin;
   }


   @Override
   public String toString() {
       return "Periode{" +
               "datedebut='" + datedebut + '\'' +
               ", datefin='" + datefin + '\'' +
               '}';
   }
}
