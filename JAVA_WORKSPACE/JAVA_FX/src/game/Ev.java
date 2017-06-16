package game;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class Ev implements EventHandler<KeyEvent> {

	private KeyDTO key;
	
	public Ev(KeyDTO key) {
		this.key = key;
	}
	
	@Override
	public void handle(KeyEvent arg0) {
		 //프레스 값에 따라 변환
		if("w".equals(key.getPress()) || "W".equals(key.getPress())) {
			key.setKeyUp(true);
		} else if("a".equals(key.getPress()) || "A".equals(key.getPress())) {
			key.setKeyLeft(true);
		} else if("s".equals(key.getPress()) || "S".equals(key.getPress())) {
			key.setKeyDown(true);
		} else if("d".equals(key.getPress()) || "D".equals(key.getPress())) {
			key.setKeyRight(true);
		} 
//		System.out.println("눌릴때 xy 값 x :" +x+" y : "+ y);
//		System.out.println("현재 KeyUp = "+KeyUp);
//		System.out.println("현재 KeyLeft = "+KeyLeft);
//		System.out.println("현재 KeyDown = "+KeyDown);
//   	 	System.out.println("현재 KeyRight = "+KeyRight);
//   	System.out.println(press);
		
//		ball.setLayoutX(x);
//		ball.setLayoutY(y);
		
	}

}
