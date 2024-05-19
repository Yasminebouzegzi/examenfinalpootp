package mainPackage.Controllers;
import mainPackage.Views.*;
import javax.swing.*;
import java.awt.*;
import mainPackage.Model.Model;

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
	}}
