import java.util.Scanner;

public class DayTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] wd = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.println("������ ������� �Է��Ͻÿ�.");
		System.out.print("�� : ");
		int y = stdIn.nextInt();
		System.out.print("�� : ");
		int m = stdIn.nextInt();
		System.out.print("�� : ");
		int d = stdIn.nextInt();
		
		Day birthday = new Day(y, m, d);
		
		System.out.println("����� ���� " 
				+ birthday.getYear() + "�� "
				+ birthday.getMonth() + "�� "
				+ birthday.getDate() + "���� "
				+ wd[birthday.dayOfWeek()] + "�����Դϴ�.");
		
		stdIn.close();
	}

}
