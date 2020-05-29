package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

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
		for (Key k : Key.values()) {
			Path p = k.getPath();
			p.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent me) {
					printKey(k);
				}
			});
			p.setFill(k.getColor());
			root.getChildren().add(p);
		}
	}
	
	public static void printKey(Key k) {
		try {
		AudioInputStream stream = AudioSystem.getAudioInputStream(k.getFile());
	    AudioFormat format = stream.getFormat();
	    DataLine.Info info = new DataLine.Info(Clip.class, format);
	    Clip clip = (Clip) AudioSystem.getLine(info);
	    clip.open(stream);
	    clip.start();
		}
		catch(Exception e) {
			e.printStackTrace();
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
