
public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double fuel;
	private double x;
	private double y;
	private Day purchaseDay;	// 자동차 구입일
	
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay);
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	public void putSpec() {
		System.out.println("이름 : " + name);
		System.out.println("차 너비 : " + width);
		System.out.println("차 높이 : " + height);
		System.out.println("차 길이 : " + length);
	}
	
	public boolean move(double dx, double dy) {
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
