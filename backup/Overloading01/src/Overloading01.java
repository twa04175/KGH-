
public class Overloading01 {
	
	static int sum(int a) {
		System.out.println("오버로딩 1");
		return ++a;
	}
	
	static int sum(int a, int b) {
		System.out.println("오버로딩 2");
		return a+b;
	}
	
	static double sum(double a, double b) {
		System.out.println("오버로딩 3");
		return a+b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum((5)));
		System.out.println();
		
		System.out.println(sum(10, 20));
		System.out.println();
		
		System.out.println(sum(3.2, 4.3));
		System.out.println();
	}

}
