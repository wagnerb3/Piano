package main;

import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;


public enum Naturals {
	
	C1(new Path(new PathElement[] {
			new MoveTo(0,0),
			new LineTo(0, View.getHeight()),
			new LineTo(View.getKeyWidth(), View.getHeight()),
			new LineTo(View.getKeyWidth(), View.getHeight()*5/8),
			new LineTo(View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth()*3/4, 0),
			new LineTo(0, 0)
	})),
	D1(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() + View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() + View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth(), View.getHeight()*5/8),
			new LineTo(View.getKeyWidth(), View.getHeight()),
			new LineTo(View.getKeyWidth() * 2, View.getHeight()),
			new LineTo(View.getKeyWidth() * 2, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 2 - View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 2 - View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() + View.getKeyWidth()/4, 0)
	})),
	E1(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 2 + View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 2 + View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 2, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 2, View.getHeight()),
			new LineTo(View.getKeyWidth() * 3, View.getHeight()),
			new LineTo(View.getKeyWidth() * 3, 0),
			new LineTo(View.getKeyWidth() * 2, 0)
	})),
	F(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 3,0),
			new LineTo(View.getKeyWidth() * 3, View.getHeight()),
			new LineTo(View.getKeyWidth() * 4, View.getHeight()),
			new LineTo(View.getKeyWidth() * 4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 3 + View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 3 + View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth() * 3, 0)
	})),
	G(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 4 + View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 4, View.getHeight()),
			new LineTo(View.getKeyWidth() * 5, View.getHeight()),
			new LineTo(View.getKeyWidth() * 5, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 5 - View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 5 - View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 4 + View.getKeyWidth()/4, 0),
	})),
	A(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 5 + View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 5, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 5, View.getHeight()),
			new LineTo(View.getKeyWidth() * 6, View.getHeight()),
			new LineTo(View.getKeyWidth() * 6, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 6 - View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 6 - View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 5 + View.getKeyWidth()/4, 0),
	})),
	B(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 6 + View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 6 + View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 6, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 6, View.getHeight()),
			new LineTo(View.getKeyWidth() * 7, View.getHeight()),
			new LineTo(View.getKeyWidth() * 7, 0),
			new LineTo(View.getKeyWidth() * 6, 0)
	})),
	C2(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 7,0),
			new LineTo(View.getKeyWidth() * 7, View.getHeight()),
			new LineTo(View.getKeyWidth() * 8, View.getHeight()),
			new LineTo(View.getKeyWidth() * 8, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 7 + View.getKeyWidth()*3/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 7 + View.getKeyWidth()*3/4, 0),
			new LineTo(View.getKeyWidth() * 7, 0)
	})),
	D2(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 8 + View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 8, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 8, View.getHeight()),
			new LineTo(View.getKeyWidth() * 9, View.getHeight()),
			new LineTo(View.getKeyWidth() * 9, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 9 - View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 9 - View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 8 + View.getKeyWidth()/4, 0),
	})),
	E2(new Path(new PathElement[] {
			new MoveTo(View.getKeyWidth() * 9 + View.getKeyWidth()/4, 0),
			new LineTo(View.getKeyWidth() * 9 + View.getKeyWidth()/4, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 9, View.getHeight()*5/8),
			new LineTo(View.getKeyWidth() * 9, View.getHeight()),
			new LineTo(View.getKeyWidth() * 10, View.getHeight()),
			new LineTo(View.getKeyWidth() * 10, 0),
			new LineTo(View.getKeyWidth() * 9, 0)
	}));
	
	private Path path;
	
	Naturals(Path path) {
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
