import java.util.Scanner;

public class ArithDouble {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x�� y�� ��Ģ������ �����մϴ�.");
		
		System.out.print("x�� �� : ");
		double x = stdIn.nextDouble();
		
		System.out.print("y�� �� : ");
		double y = stdIn.nextDouble();
		
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
		System.out.println("x % y = " + (x%y));
		
		stdIn.close();
	}

}
