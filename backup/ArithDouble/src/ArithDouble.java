import java.util.Scanner;

public class ArithDouble {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x와 y의 사칙연산을 실행합니다.");
		
		System.out.print("x의 값 : ");
		double x = stdIn.nextDouble();
		
		System.out.print("y의 값 : ");
		double y = stdIn.nextDouble();
		
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
		System.out.println("x % y = " + (x%y));
		
		stdIn.close();
	}

}
