package game;

import javafx.scene.shape.Circle;

public class KeyDTO {

	private boolean KeyUp = false;
	private boolean KeyDown = false;
	private boolean KeyLeft = false;
	private boolean KeyRight = false;
	
	private String press = null;
	
	private double x = 0, y = 0;
	private double speed = 0.5;
	
	Circle img;
	
	public boolean isKeyUp() {
		return KeyUp;
	}
	public void setKeyUp(boolean keyUp) {
		KeyUp = keyUp;
	}
	public boolean isKeyDown() {
		return KeyDown;
	}
	public void setKeyDown(boolean keyDown) {
		KeyDown = keyDown;
	}
	public boolean isKeyLeft() {
		return KeyLeft;
	}
	public void setKeyLeft(boolean keyLeft) {
		KeyLeft = keyLeft;
	}
	public boolean isKeyRight() {
		return KeyRight;
	}
	public void setKeyRight(boolean keyRight) {
		KeyRight = keyRight;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}	
	
}
