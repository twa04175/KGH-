import java.util.Scanner;

public class SumBreak1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ ������ ����մϴ�.");
		System.out.print("������ ������? : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("���� (0�̸� ����) : ");
			int t = stdIn.nextInt();
			
			if(t == 0) {
				break;
			}
			sum += t;
		}
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		
		stdIn.close();
	}

}
