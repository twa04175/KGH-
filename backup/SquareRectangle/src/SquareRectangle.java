import java.util.Scanner;

public class SquareRectangle {
	
	static void putChars(char c, int n) {
		while(n-- > 0) {
			System.out.print(c);
		}
	}
	
	static void putSquare(int n) {
		for(int i=1; i<=n; i++) {
			putChars('+', n);
			System.out.println();
		}
	}

	static void putRectangle(int h, int w) {
		for(int i=1; i<=h; i++) {
			putChars('*', w);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정사각형을 표시합니다.");
		System.out.print("한 변은 : ");
		int n = stdIn.nextInt();
		putSquare(n);
		
		System.out.println("직사각형을 표시합니다.");
		System.out.print("세로는 : ");
		int h = stdIn.nextInt();
		System.out.print("가로는 : ");
		int w = stdIn.nextInt();
		putRectangle(h, w);
		
		stdIn.close();
	}
}
