import java.util.Scanner;

public class IsoscelesTriangleLB {
	
	static void putStars(int n) {
		while(n-- > 0) {
			System.out.print("* ");
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�.");
		System.out.print("�� �� : ");
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			putStars(i);
			System.out.println();
		}
		
		stdIn.close();
	}

}
