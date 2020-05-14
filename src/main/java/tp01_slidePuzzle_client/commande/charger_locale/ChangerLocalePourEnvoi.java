package tp01_slidePuzzle_client.commande.charger_locale;

import java.util.Locale;

import commun_client.commandes.CommandePourEnvoi;

public interface ChangerLocalePourEnvoi extends CommandePourEnvoi {
	
	void setLocale(Locale locale);

}
