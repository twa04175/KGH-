import java.util.Scanner;

public class SumContinue {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ ������ ����մϴ�.");
		System.out.print("������ ������? : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("���� : ");
			int t = stdIn.nextInt();
			
			if(t < 0) {
				System.out.println("������ ������ �ʽ��ϴ�.");
				continue;
			}
			sum += t;
		}
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		
		stdIn.close();
	}

}
