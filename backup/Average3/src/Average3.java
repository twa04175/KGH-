import java.util.Scanner;

public class Average3 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
			
		
		System.out.println("������ x�� y�� ��հ��� ����մϴ�.");
		System.out.print("x�� �� : ");
		int x = stdIn.nextInt();
		
		System.out.print("y�� �� : ");
		int y = stdIn.nextInt();
		
//		double ave = (double)(x + y) / 2;
//		double ave = (x + y) / 2;
		double ave = (x + y) / 2.0;
		System.out.println("x�� y�� ��հ��� " + ave + "�Դϴ�.");
		
		stdIn.close();		
	}
 
}
