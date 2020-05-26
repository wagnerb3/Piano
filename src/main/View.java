package main;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View {

	/**
	 * Height of window.
	 */
	private final static double height = 545;

	/**
	 * Width of window.
	 */
	private final static double width = 1024;
	
	/**
	 * Number of natural keys in an octave.
	 */
	private final static int natNum = 8;
	
	private final static int flatSharpNum = 5;

	private Group root;
	private Scene theScene;
	private Canvas canvas;
	private GraphicsContext gc;

	/**
	 * Sets the stage.
	 * @param theStage The stage.
	 */
	public View(Stage theStage) {

		theStage.setTitle("Piano");

		this.root = new Group();
		this.theScene = new Scene(root);
		theStage.setScene(theScene);

		this.canvas = new Canvas(width, height);
		this.root.getChildren().add(this.canvas);
		this.gc = this.canvas.getGraphicsContext2D();
		double keyWidth = width/natNum;
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(1);
		for (int i = 0; i < natNum; i++) {
			gc.strokeRect(i * keyWidth, 0, keyWidth, height);
		}
	}	

	/**
	 * Getter
	 * 
	 * @return Height of window.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Getter
	 * 
	 * @return Width of window.
	 */
	public double getWidth() {
		return width;
	}

}
