import java.util.Scanner;

public class Absolute {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		a: {
			System.out.print("���� ���� : ");
			int t = stdIn.nextInt();
			
			if(t >= 0) {
				break a;
			}
			
			t = -t;
			System.out.println("���밪�� " + t + "�Դϴ�.");
		}
		System.out.println("a ���̺� ���Դϴ�.");
	}

}
