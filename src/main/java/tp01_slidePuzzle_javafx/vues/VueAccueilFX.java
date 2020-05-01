package tp01_slidePuzzle_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import commun_javafx.ChargeurDeVue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import tp01_slidePuzzle_client.commande.nouvelle_partie.NouvellePartie;
import tp01_slidePuzzle_client.commande.nouvelle_partie.NouvellePartiePourEnvoi;
import tp01_slidePuzzle_client.commande.ouvrir_parametres.OuvrirParametres;
import tp01_slidePuzzle_client.commande.ouvrir_parametres.OuvrirParametresPourEnvoi;
import tp01_slidePuzzle_client.vues.VueAccueil;


public class VueAccueilFX implements VueAccueil, Initializable {
	
	@FXML
	Button boutonNouvellePartie, boutonOuvrirParametres;
	
	OuvrirParametresPourEnvoi ouvrirParametresPourEnvoi;
	NouvellePartiePourEnvoi nouvellePartiePourEnvoi;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(boutonNouvellePartie);
		DoitEtre.nonNul(boutonOuvrirParametres);
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		ouvrirParametresPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(OuvrirParametres.class);
		nouvellePartiePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		boutonOuvrirParametres.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				ouvrirParametresPourEnvoi.envoyerCommande();
			}
		});
		
		boutonNouvellePartie.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				nouvellePartiePourEnvoi.envoyerCommande();
			}
		});
	}



	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}

}
