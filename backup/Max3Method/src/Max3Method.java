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
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		System.out.println("�ִ밪�� " + max(a, b, c) + "�Դϴ�.");
		System.out.println("a�� b �߿��� �ִ밪�� " + max(a, b) + "�Դϴ�.");
		//System.out.println("�ִ밪�� " + max(10, 20, 30) + "�Դϴ�.");
		
		stdIn.close();
	}
}
