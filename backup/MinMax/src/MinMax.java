import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		
		int max, min;
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		System.out.println("둘 중에 큰 값은 " + max + "입니다.");
		System.out.println("둘 중에 작은 값은 " + min + "입니다.");
		
		stdIn.close();
	}

}
