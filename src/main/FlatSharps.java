package main;

import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;

public enum FlatSharps {
	CSHARP1(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth()*5/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth()*5/4, 0),
			new LineTo(View.getKeyWidth()*3/4, 0)
	})), EFLAT1(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() + View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth() + View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 2 + View.getKeyWidth()*1/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 2 + View.getKeyWidth()*1/4, 0),
			new LineTo(View.getKeyWidth() + View.getKeyWidth()*3/4, 0)
	})), FSHARP(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 3 + View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth() * 3 + View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth()*1/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth()*1/4, 0),
			new LineTo(View.getKeyWidth() * 3 + View.getKeyWidth()*3/4, 0)
	})), GSHARP(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 4 + View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth()*1/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth()*1/4, 0),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth()*3/4, 0)
	})), BFLAT(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 5 + View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 6 + View.getKeyWidth()*1/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 6 + View.getKeyWidth()*1/4, 0),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth()*3/4, 0)
	})), CSHARP2(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 7 + View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth() * 7 + View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth()*1/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth()*1/4, 0),
			new LineTo(View.getKeyWidth() * 7 + View.getKeyWidth()*3/4, 0)
	})), EFLAT2(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 8 + View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 9 + View.getKeyWidth()*1/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 9 + View.getKeyWidth()*1/4, 0),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth()*3/4, 0)
	}));
	
	private Path path;
	
	FlatSharps(Path path) {
		this.path = path;
	}
	
	/**
	 * Getter
	 * @return Path to draw key.
	 */
	public Path getPath() {
		return this.path;
	}
}
