import java.util.Scanner;

public class Max3Method {
	
	static int max(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}
	
	static int max(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		System.out.println("최대값은 " + max(a, b, c) + "입니다.");
		System.out.println("a와 b 중에서 최대값은 " + max(a, b) + "입니다.");
		//System.out.println("최대값은 " + max(10, 20, 30) + "입니다.");
		
		stdIn.close();
	}
}
