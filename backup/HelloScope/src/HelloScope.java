
public class HelloScope {
	
	static int x = 700;	// 전역변수
	
	static void printX() {
		int y = 20;		// 지역변수
		System.out.println(x); // 전역변수 x, HelloScope.x
	}
	
	public static void main(String[] args) {
		System.out.println(x); // 전역변수 x, HelloScope.x
		
		int x = 800;	// 지역변수
		
		System.out.println(x); // 지역변수 x
		
		System.out.println(HelloScope.x); // 전역변수 x, HelloScope.x
		
		printX();
	}

}
