package game;

import javafx.scene.Node;

public class Layout {
	
	public <T extends Node> void setLayoutXY (T obj, double x, double y) {
		obj.setLayoutX(x);
		obj.setLayoutY(y);
	}
}
