package point;

public class Point2D {
	
	private int x = 0;
	private int y = 0;
	
	public Point2D() {
		
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D(Point2D p) {
		this(p.x, p.y);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
