package slidePuzzle_javafx;


import commun.debogage.J;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.NamedArg;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class MonBouton extends Button{
	
	private Timeline animationSurvol = new Timeline();


	public MonBouton(@NamedArg("text") String arg1) {
		
		super(arg1);
		J.appel(this);
		creerAnimation();

		animationSurvol.setCycleCount(-1);
		animationSurvol.playFromStart();
		installerListeners();
		
	}
	
	private void creerAnimation() {
		J.appel(this);
		
		double delaiMilisecondes = 600;
		double opaciteNormale = 1.0;
		double opaciteBasse = 0.6; 
		
		animationSurvol.getKeyFrames()
		.add(new KeyFrame(Duration.ZERO, new KeyValue(opacityProperty(), opaciteNormale)));
		
	
		animationSurvol.getKeyFrames()
		.add(new KeyFrame(new Duration(delaiMilisecondes), new KeyValue(opacityProperty(),opaciteBasse)));
		
		animationSurvol.getKeyFrames()
		.add(new KeyFrame(new Duration(delaiMilisecondes*2), new KeyValue(opacityProperty(), opaciteNormale)));
	}
	
private void installerListeners() {
		
		J.appel(this);;
		
		this.setOnMouseEntered(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
			
				J.appel(this);
				
				animationSurvol.playFromStart();
			}
		});
		
		this.setOnMouseExited(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				J.appel(this);
				animationSurvol.stop();
				MonBouton.this.setOpacity(1);
			}
		});
	}
}

