import java.util.Scanner;

public class IsoscelesTriangle03 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����� ������ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�� �� : ");
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=n+1-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
