package main;

import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.MoveTo;

import java.io.File;

import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;

public enum Key {

	C1(new Path(new PathElement[] { new MoveTo(0, 0), new LineTo(0, View.getHeight()),
			new LineTo(View.getKeyWidth(), View.getHeight()), new LineTo(View.getKeyWidth(), View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8), new LineTo(View.getKeyWidth() * 3 / 4, 0),
			new LineTo(0, 0) }), Color.WHITE, new File("src/sounds/C1.aiff")),
	CSHARP1(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 5 / 4, View.getHeight() * 5 / 8), new LineTo(View.getKeyWidth() * 5 / 4, 0),
			new LineTo(View.getKeyWidth() * 3 / 4, 0) }), Color.BLACK, new File("src/sounds/CSharp1.aiff")),
	D1(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() + View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() + View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth(), View.getHeight() * 5 / 8), new LineTo(View.getKeyWidth(), View.getHeight()),
			new LineTo(View.getKeyWidth() * 2, View.getHeight()),
			new LineTo(View.getKeyWidth() * 2, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 2 - View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 2 - View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() + View.getKeyWidth() / 4, 0) }), Color.WHITE, new File("src/sounds/D1.aiff")),
	EFLAT1(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() + View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() + View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 2 + View.getKeyWidth() * 1 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 2 + View.getKeyWidth() * 1 / 4, 0),
			new LineTo(View.getKeyWidth() + View.getKeyWidth() * 3 / 4, 0) }), Color.BLACK, new File("src/sounds/EFlat1.aiff")),
	E1(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 2 + View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 2 + View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 2, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 2, View.getHeight()), new LineTo(View.getKeyWidth() * 3, View.getHeight()),
			new LineTo(View.getKeyWidth() * 3, 0), new LineTo(View.getKeyWidth() * 2, 0) }), Color.WHITE, new File("src/sounds/E1.aiff")),
	F(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 3, 0),
			new LineTo(View.getKeyWidth() * 3, View.getHeight()), new LineTo(View.getKeyWidth() * 4, View.getHeight()),
			new LineTo(View.getKeyWidth() * 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 3 + View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 3 + View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() * 3, 0) }), Color.WHITE, new File("src/sounds/F.aiff")),
	FSHARP(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 3 + View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() * 3 + View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth() * 1 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth() * 1 / 4, 0),
			new LineTo(View.getKeyWidth() * 3 + View.getKeyWidth() * 3 / 4, 0) }), Color.BLACK, new File("src/sounds/FSharp.aiff")),
	G(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 4 + View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 4, View.getHeight()), new LineTo(View.getKeyWidth() * 5, View.getHeight()),
			new LineTo(View.getKeyWidth() * 5, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 5 - View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 5 - View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth() / 4, 0), }), Color.WHITE, new File("src/sounds/G.aiff")),
	GSHARP(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 4 + View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth() * 1 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth() * 1 / 4, 0),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth() * 3 / 4, 0) }), Color.BLACK, new File("src/sounds/GSharp.aiff")),
	A(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 5 + View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 5, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 5, View.getHeight()), new LineTo(View.getKeyWidth() * 6, View.getHeight()),
			new LineTo(View.getKeyWidth() * 6, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 6 - View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 6 - View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth() / 4, 0), }), Color.WHITE, new File("src/sounds/A.aiff")),
	BFLAT(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 5 + View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 6 + View.getKeyWidth() * 1 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 6 + View.getKeyWidth() * 1 / 4, 0),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth() * 3 / 4, 0) }), Color.BLACK, new File("src/sounds/BFlat.aiff")),
	B(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 6 + View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 6 + View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 6, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 6, View.getHeight()), new LineTo(View.getKeyWidth() * 7, View.getHeight()),
			new LineTo(View.getKeyWidth() * 7, 0), new LineTo(View.getKeyWidth() * 6, 0) }), Color.WHITE, new File("src/sounds/B.aiff")),
	C2(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 7, 0),
			new LineTo(View.getKeyWidth() * 7, View.getHeight()), new LineTo(View.getKeyWidth() * 8, View.getHeight()),
			new LineTo(View.getKeyWidth() * 8, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 7 + View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 7 + View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() * 7, 0) }), Color.WHITE, new File("src/sounds/C2.aiff")),
	CSHARP2(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 7 + View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() * 7 + View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth() * 1 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth() * 1 / 4, 0),
			new LineTo(View.getKeyWidth() * 7 + View.getKeyWidth() * 3 / 4, 0) }), Color.BLACK, new File("src/sounds/CSharp2.aiff")),
	D2(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 8 + View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 8, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 8, View.getHeight()), new LineTo(View.getKeyWidth() * 9, View.getHeight()),
			new LineTo(View.getKeyWidth() * 9, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 9 - View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 9 - View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth() / 4, 0), }), Color.WHITE, new File("src/sounds/D2.aiff")),
	EFLAT2(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 8 + View.getKeyWidth() * 3 / 4, 0),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth() * 3 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 9 + View.getKeyWidth() * 1 / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 9 + View.getKeyWidth() * 1 / 4, 0),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth() * 3 / 4, 0) }), Color.BLACK, new File("src/sounds/EFlat2.aiff")),
	E2(new Path(new PathElement[] { new MoveTo(View.getKeyWidth() * 9 + View.getKeyWidth() / 4, 0),
			new LineTo(View.getKeyWidth() * 9 + View.getKeyWidth() / 4, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 9, View.getHeight() * 5 / 8),
			new LineTo(View.getKeyWidth() * 9, View.getHeight()), new LineTo(View.getKeyWidth() * 10, View.getHeight()),
			new LineTo(View.getKeyWidth() * 10, 0), new LineTo(View.getKeyWidth() * 9, 0) }), Color.WHITE, new File("src/sounds/E2.aiff"));

	private Path path;
	private Color color;
	private File file;

	Key(Path path, Color color, File file) {
		this.path = path;
		this.color = color;
		this.file = file;
	}

	/**
	 * Getter
	 * 
	 * @return Path to draw key.
	 */
	public Path getPath() {
		return this.path;
	}
	
	/**
	 * Getter
	 * @return Color of key.
	 */
	public Color getColor() {
		return this.color;
	}
	
	/**
	 * Getter
	 * @return Audio file for key.
	 */
	public File getFile() {
		return this.file;
	}
}
