
public class HelloScope {
	
	static int x = 700;	// ��������
	
	static void printX() {
		int y = 20;		// ��������
		System.out.println(x); // �������� x, HelloScope.x
	}
	
	public static void main(String[] args) {
		System.out.println(x); // �������� x, HelloScope.x
		
		int x = 800;	// ��������
		
		System.out.println(x); // �������� x
		
		System.out.println(HelloScope.x); // �������� x, HelloScope.x
		
		printX();
	}

}
