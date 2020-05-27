package main;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
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
		View.keyWidth = width / natNum;
		View.upWidth = keyWidth / 2;
		View.upWidth = View.height / 2;
		for (Naturals n : Naturals.values()) {
			Path p = n.getPath();
			p.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent me) {
					printKey(n.name());
				}
			});
			p.setFill(Color.WHITE);
			root.getChildren().add(p);
		}
		for (FlatSharps fs : FlatSharps.values()){
			Path p = fs.getPath();
			p.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent me) {
					printKey(fs.name());
				}
			});
			p.setFill(Color.BLACK);
			root.getChildren().add(p);
		}
	}
	
	public static void printKey(String key) {
		System.out.println(key + " was pressed.");
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
