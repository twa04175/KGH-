package game;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class Ev2 implements EventHandler<KeyEvent> {

	private KeyDTO key;
	
	public Ev2(KeyDTO key) {
		this.key = key;
	}
	
	@Override
	public void handle(KeyEvent arg0) {
		
		if("w".equals(arg0.getCharacter()) || "W".equals(arg0.getCharacter())) {
			key.setKeyUp(true);
		} else if("a".equals(arg0.getCharacter()) || "A".equals(arg0.getCharacter())) {
			key.setKeyLeft(true);
		} else if("s".equals(arg0.getCharacter()) || "S".equals(arg0.getCharacter())) {
			key.setKeyDown(true);
		} else if("d".equals(arg0.getCharacter()) || "D".equals(arg0.getCharacter())) {
			key.setKeyRight(true);
		}
		
		 key.setPress(arg0.getCharacter());
	}

}
