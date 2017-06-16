
class Rect {
	private int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object p) {
		if(this.width*this.height == ((Rect)p).width*((Rect)p).height) {
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		
		if(b.equals(c)) {
			System.out.println("b is equal to c");
		}
	}
}
