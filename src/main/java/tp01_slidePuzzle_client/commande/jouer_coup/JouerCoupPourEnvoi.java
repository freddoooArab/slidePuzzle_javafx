package tp01_slidePuzzle_client.commande.jouer_coup;

import commun_client.commandes.CommandePourEnvoi;

public interface JouerCoupPourEnvoi extends CommandePourEnvoi { 
	
	void setInfoCoup(int infoCoup);
	
}
