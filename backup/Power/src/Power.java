import java.util.Scanner;

public class Power {
	
	static double power(double x, int n) {
		double tmp = 1.0;
		
//		for(int i=1; i<=n; i++) {
//			tmp *= x;
//		}
		
		while(n-- > 0) {
			tmp *= x;
		}
		
		return tmp;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
				
		System.out.print("실수 a : ");
		double a = stdIn.nextDouble();
		
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		
		System.out.println(a + "의 " + b + "승은 " + power(a, b) + "입니다.");
		
		stdIn.close();
	}
}
