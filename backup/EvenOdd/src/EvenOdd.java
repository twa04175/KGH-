import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = stdIn.nextInt();
		
		if(n > 0) {
			if(n%2 == 0) {
				System.out.println("�� ���� ¦���Դϴ�.");
			} else {
				System.out.println("�� ���� Ȧ���Դϴ�.");
			}
		} else {
			System.out.print("����� �ƴ� ���� �Է��߽��ϴ�.");
		}
		
//		if(n > 0) ;
//			System.out.println("�� ���� ����Դϴ�.");
		
		stdIn.close();
	}

}
