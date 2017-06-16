import java.util.Scanner;

public class ExceptionExample1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("나뉨수를 입력하시오: ");
		dividend = sc.nextInt();
		
		System.out.print("나눗수를 입력하시오: ");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " 
					+ dividend/divisor + "입니다.");
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			System.err.println("0으로 나눌 수 없습니다.");
		}
		
		sc.close();
	}

}
