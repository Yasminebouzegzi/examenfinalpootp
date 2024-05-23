package mainPackage.Controllers;
import mainPackage.Views.*;
import javax.swing.*;
import java.awt.*;
import mainPackage.Model.Model;
import mainPackage.Model.Model.typechambre;
import mainPackage.Views.ClientRoom;
public class Control {
	 
	public static void action(ClientWindow clientWindow) {
		String nom = clientWindow.getNom();
		String prenom = clientWindow.getPrenom();
		String numeroTelephone = clientWindow.getNumeroTelephone();
		String codePostale = clientWindow.getCodePostale();
		
		Model.Client client = new Model().new Client(
			nom, prenom, Integer.parseInt(codePostale), null, Integer.parseInt(numeroTelephone), 0);
		
		// Affichage pour vérifier
		System.out.println("Nom: " + client.getNomclient());
		System.out.println("Prenom: " + client.getPrenomclient());
		System.out.println("Numéro de téléphone: " + client.getNumerotlphnclient());
		System.out.println("Code postal: " + client.getCodepostaleclient());
	}
	
	 Model model;

    public Control(Model model) {
        this.model = model;
    }
    
   //pour remplir mapclient
    public void ajouterReservation(String numeroTelephone, String typeChambreStr) {
        typechambre typeChambre = null;

        switch (typeChambreStr) {
            case "Chambre Simple":
                typeChambre = typechambre.chambresimple;
                break;
            case "Chambre double":
                typeChambre = typechambre.chambredouble;
                break;
            case "Chambre Twin":
                typeChambre = typechambre.chambretwin;
                break;
            case "Suite":
                typeChambre = typechambre.suite;
                break; 
        }

        if (typeChambre != null) {
            model.mapClient.put(Integer.parseInt(numeroTelephone), typeChambre);
            System.out.println("Réservation ajoutée : " + numeroTelephone + " - " + typeChambre);
        } else {
            System.out.println("Type de chambre invalide.");
        }
    }
	
    public void verifChambre(String numeroTelephone) {
        // Recherche du type de chambre dans mapClient
        typechambre typeChambre = model.mapClient.get(Integer.parseInt(numeroTelephone));

        // Vérification de la disponibilité de la chambre
        if (typeChambre != null) {
            int nombreReservations = model.mapreservations.getOrDefault(typeChambre, 0);
            if (nombreReservations >= 2) {
                // Affichage du message "La chambre n'est pas disponible"
                System.out.println("La chambre n'est pas disponible donc ne peut pas être réservée.");
            } else {
                // Affichage du message "La chambre peut être réservée"
                System.out.println("La chambre peut être réservée.");
            }
        } else {
            // Affichage du message "Aucune réservation trouvée pour ce numéro de téléphone."
            System.out.println("Aucune réservation trouvée pour ce numéro de téléphone.");
        }
    }

    public void ajouterReservationfinal(String numeroTelephone, String typeChambreStr) {
        typechambre typeChambre = null;

        switch (typeChambreStr) {
            case "Chambre Simple":
                typeChambre = typechambre.chambresimple;
                break;
            case "Chambre double":
                typeChambre = typechambre.chambredouble;
                break;
            case "Chambre Twin":
                typeChambre = typechambre.chambretwin;
                break;
            case "Suite":
                typeChambre = typechambre.suite;
                break; 
        }

        if (typeChambre != null) {
            model.mapreservations.put(typeChambre, model.mapreservations.getOrDefault(typeChambre, 0) + 1);
            System.out.println("Réservation ajoutée : " + numeroTelephone + " - " + typeChambre);
        } else {
            System.out.println("Type de chambre invalide.");
        }
    }
    
	
}
