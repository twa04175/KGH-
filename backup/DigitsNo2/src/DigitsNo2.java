import java.util.Scanner;

public class DigitsNo2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = stdIn.nextInt();
		
		if(n <= -10 || n >= 10) {
			System.out.println("두 자릿수 이상입니다.");
		} else {
			System.out.println("두 자릿수 미만입니다.");
		}
		
		stdIn.close();
	}

}
