import java.util.Scanner;

public class CarTester03 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ڵ����� �����͸� �Է��Ͻÿ�.");
		System.out.print("�̸��� : ");
		String name = stdIn.nextLine();
		System.out.print("�ʺ�� : ");
		int width = stdIn.nextInt();
		System.out.print("���̴� : ");
		int height = stdIn.nextInt();
		System.out.print("���̴� : ");
		int length = stdIn.nextInt();
		System.out.print("���ᷮ�� : ");
		double fuel = stdIn.nextDouble();
		
		System.out.print("���Կ��� : ");
		int y = stdIn.nextInt();
		System.out.print("���Կ� : ");
		int m = stdIn.nextInt();
		System.out.print("������ : ");
		int d = stdIn.nextInt();
		
		Car car2 = new Car(name, width, height, length, fuel, new Day(y, m, d));
		
		car2.putSpec();
		
		System.out.println(car2.getPurchaseDay());
	}

}
