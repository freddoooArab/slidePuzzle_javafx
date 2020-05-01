package tp01_slidePuzzle_client.commande.choisir_choix;

import commun_client.commandes.CommandeRecue;
import tp01_slidePuzzle.enumerations.Choix;

public interface ChoisirChoixRecue extends CommandeRecue {
	
	Choix getChoix();

}
