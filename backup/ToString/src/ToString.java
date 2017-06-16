
class X {
	public String toString() {
		return "class X";
	}
}

class Y extends X {
	public String toString() {
		return "class Y";
	}
}

public class ToString {

	static void print(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		int[] c = new int[5];
		
		print(x);
		print(y);
		print(c);
	}
}
