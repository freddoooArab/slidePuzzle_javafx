package tp01_slidePuzzle_client.commande.nouvelle_partie;

import commun_client.commandes.Commande;

public class NouvellePartie extends Commande<NouvellePartiePourEnvoi, 
                                             NouvellePartieRecue>

							implements NouvellePartiePourEnvoi, 
							           NouvellePartieRecue {
}
