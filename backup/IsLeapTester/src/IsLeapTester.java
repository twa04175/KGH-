import java.util.Scanner;

public class IsLeapTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� : ");
		int y = stdIn.nextInt();
		
		//Day day1 = new Day(y);
		//System.out.println("�� ������ ����" + (day1.isLeap() ? "�Դϴ�." : "�� �ƴմϴ�."));
		
		// ��ȸ�� �ν��Ͻ�
		System.out.println("�� ������ ����" + (new Day(y).isLeap() ? "�Դϴ�." : "�� �ƴմϴ�."));
		
		stdIn.close();		
	}

}
