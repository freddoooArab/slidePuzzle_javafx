package slidePuzzle_javafx.slidePuzzle_javafx;

import commun.debogage.J;
import commun_javafx.vues.composants.ImageAjustable;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.NamedArg;
import javafx.util.Duration;

public class CaseAjustable extends ImageAjustable{
	

	public CaseAjustable(@NamedArg("url") String url) {
		super(url);
		J.appel(this);
		
	}
	
	

}
