import java.util.Scanner;

public class Season01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		do {
			System.out.print("������ ǥ���մϴ�.\n�� �� �Դϱ�? ");
			int month = stdIn.nextInt();
			
			if(month>=3 && month<=5) {
				System.out.println("�̰��� ���Դϴ�.");
			} else if(month>=6 && month<=8) {
				System.out.println("�̰��� �����Դϴ�.");
			} else if(month>=9 && month<=11) {
				System.out.println("�̰��� �����Դϴ�.");
			} else if(month==12 || month==1 || month==2) {
				System.out.println("�̰��� �ܿ��Դϴ�.");
			}
			
			System.out.print("�ٽ� �� ��? 1--Yes / 0--No : ");
			retry = stdIn.nextInt();
		} while(retry == 1);
		
		System.out.println("���α׷��� �����Ͽ����ϴ�.");
	}

}
