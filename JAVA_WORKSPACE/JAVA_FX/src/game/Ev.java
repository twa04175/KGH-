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
		 //������ ���� ���� ��ȯ
		if("w".equals(key.getPress()) || "W".equals(key.getPress())) {
			key.setKeyUp(true);
		} else if("a".equals(key.getPress()) || "A".equals(key.getPress())) {
			key.setKeyLeft(true);
		} else if("s".equals(key.getPress()) || "S".equals(key.getPress())) {
			key.setKeyDown(true);
		} else if("d".equals(key.getPress()) || "D".equals(key.getPress())) {
			key.setKeyRight(true);
		} 
//		System.out.println("������ xy �� x :" +x+" y : "+ y);
//		System.out.println("���� KeyUp = "+KeyUp);
//		System.out.println("���� KeyLeft = "+KeyLeft);
//		System.out.println("���� KeyDown = "+KeyDown);
//   	 	System.out.println("���� KeyRight = "+KeyRight);
//   	System.out.println(press);
		
//		ball.setLayoutX(x);
//		ball.setLayoutY(y);
		
	}

}
