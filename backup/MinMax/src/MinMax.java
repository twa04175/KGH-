import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		
		int max, min;
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		System.out.println("�� �߿� ū ���� " + max + "�Դϴ�.");
		System.out.println("�� �߿� ���� ���� " + min + "�Դϴ�.");
		
		stdIn.close();
	}

}
