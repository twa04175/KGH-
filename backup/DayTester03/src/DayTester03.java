import java.util.Scanner;

public class DayTester03 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int y, m, d;
		
		System.out.print("��� : ");
		y = stdIn.nextInt();
		
		System.out.println("�� �ش� ����" + (Day.isLeap(y) ? "�Դϴ�." : "�� �ƴմϴ�."));
		
		System.out.println("��¥�� �Է��Ͻÿ�.");
		System.out.print("�� : ");
		y = stdIn.nextInt();
		System.out.print("�� : ");
		m = stdIn.nextInt();
		System.out.print("�� : ");
		d = stdIn.nextInt();
		
		Day a = new Day(y, m, d);
		System.out.println(a.getYear()+"���� ����" + (a.isLeap() ? "�Դϴ�." : "�� �ƴմϴ�."));
		
		stdIn.close();
		
	}

}
