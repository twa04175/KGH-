import java.util.Scanner;

public class Zero {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = stdIn.nextInt();
		
		if(!(n != 0)) { // n == 0
			System.out.println("�� ���� 0�Դϴ�.");
		} else {
			System.out.println("�� ���� 0�� �ƴմϴ�.");
		}
		
		stdIn.close();
	}

}
