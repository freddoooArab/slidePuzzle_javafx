package tp01_slidePuzzle_client.commande.choisir_choix;

import commun.debogage.J;
import commun_client.commandes.Commande;
import tp01_slidePuzzle.enumerations.Choix;

public class ChoisirChoix extends Commande<ChoisirChoixPourEnvoi, ChoisirChoixRecue>
	                      implements ChoisirChoixPourEnvoi, ChoisirChoixRecue {
	
	private Choix choix;
	
	@Override
	public Choix getChoix() {
		J.appel(this);

		return choix;
	}

	@Override
	public void setChoix(Choix choix) {
		J.appel(this);

		this.choix = choix;
	}
}
