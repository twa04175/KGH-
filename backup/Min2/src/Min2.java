import java.util.Scanner;

public class Min2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		
		// �� �߿� ���� ���� ���ϱ�
/*		int min;
		if(a < b) {
			min = a;
		} else {
			min = b;
		}*/
		
		int min = a < b ? a : b;
		System.out.println("���� ���� ���� " + min + "�Դϴ�.");
		
		// �� �߿� ū ���� ���ϱ�
/*		int max;
		if(a > b) {
			max = a;
		} else {
			max = b;
		}*/
		
		int max = a > b ? a : b;
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		stdIn.close();
	}

}
