import java.util.Scanner;

public class SumBreak2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ ������ ����մϴ�.");
		System.out.print("������ ������? : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("���� : ");
			int t = stdIn.nextInt();
			
			if(sum + t > 1000) {
				System.out.println("�հ谡 1000�� �Ѿ����ϴ�.");
				System.out.println("������ ��ġ�� �����մϴ�.");
				break;
			}
			sum += t;
		}
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		
		stdIn.close();
	}

}
