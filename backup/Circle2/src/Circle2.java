import java.util.Scanner;

public class Circle2 {
	
	public static void main(String[] args) {
		final double PI;
		PI = 3.1416;
//		PI = 3.5;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		double r = stdIn.nextDouble();
		
		System.out.println("원주의 길이는 " + 2*PI*r + "입니다.");
		System.out.println("면적은 " + PI*r*r + "입니다.");
		
		stdIn.close();
	}

}
