
public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double fuel;
	private double x;
	private double y;
	
	Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	double getFuel() {
		return fuel;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	void putSpec() {
		System.out.println("�̸� : " + name);
		System.out.println("�� �ʺ� : " + width);
		System.out.println("�� ���� : " + height);
		System.out.println("�� ���� : " + length);
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);
		
		if(dist > fuel) {
			return false;
		} else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}

}
