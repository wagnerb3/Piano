package main;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
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
	private static final double width = 1024;

	/**
	 * Number of natural keys in an octave.
	 */
	private final static int natNum = 8;

	/**
	 * Number of flat/sharp keys.
	 */
	private final static int flatSharpNum = 5;

	/**
	 * Width of a white key.
	 */
	private double keyWidth;

	/**
	 * Width of a black key;
	 */
	private double upWidth;

	/**
	 * Height of a black key.
	 */
	private double upHeight;

	private Group root;
	private Scene theScene;
	private FlowPane fp;

	/**
	 * Sets the stage.
	 * 
	 * @param theStage The stage.
	 * @param height   Height of the window.
	 * @param width    Width of the window.
	 */
	public View(Stage theStage) {

		theStage.setTitle("Piano");
		this.root = new Group();
		this.theScene = new Scene(root);
		theStage.setScene(theScene);
		this.keyWidth = width / natNum;
		this.upWidth = keyWidth / 2;
		this.upWidth = this.height / 2;
		this.fp = new FlowPane();
	}

	/**
	 * Getter
	 * 
	 * @return Width of a white key.
	 */
	public double getKeyWidth() {
		return keyWidth;
	}

	/**
	 * Getter
	 * 
	 * @return Width of a black key.
	 */
	public double getUpWidth() {
		return upWidth;
	}

	/**
	 * Getter
	 * 
	 * @return Height of black key.
	 */
	public double getUpHeight() {
		return upHeight;
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
