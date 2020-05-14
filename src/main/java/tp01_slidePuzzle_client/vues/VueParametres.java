package tp01_slidePuzzle_client.vues;

import commun_client.mvc.Vue;
import tp01_slidePuzzle.enumerations.Choix;

public interface VueParametres extends Vue {
	
	void afficherChoix(Choix choix);

}
