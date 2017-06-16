package objectproperty;

class Point {
	int x, y;
	
	public Point(int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object p) {
		try{
			if(x == ((Point)p).x && y == ((Point)p).y) {
				return true;
			}
			return false;
		} catch (ClassCastException e) {
			return false;
		}
	}
}


public class Objectproperty {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.printf("%o \n",p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
	}
}
