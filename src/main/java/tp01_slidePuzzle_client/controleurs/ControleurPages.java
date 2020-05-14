package tp01_slidePuzzle_client.controleurs;

import commun_client.mvc.controleurs.ControleurVue;
import tp01_slidePuzzle_client.vues.VueAccueil;
import tp01_slidePuzzle_client.vues.VuePages;

public abstract class ControleurPages<V extends VuePages> extends ControleurVue<V> {}
