import java.util.Scanner;

public class CountDown1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ī��Ʈ�ٿ��� �����մϴ�.");
		
		int x;
		
		do {
			System.out.print("���� ������ : ");
			x = stdIn.nextInt();
		} while(x <= 0);
		
		while(x >= 0) {
			System.out.println(x--);			
			//x--;
		}
		
		stdIn.close();
	}

}
