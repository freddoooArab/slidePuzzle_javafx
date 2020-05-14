package tp01_slidePuzzle_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import tp01_slidePuzzle.modeles.partie_locale.PartieLocale;
import tp01_slidePuzzle.modeles.partie_locale.PartieLocaleLectureSeule;
import tp01_slidePuzzle_client.afficheur.AfficheurPartieLocale;
import tp01_slidePuzzle_client.vues.VuePartieLocale;


public abstract class ControleurPartieLocale<V extends VuePartieLocale, A extends AfficheurPartieLocale<V>>

		extends ControleurModeleVue<PartieLocaleLectureSeule, PartieLocale, V, A> {

	@Override
	protected void demarrer() {
		J.appel(this);
	}

}
