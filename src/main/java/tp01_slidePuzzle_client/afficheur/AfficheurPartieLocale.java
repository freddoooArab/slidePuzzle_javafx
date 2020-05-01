package tp01_slidePuzzle_client.afficheur;

import commun.debogage.J;
import commun.modeles.Modele;
import commun_client.mvc.Afficheur;
import tp01_slidePuzzle.modeles.partie_locale.PartieLocaleLectureSeule;
import tp01_slidePuzzle_client.vues.VuePartieLocale;

public abstract class AfficheurPartieLocale<V extends VuePartieLocale>

		extends Afficheur<PartieLocaleLectureSeule, V> {

}
