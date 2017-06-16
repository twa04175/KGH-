import java.util.Scanner;

public class ReverseNo {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("양의 정수값을 역순으로 표시합니다.");
		
		int x; 
		do {
			System.out.print("양의 정수값 : ");
			x = stdIn.nextInt();
		} while(x <= 0);
		
		System.out.print("거꾸로 읽으면  ");
		while(x > 0) {
			System.out.print(x % 10);
			x /= 10;
		}
		
		stdIn.close();
	}

}
