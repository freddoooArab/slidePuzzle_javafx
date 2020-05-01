package tp01_slidePuzzle_client.commande.charger_locale;

import java.util.Locale;

import commun_client.commandes.CommandeRecue;

public interface ChangerLocaleRecue extends CommandeRecue {
	
	Locale getLocale();

}
