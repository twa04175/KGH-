import java.util.Scanner;

public class DayArrayError {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] wd = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.print("��¥�� �� ��? : ");
		int n = stdIn.nextInt();
		
		Day[] a = new Day[n];
		
		for(int i=0; i<a.length; i++) {
//			a[i].set(2017, 10, 15); // new�� ���� ��ü�� �������� �ʾҴ�.
			a[i] = new Day(2017, 10, 15);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = "
					+ a[i].getYear() + "�� "
					+ a[i].getMonth() + "�� "
					+ a[i].getDate() + "��("
					+ wd[a[i].dayOfWeek()] + ")");
		}
		
		stdIn.close();
	}
}
