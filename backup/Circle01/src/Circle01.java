import java.util.Scanner;

public class Circle01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		double r = stdIn.nextDouble();
		
		System.out.println("���ѷ��� ���̴� " + 2 * Math.PI * r + "�Դϴ�.");
		System.out.println("������ " + Math.PI * r * r + "�Դϴ�.");
	}

}
