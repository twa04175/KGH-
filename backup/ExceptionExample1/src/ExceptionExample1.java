import java.util.Scanner;

public class ExceptionExample1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("�������� �Է��Ͻÿ�: ");
		dividend = sc.nextInt();
		
		System.out.print("�������� �Է��Ͻÿ�: ");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend + "�� " + divisor + "�� ������ ���� " 
					+ dividend/divisor + "�Դϴ�.");
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			System.err.println("0���� ���� �� �����ϴ�.");
		}
		
		sc.close();
	}

}
