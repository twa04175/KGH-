import java.util.Scanner;

public class Circle2 {
	
	public static void main(String[] args) {
		final double PI;
		PI = 3.1416;
//		PI = 3.5;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		double r = stdIn.nextDouble();
		
		System.out.println("������ ���̴� " + 2*PI*r + "�Դϴ�.");
		System.out.println("������ " + PI*r*r + "�Դϴ�.");
		
		stdIn.close();
	}

}
