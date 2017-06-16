import java.util.Scanner;

public class Max {
	
	static int max(int a, int b) {
		return a>b ? a : b;
	}
	
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
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x의 값 : ");
		int x = stdIn.nextInt();
		
		System.out.print("y의 값 : ");
		int y = stdIn.nextInt();
		
		System.out.print("z의 값 : ");
		int z = stdIn.nextInt();
		
		System.out.println("x, y의 최대값은 " + max(x, y) + "입니다.");
		
		System.out.println("x, y, z의 최대값은 " + max(x, y, z) + "입니다.");
		
		stdIn.close();
	}

}
