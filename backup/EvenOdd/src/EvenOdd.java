import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = stdIn.nextInt();
		
		if(n > 0) {
			if(n%2 == 0) {
				System.out.println("이 값은 짝수입니다.");
			} else {
				System.out.println("이 값은 홀수입니다.");
			}
		} else {
			System.out.print("양수가 아닌 값을 입력했습니다.");
		}
		
//		if(n > 0) ;
//			System.out.println("이 값은 양수입니다.");
		
		stdIn.close();
	}

}
