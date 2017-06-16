
class A {
	private int a;
	
	A() {
		
	}
	
	A(int x) {
		a = 50;
	}
	
	int getA() {
		return a;
	}
}

class B extends A {
	
	B() {
		super();
	}
	
}

public class DefaultConstructor {
	
	public static void main(String[] args) {
		B x = new B();
		
		System.out.println("x.getA() = " + x.getA());
	}

}
