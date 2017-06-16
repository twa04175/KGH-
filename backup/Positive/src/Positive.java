import java.util.Scanner;

public class Positive {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = stdIn.nextInt();
		
		if(n > 0) {
			System.out.println(n + "은 양수입니다.");
		} else if(n < 0) {
			System.out.println(n + "은 음수입니다.");
		} else/* if(n == 0)*/ {
			System.out.print(n + "입니다.");
		}
		
		stdIn.close();
	}

}
