import java.util.Scanner;

public class ArithInt {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x�� y�� ��Ģ������ �մϴ�.");
		
		System.out.print("x�� �� : ");
		int x = stdIn.nextInt();
		
		System.out.print("y�� �� : ");
		int y = stdIn.nextInt();
		
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
		System.out.println("x % y = " + (x%y));
		
		stdIn.close();
	}

}
