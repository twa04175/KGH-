import java.util.Scanner;

public class Min2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		
		// 둘 중에 작은 값을 구하기
/*		int min;
		if(a < b) {
			min = a;
		} else {
			min = b;
		}*/
		
		int min = a < b ? a : b;
		System.out.println("값이 작은 쪽은 " + min + "입니다.");
		
		// 둘 중에 큰 값을 구하기
/*		int max;
		if(a > b) {
			max = a;
		} else {
			max = b;
		}*/
		
		int max = a > b ? a : b;
		System.out.println("값이 큰 쪽은 " + max + "입니다.");
		
		stdIn.close();
	}

}
