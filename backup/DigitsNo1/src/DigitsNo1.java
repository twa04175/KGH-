import java.util.Scanner;

public class DigitsNo1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = stdIn.nextInt();
		
		if(n == 0) {
			System.out.println("0�Դϴ�.");
		} else if(n >= -9 && n <= 9) {
			System.out.println("�� �ڸ����Դϴ�.");
		} else {
			System.out.println("�� �ڸ��� �̻��Դϴ�.");
		}
		
		stdIn.close();
	}

}
