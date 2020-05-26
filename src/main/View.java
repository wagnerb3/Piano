package main;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class View {

	/**
	 * Height of window.
	 */
	private final static double height = Screen.getPrimary().getBounds().getMaxY() - 70;

	/**
	 * Width of window.
	 */
	private final static double width = Screen.getPrimary().getBounds().getMaxX();

	/**
	 * Number of natural keys in an octave.
	 */
	private final static int natNum = 10;

	/**
	 * Number of flat/sharp keys.
	 */
	private final static int flatSharpNum = 7;

	/**
	 * Width of a white key.
	 */
	private static double keyWidth;

	/**
	 * Width of a black key;
	 */
	private static double upWidth;

	/**
	 * Height of a black key.
	 */
	private static double upHeight;

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
		for (Naturals k : Naturals.values()) {
			root.getChildren().add(k.getPath());
		}
		for (FlatSharps fs : FlatSharps.values()){
			Path p = fs.getPath();
			p.setFill(Color.BLACK);
			root.getChildren().add(p);
		}
	}

	/**
	 * Getter
	 * 
	 * @return Width of a white key.
	 */
	public static double getKeyWidth() {
		return keyWidth;
	}

	/**
	 * Getter
	 * 
	 * @return Width of a black key.
	 */
	public static double getUpWidth() {
		return upWidth;
	}

	/**
	 * Getter
	 * 
	 * @return Height of black key.
	 */
	public static double getUpHeight() {
		return upHeight;
	}

	/**
	 * Getter
	 * 
	 * @return Height of window.
	 */
	public static double getHeight() {
		return height;
	}

	/**
	 * Getter
	 * 
	 * @return Width of window.
	 */
	public static double getWidth() {
		return width;
	}

}
