package configuration;
import java.util.ArrayList;
import java.util.Scanner;


public class GestionBillet {
   private ArrayList<Billet> listeBillets=new ArrayList<Billet>();
   
  
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
