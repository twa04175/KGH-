import java.util.Scanner;

public class PrimeNumber02 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�Ҽ��� ���� : ");
		int n = stdIn.nextInt();
		int count = 0;
		
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				if(i == j) {
					System.out.print(i + " ");
					count++;
				}
				if(i%j == 0) {
					break;
				}
			}
		}
		
		System.out.println("\n2���� " + n + "������ �Ҽ��� ���� : " + count);
		
		stdIn.close();
	}

}
