import java.util.Scanner;

public class CarTester2 {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ڵ����� �����͸� �Է��Ͻÿ�.");
		System.out.print("�̸��� : ");
		String name = stdIn.nextLine();
		System.out.print("�� �ʺ�� : ");
		int width = stdIn.nextInt();
		System.out.print("�� ���̴� : ");
		int height = stdIn.nextInt();
		System.out.print("�� ���̴� : ");
		int length = stdIn.nextInt();
		System.out.print("���ᷮ�� : ");
		double fuel = stdIn.nextDouble();
		
		Car myCar = new Car(name, width, height, length, fuel);
		
		while(true) {
			System.out.println("���� ��ġ (" + myCar.getX() + ", " + myCar.getY() 
				+ ") ���� ���� " + myCar.getFuel());
			
			System.out.print("�̵��մϱ�? [0-No/1-Yes] : ");
			if(stdIn.nextInt() == 0) {
				break;
			}
			
			System.out.print("x������ �̵��Ÿ� : ");
			double dx = stdIn.nextDouble();
			System.out.print("y������ �̵��Ÿ� : ");
			double dy = stdIn.nextDouble();
			
			if(!myCar.move(dx, dy)) {
				System.out.println("���ᰡ �����մϴ�.");
			}
		}
		System.out.println(name + "��(��) �̵��� ������ϴ�.");
		
		stdIn.close();
	}

}
