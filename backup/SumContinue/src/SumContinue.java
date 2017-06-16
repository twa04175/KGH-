import java.util.Scanner;

public class SumContinue {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수의 덧셈을 계산합니다.");
		System.out.print("덧셈할 갯수는? : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("정수 : ");
			int t = stdIn.nextInt();
			
			if(t < 0) {
				System.out.println("음수는 계산되지 않습니다.");
				continue;
			}
			sum += t;
		}
		System.out.println("합계는 " + sum + "입니다.");
		
		stdIn.close();
	}

}
