import java.util.Scanner;

public class CH02_06 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ﰢ���� ������ ���մϴ�.");
		
		System.out.print("�غ� : ");
		double width = stdIn.nextDouble();
		
		System.out.print("���� : ");
		double height = stdIn.nextDouble();
		
		double area = (width*height)/2;
		
		System.out.println("������ " + area + "�Դϴ�.");
		
		stdIn.close();
	}

}
