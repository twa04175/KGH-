package game;

import javafx.application.Platform;
import javafx.scene.shape.Circle;

public class MoveThread extends Thread {

	KeyDTO key;
	Layout lay = new Layout();
	
	public MoveThread(KeyDTO key) {
		this.key = key;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			if(key.getX() <= 30) {
				key.setX(29.99);
			}
			if(key.getY() >= 670) {
				key.setY(669.99);
			}
			if (key.getX() >= 970) {
				key.setX(969.99);
			}
			if (key.getY() <= 30) {
				key.setY(29.99);
			} 
				
			if(key.isKeyUp()) {
					key.setY(key.getY()-key.getSpeed());
			}
			if(key.isKeyDown()) {
				key.setY(key.getY()+key.getSpeed());
			}
			if(key.isKeyLeft()) {
				key.setX(key.getX()-key.getSpeed());
			}
			if(key.isKeyRight()) {
				key.setX(key.getX()+key.getSpeed());
			}
		
			Platform.runLater(()->{
				lay.<Circle>setLayoutXY(key.img, key.getX(), key.getY());
			});
			
			try {
				Thread.sleep(1); //100프레임 프레임 조절해도 해결안됨 ㅇㅇ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
