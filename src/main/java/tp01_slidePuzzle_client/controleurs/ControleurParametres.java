package tp01_slidePuzzle_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import tp01_slidePuzzle.modeles.parametres.Parametres;
import tp01_slidePuzzle.modeles.parametres.ParametresLectureSeule;
import tp01_slidePuzzle_client.afficheur.AfficheurParametres;
import tp01_slidePuzzle_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres, A extends AfficheurParametres<V>>

		extends ControleurModeleVue<ParametresLectureSeule, Parametres, V, A> {

	@Override
	protected void demarrer() {
		J.appel(this);

	}
}
