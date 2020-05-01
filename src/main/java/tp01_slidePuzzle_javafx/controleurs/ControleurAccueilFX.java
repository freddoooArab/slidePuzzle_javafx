package tp01_slidePuzzle_javafx.controleurs;

import commun.debogage.J;
import commun.systeme.Systeme;
import commun_client.commandes.FabriqueCommande;
import commun_client.commandes.RecepteurCommande;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tp01_slidePuzzle_client.controleurs.ControleurAccueil;
import tp01_slidePuzzle_javafx.vues.VueAccueilFX;


public class ControleurAccueilFX extends ControleurAccueil<VueAccueilFX> {
	
	
	private Scene sceneParametres;
	private Stage dialogueParametres;
	
	
	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
	}

	
	
	
	private void ouvrirParametres() {
		J.appel(this);

		dialogueParametres = DialogueModal.ouvrirDialogueModal(sceneParametres);
	}

	private void fermerParametres() {
		J.appel(this);
		
		if(dialogueParametres != null) {
			
			dialogueParametres.close();
		}
	}

	@Override
	protected void demarrer() {
		J.appel(this);
	}
}
