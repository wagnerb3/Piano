package main;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;

public class Controller extends Application {
	private Model model;
	private View view;

	@Override
	public void start(Stage theStage) {
		this.view = new View(theStage);
		new AnimationTimer() {
            public void handle(long currentNanoTime)
            {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
		theStage.show();
	}
}
