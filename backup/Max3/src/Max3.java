import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		// �� �� �� �ִ밪 ���ϱ�
		int max = a;
		if(b > max) {
			max = b;
		}
			
		if(c > max) {
			max = c;
		}
		
		System.out.println("�ִ밪�� " + max + "�Դϴ�");
		
		// �� �� �� �ּҰ� ���ϱ�
		int min = a;
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
		
		stdIn.close();
	}

}
