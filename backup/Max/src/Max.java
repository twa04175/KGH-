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
		
		System.out.print("x�� �� : ");
		int x = stdIn.nextInt();
		
		System.out.print("y�� �� : ");
		int y = stdIn.nextInt();
		
		System.out.print("z�� �� : ");
		int z = stdIn.nextInt();
		
		System.out.println("x, y�� �ִ밪�� " + max(x, y) + "�Դϴ�.");
		
		System.out.println("x, y, z�� �ִ밪�� " + max(x, y, z) + "�Դϴ�.");
		
		stdIn.close();
	}

}
