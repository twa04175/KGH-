package game;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class Ev1 implements EventHandler<KeyEvent> {

	private KeyDTO key;
	
	public Ev1(KeyDTO key) {
		this.key = key;
	}
	
	@Override
	public void handle(KeyEvent arg0) {
		
		 if("w".equals(key.getPress()) || "W".equals(key.getPress())) {
    		 key.setKeyLeft(false);
    		 key.setKeyRight(false);
    		 key.setKeyDown(false);
    		 key.setKeyUp(false);
    		 key.setPress(null);
    	 } else if("a".equals(key.getPress()) || "A".equals(key.getPress())) {
    		 key.setKeyLeft(false);
    		 key.setKeyRight(false);
    		 key.setKeyDown(false);
    		 key.setKeyUp(false);
    		 key.setPress(null);
    	 } else if("s".equals(key.getPress()) || "S".equals(key.getPress())) {
    		 key.setKeyLeft(false);
    		 key.setKeyRight(false);
    		 key.setKeyDown(false);
    		 key.setKeyUp(false);
    		 key.setPress(null);
    	 } else if("d".equals(key.getPress()) || "D".equals(key.getPress())) {
    		 key.setKeyLeft(false);
    		 key.setKeyRight(false);
    		 key.setKeyDown(false);
    		 key.setKeyUp(false);
    		 key.setPress(null);
    	 } 	
		 
    	 System.out.println("눌렷다 때질때 xy 값 x :" +key.getX()+" y : "+ key.getY());
     }        


}

