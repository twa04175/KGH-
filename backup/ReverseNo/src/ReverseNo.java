import java.util.Scanner;

public class ReverseNo {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� �������� �������� ǥ���մϴ�.");
		
		int x; 
		do {
			System.out.print("���� ������ : ");
			x = stdIn.nextInt();
		} while(x <= 0);
		
		System.out.print("�Ųٷ� ������  ");
		while(x > 0) {
			System.out.print(x % 10);
			x /= 10;
		}
		
		stdIn.close();
	}

}
