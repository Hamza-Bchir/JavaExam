package configuration;

import java.util.Scanner;

import Application.Agence;

public class Main {

	public static void main(String[] args) {
		  	Gestionnaire gestionnaire = new Gestionnaire();
		    Scanner sc = new Scanner(System.in);
		    String string = "";
		    do {
		        System.out.println("Quelle opération voulez-vous effectuer ?");
		        System.out.println("1. Créer un compte");
		        System.out.println("2. Se connecter");
		        System.out.println("3. Afficher les films");
		        System.out.println("4. Quitter");
		        System.out.print("Votre choix : ");
		        string = sc.next();
		        switch (string) {
		            case "1":
		                .ajouter_client();
		                break;
		            case "2":
		                agence.ajouter_voiture();
		                break;
		            case "3":
		                
		                break;
		        }
		    } while (!string.equals("4"));
		    sc.close();

	}
	
}
