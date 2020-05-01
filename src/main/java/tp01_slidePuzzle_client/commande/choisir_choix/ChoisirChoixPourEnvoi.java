package tp01_slidePuzzle_client.commande.choisir_choix;

import commun_client.commandes.CommandePourEnvoi;
import tp01_slidePuzzle.enumerations.Choix;

public interface ChoisirChoixPourEnvoi extends CommandePourEnvoi {
	
	void setChoix(Choix choix);

}
