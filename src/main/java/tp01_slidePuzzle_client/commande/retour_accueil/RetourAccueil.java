package tp01_slidePuzzle_client.commande.retour_accueil;

import commun_client.commandes.Commande;

public class RetourAccueil extends Commande<RetourAccueilPourEnvoi, 
                                               RetourAccueilRecue>

							  implements RetourAccueilPourEnvoi,
							             RetourAccueilRecue {
}
