//import java.util.Random;
import java.lang.String;
import java.lang.System;

class Point3D {
	
	static int counter = 0;
	
	private int id;
	private int x = 0, y = 0, z = 0;
	
	static {
		java.util.Random r = new java.util.Random();
		counter = r.nextInt(10) * 100;
	}
	
	{
		id = ++counter;
	}
	
	public Point3D() {
		
	}
	
	public Point3D(int x) {
		this.x = x;
	}
	
	public Point3D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}

public class Point3DTester {
	
	public static void main(String[] args) {
		Point3D p1 = new Point3D();
		Point3D p2 = new Point3D(1);
		Point3D p3 = new Point3D(2, 3);
		Point3D p4 = new Point3D(4, 5, 6);
		
		System.out.println("마지막으로 할당된 식별번호 : " + Point3D.getCounter());
		System.out.println("p1 = " + p1 + "...식별번호 : " + p1.getId());
		System.out.println("p1 = " + p2 + "...식별번호 : " + p2.getId());
		System.out.println("p1 = " + p3 + "...식별번호 : " + p3.getId());
		System.out.println("p1 = " + p4 + "...식별번호 : " + p4.getId());
	}

}
