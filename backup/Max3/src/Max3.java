import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		// 세 값 중 최대값 구하기
		int max = a;
		if(b > max) {
			max = b;
		}
			
		if(c > max) {
			max = c;
		}
		
		System.out.println("최대값은 " + max + "입니다");
		
		// 세 값 중 최소값 구하기
		int min = a;
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		System.out.println("최소값은 " + min + "입니다.");
		
		stdIn.close();
	}

}
