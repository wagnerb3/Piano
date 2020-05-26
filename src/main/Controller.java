package main;

import javafx.application.Application;
import javafx.stage.Stage;

public class Controller extends Application {
	private Model model;
	private View view;

	@Override
	public void start(Stage theStage) {
		this.view = new View(theStage);
		theStage.show();
	}
}
