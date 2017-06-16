import java.util.Scanner;

public class ArithInt {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x와 y의 사칙연산을 합니다.");
		
		System.out.print("x의 값 : ");
		int x = stdIn.nextInt();
		
		System.out.print("y의 값 : ");
		int y = stdIn.nextInt();
		
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
		System.out.println("x % y = " + (x%y));
		
		stdIn.close();
	}

}
