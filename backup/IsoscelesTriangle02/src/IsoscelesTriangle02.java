import java.util.Scanner;

public class IsoscelesTriangle02 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�»��� ������ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�� �� : ");
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n+1-i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
