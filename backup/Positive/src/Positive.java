import java.util.Scanner;

public class Positive {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = stdIn.nextInt();
		
		if(n > 0) {
			System.out.println(n + "�� ����Դϴ�.");
		} else if(n < 0) {
			System.out.println(n + "�� �����Դϴ�.");
		} else/* if(n == 0)*/ {
			System.out.print(n + "�Դϴ�.");
		}
		
		stdIn.close();
	}

}
